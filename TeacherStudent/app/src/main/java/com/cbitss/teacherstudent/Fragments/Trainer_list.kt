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


class Trainer_list : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trainer_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        trainer_list_recyclerview.apply {
            this.layoutManager = LinearLayoutManager(view.context)
            var adapters = TeacherlistAdapter(TeacherListData.teacherdata,view)
            this.adapter = adapters
        }
    }
}