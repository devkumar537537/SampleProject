package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.adapters.StudentClasslistAdapter
import com.cbitss.teacherstudent.adapters.TeacherClassListAdapter
import com.cbitss.teacherstudent.modleclasses.SutdentClassListModel
import com.cbitss.teacherstudent.modleclasses.TeacherClassList
import kotlinx.android.synthetic.main.fragment_trainer_profile.*


@Suppress("DEPRECATION")
class TrainerProfile :android.app.Fragment() {
lateinit var coursName :String
    lateinit var Student_Id:String
    lateinit var teacher_Id:String
    lateinit var usertype:String

var isEditVisisbel = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        usertype = arguments.getString("usertype").toString()
        coursName = arguments.getString("courseName").toString()
        Student_Id = arguments.getString("studentId").toString()
        teacher_Id = arguments.getString("teacher_Id").toString()
        return inflater.inflate(R.layout.fragment_trainer_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        if(usertype == "Admin")
        {
            timing_teacher_layout.visibility = View.VISIBLE
        }else
        {
            timing_teacher_layout.visibility = View.GONE
        }
        assign_class_teacher_btn.setOnClickListener {
              var timing_value = "9 am to 10 pm"

            Toast.makeText(view.context,"This will register The class",Toast.LENGTH_LONG).show()
        }
         teacher_class_list_recyclerview.apply {
             this.layoutManager = LinearLayoutManager(view.context)
             var teacherlistadapter = TeacherClassListAdapter(TeacherClassList.mutableClassList,view.context,usertype,activity)
             this.adapter = teacherlistadapter



         }
    }
}