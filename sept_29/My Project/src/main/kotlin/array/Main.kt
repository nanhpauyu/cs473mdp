package org.example.array

fun main(){
    val numbers: Array<Int> = arrayOf(1,2,3,4,5)
//    val socredCourses = arrayOf("Kotlin","Java", "Python")
//    println(numbers.contentToString())
//    for (n in numbers){
//        println(n)
//    }
//    numbers.forEach { n -> println(n) }
    // Usage of range operator
    for (i in 10 downTo 1){
        println(i)
    }
    for ((index, value) in numbers.withIndex()){
        println("the element at $index is $value")
    }
}