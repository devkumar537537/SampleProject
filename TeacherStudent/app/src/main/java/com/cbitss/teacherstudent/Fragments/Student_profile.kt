package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.adapters.Student_Class_list_Adapter
import com.cbitss.teacherstudent.modleclasses.Sutdent_class_list_Model
import kotlinx.android.synthetic.main.fragment_student_profile.*


class Student_profile : Fragment() {

    
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        student_class_list_recyclerview.apply {
            this.layoutManager = LinearLayoutManager(view.context)
            var studentlistadapter = Student_Class_list_Adapter(Sutdent_class_list_Model.student_class_list_data,view)
            this.adapter = studentlistadapter
        }

        assign_class_btn.setOnClickListener {
            view.findNavController().navigate(R.id.action_student_profile2_to_trainer_list)
        }
    }
}