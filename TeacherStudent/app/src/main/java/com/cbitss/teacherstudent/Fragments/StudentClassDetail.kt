package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cbitss.teacherstudent.R


@Suppress("DEPRECATION")
class StudentClassDetail : android.app.Fragment() {
lateinit var teacherId:String
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        teacherId = arguments.getString("teacherId").toString()
        return inflater.inflate(R.layout.fragment_student_class__detail, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}