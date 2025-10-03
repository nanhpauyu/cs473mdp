package org.example.singleton

object DataConfig {
    fun getConnection(){
        println("Connecting to DB..")
    }
}
fun main(){
    DataConfig.getConnection()
    DataConfig.getConnection()
}