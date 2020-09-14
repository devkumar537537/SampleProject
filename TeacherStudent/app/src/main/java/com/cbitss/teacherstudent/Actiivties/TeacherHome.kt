package com.cbitss.teacherstudent.Actiivties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.cbitss.teacherstudent.Fragments.TrainerProfile
import com.cbitss.teacherstudent.R

@Suppress("DEPRECATION")
class TeacherHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teacher_home)

        var usertype:String = "Teacher"
        var bundle = Bundle()
        bundle.putString("usertype",usertype)
        var fragment = TrainerProfile()
        fragment.arguments = bundle
        var fragmentmanager = getFragmentManager()
        var fragmenttransction = fragmentmanager.beginTransaction()
        fragmenttransction.replace(R.id.teacher_fragment_container,fragment).commit()

    }
}