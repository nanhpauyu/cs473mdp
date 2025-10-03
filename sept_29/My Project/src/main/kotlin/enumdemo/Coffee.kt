package org.example.enumdemo

enum class Coffee {
    AMERICANO, LATTE, CAPPUCCINO, ESPRESSO
}

fun main(){
    println(Coffee.AMERICANO.name)
    println(
        Coffee.values().joinToString { it.name }
    )
//    println(Coffee.valueOf(readlnOrNull() ?:"CAPPUCCINO"))
    val coffee = Coffee.LATTE
    when (coffee) {
        Coffee.AMERICANO -> println("Americano")
        Coffee.LATTE -> println("Latte")
        Coffee.CAPPUCCINO -> println("Cappuccino")
        Coffee.ESPRESSO -> println("ESPRESSO")
    }
}