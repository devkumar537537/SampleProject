package com.cbitss.teacherstudent.Actiivties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cbitss.teacherstudent.R
import kotlinx.android.synthetic.main.activity_register_acitivity.*

class RegisterAcitivity : AppCompatActivity() {
    var IstypeofUser = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_acitivity)
        var typeofuser = intent.getStringExtra("Usertype")
        if(typeofuser == "Teacher")
        {
            type_of_register_text.text = typeofuser
            teacher_skill_layout.visibility = View.VISIBLE
            student_course_layout.visibility = View.GONE
        }

    }
}