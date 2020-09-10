package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.cbitss.teacherstudent.R
import kotlinx.android.synthetic.main.fragment_trainer_profile.*


class Trainer_profile : Fragment() {

var isEditVisisbel = false
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_trainer_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        assign_class_teacher_btn.setOnClickListener {
            if(isEditVisisbel == false)
            {
                isEditVisisbel = true
                timing_layout.visibility = View.VISIBLE
            }else
            {
                isEditVisisbel = false
                timing_layout.visibility = View.GONE

            }
        }
    }
}