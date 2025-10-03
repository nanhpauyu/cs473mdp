package org.example.arraylist

fun main(){
    val names = arrayListOf("John", "Denise", "Jan")
    println(names)
    names.clear()
    println(names.firstOrNull())
}