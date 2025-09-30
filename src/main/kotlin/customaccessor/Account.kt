package org.example.customaccessor

class Account {
    var balance: Double = 0.0
        private set
    var name: String = ""
        get() = field
        set(value) {
            field = value.toString().uppercase()
        }
    var accountNumber: String = ""
        set(value) {
            field = value
        }
        get(){
            return field
        }
    override fun toString(): String {
        return "Account(balance=$balance, name=$name, accountName='$accountNumber')"
    }
    fun addBalance(amount:Double){
        balance += amount
    }
}

fun main() {
    val account = Account()
    account.addBalance(5.0)
    account.name = "John"
    account.accountNumber = "123456789"
    println(account)
}