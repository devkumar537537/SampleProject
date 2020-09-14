package com.cbitss.teacherstudent.Actiivties

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.cbitss.teacherstudent.Fragments.ChooseFragmentTask
import com.cbitss.teacherstudent.R

class AdmintHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_admint_home)

        val fragmentManager = supportFragmentManager
        val fragmenttraction = fragmentManager.beginTransaction().add(R.id.fragment_container,ChooseFragmentTask())
        fragmenttraction.commit()

    }
}