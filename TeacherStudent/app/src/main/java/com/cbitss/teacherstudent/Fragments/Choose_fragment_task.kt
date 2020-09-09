package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.cbitss.teacherstudent.R
import kotlinx.android.synthetic.main.fragment_choose_task.*


class Choose_fragment_task : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_choose_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        add_student_move_btn.setOnClickListener {
            view.findNavController().navigate(R.id.action_choose_fragment_task_to_add_Student)
        }
        add_teacher_move_btn.setOnClickListener {
            view.findNavController().navigate(R.id.action_choose_fragment_task_to_add_Trainer)
        }
    }


}