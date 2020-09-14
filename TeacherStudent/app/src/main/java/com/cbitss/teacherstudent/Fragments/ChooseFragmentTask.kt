package com.cbitss.teacherstudent.Fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cbitss.teacherstudent.R
import kotlinx.android.synthetic.main.fragment_choose_task.*


class ChooseFragmentTask : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_choose_task, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        assign_class_move_btn.setOnClickListener {
         val fragmentManager = fragmentManager
            var fragment = StudentListPage()
            val admin = "Admin"

            val bundle = Bundle()
            bundle.putString("usertype",admin)
            fragment.arguments = bundle
            val fragmentTranction = fragmentManager!!.beginTransaction()
            fragmentTranction.replace(R.id.fragment_container, fragment).commit();
        }
    }


}