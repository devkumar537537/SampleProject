package com.cbitss.teacherstudent.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.LinearLayoutManager
import com.cbitss.teacherstudent.R
import com.cbitss.teacherstudent.adapters.StudentClasslistAdapter
import com.cbitss.teacherstudent.modleclasses.SutdentClassListModel
import kotlinx.android.synthetic.main.fragment_student_profile.*


@Suppress("DEPRECATION")
class StudentProfile :android.app.Fragment() {

lateinit var usertype:String
var StudentId = "134324"
    var courseName = "Adnroid Development"
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        usertype =arguments!!.getString("usertype").toString()
        return inflater.inflate(R.layout.fragment_student_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        if(usertype == "Admin")
        {
            profile_assign_btn_layout.visibility = View.VISIBLE
        }else
        {
            profile_assign_btn_layout.visibility = View.GONE
        }

        student_class_list_recyclerview.apply {
            this.layoutManager = LinearLayoutManager(view.context)
            var studentlistadapter = StudentClasslistAdapter(SutdentClassListModel.student_classList_data,view,usertype!!,activity )
            this.adapter = studentlistadapter
        }

        assign_class_btn.setOnClickListener {

           var bundle = Bundle()
            bundle.putString("studentId",StudentId)
            bundle.putString("courseName",courseName)
            bundle.putString("usertype",usertype)

            var fragment = TrainerList()
            fragment.arguments = bundle
            var fragmentmanager = activity.fragmentManager
            var fragmentTransaction = fragmentmanager.beginTransaction().replace(R.id.fragment_container,fragment).commit()
        }
    }
}