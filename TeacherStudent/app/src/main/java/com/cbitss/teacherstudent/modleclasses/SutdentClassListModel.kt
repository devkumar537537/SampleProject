package com.cbitss.teacherstudent.modleclasses

class SutdentClassListModel(
    val student_register_id :String,
    val teacher_register_id:String,
    val course_name:String,
    val timeing_of_class:String
) {
    companion object{
        var student_classList_data: MutableList<SutdentClassListModel> = arrayListOf(
            SutdentClassListModel("2","3","Android Developement","22 July 2020"),
            SutdentClassListModel("2","3","Web Development","23 Sep 2020"),
            SutdentClassListModel("2","3","Python Development","25 August 2020"),
            SutdentClassListModel("2","3","Android Developement","22 June 2020"),
        )
    }
}