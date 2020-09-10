package com.cbitss.teacherstudent.Actiivties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import com.cbitss.teacherstudent.R

class StudentHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_home)
        var argument = intent.getStringExtra("UserType")
        val navController = findNavController(R.id.student_profile4)
        val bundle = Bundle()
        bundle.putString("userType",argument)
        navController.setGraph(navController.graph,bundle)
    }
}