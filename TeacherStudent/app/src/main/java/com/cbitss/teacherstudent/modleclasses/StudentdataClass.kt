package com.cbitss.teacherstudent.modleclasses

import com.cbitss.teacherstudent.R


data class StudentdataClass(
     var student_name: String,
     var date_fo_joining:String,
     var email:String,
     var course_Name:String,
     var password:String,
     var timing:String,
     var profile_url:Int
) {
    companion object{
        val modleclasslist:MutableList<StudentdataClass> = arrayListOf(
            StudentdataClass("Rahoul","20 March 2020","dev91233@gmail.com","Android Developemen", "123456", "9 am to 10 am",
                R.drawable.profile
            ),
            StudentdataClass("Rahoul","20 March 2020","dev91233@gmail.com","Android Developemen", "123456", "9 am to 10 am",
                R.drawable.profile
            ),
        )


}
}