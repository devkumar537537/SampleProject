package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.adapters.TeacherlistAdapter
import com.cbitss.teacherstudent.modleclasses.TeacherListData
import kotlinx.android.synthetic.main.fragment_trainer_list.*


@Suppress("DEPRECATION")
class TrainerList : android.app.Fragment() {
lateinit var usertype :String
    lateinit var Student_id :String
    lateinit var courseName :String
var mutableMap: MutableMap<String,String> = HashMap()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        usertype =arguments!!.getString("usertype").toString()
        Student_id = arguments!!.getString("studentId").toString()
        courseName = arguments!!.getString("courseName").toString()

        mutableMap.put("usertype",usertype)
        mutableMap.put("studentId",Student_id)
        mutableMap.put("courseName",courseName)

        return inflater.inflate(R.layout.fragment_trainer_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        trainer_list_recyclerview.apply {
            this.layoutManager = LinearLayoutManager(view.context)
            var adapters = TeacherlistAdapter(TeacherListData.teacherdata,view,mutableMap,activity)
            this.adapter = adapters
        }
    }
}