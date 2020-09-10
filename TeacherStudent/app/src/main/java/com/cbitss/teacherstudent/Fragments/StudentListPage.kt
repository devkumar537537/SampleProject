package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.adapters.StudentList_Adapters
import com.cbitss.teacherstudent.modleclasses.StudentdataClass
import kotlinx.android.synthetic.main.fragment_student_list_page.*

class StudentListPage : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_list_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        student_list_recyclerview.apply {
            this.layoutManager = LinearLayoutManager(view.context)
            var studentlistadapter = StudentList_Adapters(StudentdataClass.modleclasslist,view)
            this.adapter = studentlistadapter
        }


    }
}