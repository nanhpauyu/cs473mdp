package org.example.dataclass

data class RequestDto(
    val name: String,
    val age: Int,
)

fun main() {
    val request = RequestDto(name = "John Doe", age = 18)
    println(request)
    val request1 = request.copy()
    println(request1 == request)
    println(request1.equals(request))
    println(request1 === request)
}
