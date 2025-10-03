package org.example.simpleinheritance

open class Person(var name: String){
    open fun walk() = println("$name is Walking")
}

class Student(name: String, var grade: Int) : Person(name) {
    override fun walk() {
        super.walk()
        println("Student $name is Walking")
    }
}

fun main(){
    val student = Student("john", grade = 1)
    println(student.grade)
    println(student.name)
    student.walk()
}