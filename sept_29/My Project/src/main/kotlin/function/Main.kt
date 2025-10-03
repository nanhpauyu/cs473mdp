package org.example.function

fun add(number1:Int, number2:Int):Int {
    return number1 + number2
}
fun addNumbers(number1:Int = 10, number2:Int):Int = number1 + number2
fun sub(number1:Int, number2:Int) = number1 - number2
fun addAll(vararg numbers:Int):Int{
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    return sum
}
fun displayMessage(message:String) = println(message)
fun main(){
    println(add(10,20))
    println(addNumbers(number2 = 19))
    println(addAll(10,20,30))
    println(displayMessage("Hello World!"))
}