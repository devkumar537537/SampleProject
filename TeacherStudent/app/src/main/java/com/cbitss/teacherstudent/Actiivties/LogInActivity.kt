package com.cbitss.teacherstudent.Actiivties

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.cbitss.teacherstudent.R
import kotlinx.android.synthetic.main.activity_login.*

class LogInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        teacher_text.setOnClickListener {
            teacher_text.visibility = View.GONE
            student_text.visibility = View.VISIBLE
            student_login_btn.visibility = View.GONE
            teacher_login_btn.visibility = View.VISIBLE
            admin_login_btn.visibility = View.GONE
        }
   student_text.setOnClickListener {
       teacher_text.visibility = View.VISIBLE
       student_text.visibility = View.GONE
       student_login_btn.visibility = View.VISIBLE
       teacher_login_btn.visibility = View.GONE
   }
        admint_text.setOnClickListener {
            prev_text.visibility = View.VISIBLE
            admint_text.visibility = View.GONE
            admin_login_btn.visibility = View.VISIBLE
            if(student_login_btn.visibility == View.VISIBLE || teacher_login_btn.visibility == View.VISIBLE)
            {
                student_login_btn.visibility = View.GONE
                teacher_login_btn.visibility = View.GONE
            }
        }
        prev_text.setOnClickListener {
            prev_text.visibility = View.GONE
            admint_text.visibility = View.VISIBLE
            student_login_btn.visibility = View.VISIBLE
            student_text.visibility = View.GONE
            teacher_text.visibility = View.VISIBLE
            admin_login_btn.visibility = View.GONE


        }
        register__btn.setOnClickListener {
            register__btn.visibility = View.GONE
            registe_as_student_btn.visibility = View.VISIBLE
            register_as_teacher_btn.visibility = View.VISIBLE
        }

        registe_as_student_btn.setOnClickListener {

            register__btn.visibility = View.VISIBLE
            register_as_teacher_btn.visibility = View.GONE
            registe_as_student_btn.visibility = View.GONE
            val intent = Intent(applicationContext,RegisterAcitivity::class.java)
            intent.putExtra("Usertype","Student")
            startActivity(intent)
        }
        register_as_teacher_btn.setOnClickListener {
            register__btn.visibility = View.VISIBLE
            registe_as_student_btn.visibility = View.GONE
            register_as_teacher_btn.visibility = View.GONE

            val intent = Intent(applicationContext,RegisterAcitivity::class.java)
            intent.putExtra("Usertype","Teacher")
            startActivity(intent)
        }
teacher_login_btn.setOnClickListener {
    val intent = Intent(applicationContext,TeacherHome::class.java)
    intent.putExtra("Usertype","Teacher")
    startActivity(intent)
}
        student_login_btn.setOnClickListener {
            val intent = Intent(applicationContext,StudentHome::class.java)
            intent.putExtra("userType","Student")
            startActivity(intent)
        }
        admin_login_btn.setOnClickListener {
            val intent = Intent(applicationContext,AdmintHome::class.java)
            startActivity(intent)
        }

    }
}