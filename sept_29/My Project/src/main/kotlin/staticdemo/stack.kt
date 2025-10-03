package org.example.staticdemo

class stack {
    companion object {
        val stack = mutableListOf<Int>()
        fun push(item:Int){
            stack.add(item)
        }
        fun pop(): Int?{
            return if (stack.isNotEmpty()) stack.removeAt(stack.lastIndex) else null
        }
    }
    fun myFun(dd:Int){

    }
}
fun stack.myFun2(aa:Int){
    println("This is $aa")
}

fun main(){
    stack.push(3)
    stack.push(2)
    stack.push(4)
    println(stack.stack)
    stack.pop()
    println(stack.stack)
    val s = stack()
    s.myFun2(33)
}