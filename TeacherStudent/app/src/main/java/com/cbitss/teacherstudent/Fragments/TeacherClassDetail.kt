package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cbitss.teacherstudent.R


@Suppress("DEPRECATION")
class TeacherClassDetail : android.app.Fragment() {
lateinit var usertype:String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        usertype = arguments.getString("StudentId").toString()
        return inflater.inflate(R.layout.fragment_teacher_class__detail, container, false)
    }


}