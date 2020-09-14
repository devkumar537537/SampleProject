package com.cbitss.teacherstudent.adapters

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


import androidx.recyclerview.widget.RecyclerView
import com.cbitss.teacherstudent.Fragments.StudentProfile
import com.cbitss.teacherstudent.modleclasses.StudentdataClass
import com.cbitss.teacherstudent.R
import de.hdodenhof.circleimageview.CircleImageView

@Suppress("DEPRECATION")
class StudentListAdapters(var studentlist: MutableList<StudentdataClass>, var view:View, var usertype:String, var actvity: Activity) : RecyclerView.Adapter<StudentListAdapters.MyViewHolder>() {

    inner class MyViewHolder(itemview: View): RecyclerView.ViewHolder(itemview)
    {
        lateinit var studeent_profile:CircleImageView
        lateinit var sutdent_name: TextView
        lateinit var studnet_data_of_joining:TextView
        init {
            studeent_profile = itemview.findViewById(R.id.profile_image)
            sutdent_name = itemview.findViewById(R.id.student_name)
            studnet_data_of_joining = itemview.findViewById(R.id.data_of_joining)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.student_items,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var studentdata:StudentdataClass = studentlist.get(position)
       holder.sutdent_name.text = studentdata.student_name
        holder.studnet_data_of_joining.text = studentdata.date_fo_joining
        holder.studeent_profile.setImageResource(studentdata.profile_url)
        holder.itemView.setOnClickListener {
        var fragment = StudentProfile()
            var bundle = Bundle()
            bundle.putString("usertype",usertype)
            fragment.arguments = bundle
            var fraagmentmanager =actvity.getFragmentManager()
            var fragmenttraction = fraagmentmanager.beginTransaction()
            fragmenttraction.replace(R.id.fragment_container,fragment)
            fragmenttraction.commit()

        }
    }

    override fun getItemCount(): Int {
      return studentlist.size
    }
}