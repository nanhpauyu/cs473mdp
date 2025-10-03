package org.example.when_exp

fun main(){
    val daysOfWeek = 3
    when(daysOfWeek){
        1->println("Monday")
        2->println("Tuesday")
        3->println("Wednesday")
        4->println("Thursday")
        5->println("Friday")
        6->println("Saturday")
        7->println("Sunday")
        else -> println("Unknown daysOfWeek")
    }

    val day = "Monday"
    when(day){
        "Monday" -> println("Today is Monday")
        "Tuesday" -> println("Today is Tuesday")
        "Wednesday" -> println("Today is Wednesday")
        "Thursday" -> println("Today is Thursday")
    }
}