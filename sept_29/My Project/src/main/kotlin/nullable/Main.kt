package org.example.nullable

fun main(){
    var courseName:String ? = "MDP"
    courseName = "MPP"
    courseName = null
    courseName = "fpp"
    println(courseName?.uppercase())
    courseName = null
    println(courseName?.length ?: 0)
}