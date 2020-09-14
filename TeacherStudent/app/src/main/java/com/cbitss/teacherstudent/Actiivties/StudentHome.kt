package com.cbitss.teacherstudent.Actiivties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cbitss.teacherstudent.Fragments.StudentProfile

import com.cbitss.teacherstudent.R

@Suppress("DEPRECATION")
class StudentHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_home)

         val usertype:String = "Student"
        val bundle = Bundle()
        bundle.putString("usertype",usertype)
        val fragment = StudentProfile()
        fragment.arguments = bundle
        val fragmentManager = getFragmentManager()
       val fragmentransction = fragmentManager.beginTransaction()
        fragmentransction.replace(R.id.student_fragment_Container,fragment).commit()



    }
}