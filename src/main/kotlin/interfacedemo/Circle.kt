package org.example.interfacedemo

interface Circle {
    val pi: Double
        get() = 3.14
    val radius: Double
    fun getArea():Double = pi * radius
    fun drawCircle()
}
class CircleImpl(override val radius: Double) :Circle{
    override fun drawCircle() {
        println("Drawing circle")
    }
}