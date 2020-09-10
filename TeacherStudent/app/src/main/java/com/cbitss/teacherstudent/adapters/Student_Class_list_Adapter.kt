package com.cbitss.teacherstudent.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.modleclasses.Sutdent_class_list_Model
import de.hdodenhof.circleimageview.CircleImageView

class Student_Class_list_Adapter (var studentclasslist:MutableList<Sutdent_class_list_Model>,var view:View): RecyclerView.Adapter<Student_Class_list_Adapter.MyViewhodler>() {

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
    }

    override fun getItemCount(): Int {
       return studentclasslist.size
    }
}