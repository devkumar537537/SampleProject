package com.cbitss.teacherstudent.adapters

import android.app.Activity
import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.cbitss.teacherstudent.Fragments.TeacherClassDetail
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.modleclasses.TeacherClassList
import de.hdodenhof.circleimageview.CircleImageView

@Suppress("DEPRECATION")
class TeacherClassListAdapter(var teacherclasslist:MutableList<TeacherClassList>, var context: Context, var usertype:String,var activity: Activity) : RecyclerView.Adapter<TeacherClassListAdapter.MyViewhodler>() {
    inner class MyViewhodler(itemview: View): RecyclerView.ViewHolder(itemview){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewhodler {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.student_items,parent,false)
        return MyViewhodler(view)
    }

    override fun onBindViewHolder(holder: MyViewhodler, position: Int) {
        var listdata = teacherclasslist.get(position)
        holder.itemView.findViewById<TextView>(R.id.student_name).text = listdata.courseName
        holder.itemView.findViewById<TextView>(R.id.data_of_joining).text =listdata.timing
        holder.itemView.findViewById<CircleImageView>(R.id.profile_image).visibility = View.GONE
        if(usertype == "Admin")
        {
            Toast.makeText(context,"these are the class",Toast.LENGTH_LONG).show()
        }else
        {
           holder.itemView.setOnClickListener {
               var bundle = Bundle()
               bundle.putString("StudentId",listdata.studentId)
               var fragment = TeacherClassDetail()
               fragment.arguments = bundle
               var fragmentManager = activity.fragmentManager
               var fragmentTransaction = fragmentManager.beginTransaction()
               fragmentTransaction.replace(R.id.teacher_fragment_container,fragment).commit()
           }
        }
    }

    override fun getItemCount(): Int {
        return teacherclasslist.size
    }
}