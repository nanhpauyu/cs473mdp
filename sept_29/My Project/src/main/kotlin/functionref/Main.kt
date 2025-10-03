package org.example.functionref


fun add(number1: Int, number2: Int) = number1 + number2

fun main() {
    val addFunction: (Int, Int) -> Int = ::add
//    val addFunction = ::add
    println(add(1, 2))
    println(addFunction(1, 2))
//    val subtractNumbers = { number1: Int, number2: Int ->
//        if (number1 > number2) {
//            val result = number1 - number2
//            result
//        } else {
//            val result = number2 - number1
//            result
//        }
//    }
    val subtractNumbers: (Int, Int) -> Int = { number1, number2 ->
        if (number1 > number2) {
            val result = number1 - number2
            result
        } else {
            val result = number2 - number1
            result
        }
    }
    println(subtractNumbers(2, 1))
    val my_function = { a: String, b: String ->
        "the total length is " + a.length + b.length
    }
    println(my_function("hello", "world"))
//    val square:(Int)-> Int ={data -> data * data}
    val square: (Int) -> Int = { it * it }
    var myVar: String? = null
    myVar = "Hello"
    println(myVar::class)
}