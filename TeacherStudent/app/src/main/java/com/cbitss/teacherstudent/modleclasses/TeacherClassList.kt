package com.cbitss.teacherstudent.modleclasses

class TeacherClassList(
    var teacherId:String,
    var studentId:String,
    var courseName:String,
    var timing:String,
    var nodeId:String,

) {
    companion object{
        var mutableClassList:MutableList<TeacherClassList> = mutableListOf(
            TeacherClassList("123","321","Android Developement","9 am to 10 am","nodeId"),
            TeacherClassList("123","321","Android Developement","9 am to 10 am","nodeId"),
            TeacherClassList("123","321","Android Developement","9 am to 10 am","nodeId"),
            TeacherClassList("123","321","Android Developement","9 am to 10 am","nodeId"),
            TeacherClassList("123","321","Android Developement","9 am to 10 am","nodeId"),
            TeacherClassList("123","321","Android Developement","9 am to 10 am","nodeId"),
        )
    }
}