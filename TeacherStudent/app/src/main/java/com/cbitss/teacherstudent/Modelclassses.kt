package com.cbitss.teacherstudent



data class Modelclassses(
     var student_name: String,
     var date_fo_joining:String,
     var email:String,
     var course_Name:String,
     var password:String,
     var timing:String,
     var profile_url:Int
) {
    val modleclasslist:MutableList<Modelclassses> = arrayListOf(
        Modelclassses("Rahoul","20 March 2020","dev91233@gmail.com","Android Developemen", "123456", "9 am to 10 am",R.drawable.profile),
        Modelclassses("Rahoul","20 March 2020","dev91233@gmail.com","Android Developemen", "123456", "9 am to 10 am",R.drawable.profile),
    )
}