package org.example.higherorderfucntion

fun add(number1: Int, number2: Int) = number1 + number2
fun sub(number1: Int, number2: Int) = number1 - number2

fun operation(num1: Int, num2: Int, myFun: (Int, Int) -> Int): Int {
    return myFun(num1, num2)
}

fun main() {
    println(operation(10, 20, ::add))
    println(operation(20, 10, ::sub))
    operation(10, 10) { num1, num2 -> num1 * num2 }
    print(op2(1, { num1, num2 -> num1 * num2 }) { num1, num2 -> num1 * num2 })
}

fun op2(num1: Int, myFun: (Int, Int) -> Int, myFun2: (Int, Int) -> Int): Int {
    return myFun(num1, num1)
}