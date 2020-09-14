package com.cbitss.teacherstudent.adapters

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.cbitss.teacherstudent.Fragments.StudentClassDetail
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.modleclasses.SutdentClassListModel
import de.hdodenhof.circleimageview.CircleImageView
import kotlinx.android.synthetic.main.fragment_student_profile.view.*

@Suppress("DEPRECATION")
class StudentClasslistAdapter(
    var studentclasslist: MutableList<SutdentClassListModel>,
    var view: View,
    var  usertype: String,
    var activity: Activity
): RecyclerView.Adapter<StudentClasslistAdapter.MyViewhodler>() {

 inner class MyViewhodler(itemview: View): RecyclerView.ViewHolder(itemview){

 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewhodler {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.student_items,parent,false)
        return MyViewhodler(view)
    }

    override fun onBindViewHolder(holder: MyViewhodler, position: Int) {
        var listdata = studentclasslist.get(position)
        holder.itemView.findViewById<TextView>(R.id.student_name).text = listdata.course_name
        holder.itemView.findViewById<TextView>(R.id.data_of_joining).text =listdata.timeing_of_class
        holder.itemView.findViewById<CircleImageView>(R.id.profile_image).visibility = View.GONE
        if(usertype == "Admin")
        {
            Toast.makeText(view.context,"timing is ${listdata.timeing_of_class}",Toast.LENGTH_SHORT).show()
        }else
        {
            holder.itemView.setOnClickListener {
                var bundle = Bundle()
                bundle.putString("teacherId",listdata.teacher_register_id)
                var fragment = StudentClassDetail()
                fragment.arguments = bundle
                var fragmentManager = activity.fragmentManager
                var fragmenttransction  = fragmentManager.beginTransaction().replace(R.id.student_fragment_Container,fragment).commit()

        }

    }


    }

    override fun getItemCount(): Int {
       return studentclasslist.size
    }
}