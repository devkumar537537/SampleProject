package com.cbitss.teacherstudent.adapters

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView
import com.cbitss.teacherstudent.Fragments.TrainerProfile
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.modleclasses.TeacherListData

@Suppress("DEPRECATION")
class TeacherlistAdapter(val teacherlist:MutableList<TeacherListData>, val view:View, var mutableMap: MutableMap<String,String>, var activity: Activity): RecyclerView.Adapter<TeacherlistAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemview: View):RecyclerView.ViewHolder(itemview)
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.student_items,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var listdata = teacherlist.get(position)
        holder.itemView.findViewById<TextView>(R.id.student_name).text = listdata.teacher_name
        holder.itemView.findViewById<TextView>(R.id.data_of_joining).text =listdata.teacher_skills
        holder.itemView.findViewById<ImageView>(R.id.profile_image).setImageResource(R.drawable.arebic)
        holder.itemView.setOnClickListener {
           var bundle  = Bundle()
            bundle.putString("usertype",mutableMap.get("usertype"))
            bundle.putString("studentId",mutableMap.get("studentId"))
            bundle.putString("courseName",mutableMap.get("courseName"))
            bundle.putString("teacher_Id",listdata.teacher_id)
            var fragment = TrainerProfile()
            fragment.arguments = bundle
            var fragmentmanager = activity.fragmentManager
            var fragmentTransction = fragmentmanager.beginTransaction()
            fragmentTransction.replace(R.id.fragment_container,fragment).commit()
        }
    }

    override fun getItemCount(): Int {
return teacherlist.size
    }
}