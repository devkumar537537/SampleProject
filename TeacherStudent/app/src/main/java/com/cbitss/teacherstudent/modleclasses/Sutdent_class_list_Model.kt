package com.cbitss.teacherstudent.modleclasses

class Sutdent_class_list_Model(
    val student_register_id :String,
    val teacher_register_id:String,
    val course_name:String,
    val timeing_of_class:String
) {
    companion object{
        var student_class_list_data: MutableList<Sutdent_class_list_Model> = arrayListOf(
            Sutdent_class_list_Model("2","3","Android Developement","22 July 2020"),
            Sutdent_class_list_Model("2","3","Web Development","23 Sep 2020"),
            Sutdent_class_list_Model("2","3","Python Development","25 August 2020"),
            Sutdent_class_list_Model("2","3","Android Developement","22 June 2020"),
        )
    }
}