package com.cbitss.teacherstudent.modleclasses

data class TeacherListData(
    val teacher_id:String,
    val teacher_name:String,
    val teacher_skills:String,
    val email:String,
    val password:String,
    val imageUrl:String,
) {
    companion object{
        var teacherdata: MutableList<TeacherListData> = arrayListOf(
            TeacherListData("1","Anurage","Android,Java","abc@gmail.com","12345","default"),
            TeacherListData("1","Anurage","Android,Java","abc@gmail.com","12345","default"),
            TeacherListData("1","Anurage","Android,Java","abc@gmail.com","12345","default"),
            TeacherListData("1","Anurage","Android,Java","abc@gmail.com","12345","default"),
            TeacherListData("1","Anurage","Android,Java","abc@gmail.com","12345","default"),

        )
    }
}