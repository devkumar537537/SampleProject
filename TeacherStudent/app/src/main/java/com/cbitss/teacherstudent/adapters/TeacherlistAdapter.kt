package com.cbitss.teacherstudent.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.modleclasses.TeacherListData

class TeacherlistAdapter(val teacherlist:MutableList<TeacherListData>,val view:View): RecyclerView.Adapter<TeacherlistAdapter.MyViewHolder>() {
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
            view.findNavController().navigate(R.id.action_trainer_list_to_trainer_profile)
        }
    }

    override fun getItemCount(): Int {
return teacherlist.size
    }
}