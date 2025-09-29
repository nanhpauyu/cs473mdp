package org.example.functionref


fun add(number1:Int, number2:Int) = number1 + number2

fun main(){
    val addFunction = ::add
    println(add(1,2))
    println(addFunction(1,2))
    val subtractNumbers = {
        number1:Int, number2:Int -> number1 - number2
    }
    println(subtractNumbers(2,1))
}