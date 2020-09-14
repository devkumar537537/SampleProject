package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.adapters.StudentListAdapters
import com.cbitss.teacherstudent.modleclasses.StudentdataClass
import kotlinx.android.synthetic.main.fragment_student_list_page.*

class StudentListPage : Fragment() {
lateinit var usertype:String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        usertype =arguments!!.getString("usertype").toString()
        return inflater.inflate(R.layout.fragment_student_list_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        student_list_recyclerview.apply {
            this.layoutManager = LinearLayoutManager(view.context)
            var studentlistadapter = StudentListAdapters(StudentdataClass.modleclasslist,view,usertype!!,activity!!)
            this.adapter = studentlistadapter
        }


    }
}