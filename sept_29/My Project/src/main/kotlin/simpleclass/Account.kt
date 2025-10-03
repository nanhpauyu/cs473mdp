package org.example.simpleclass

class Account {
    var balance: Double = 0.0
    var name: String = ""
    var accountName: String = ""

    override fun toString(): String {
        return "Account(balance=$balance, name=$name, accountName='$accountName')"
    }
}

fun main() {
    val account = Account()
    account.balance = 5.0
    account.name = "John"
    account.accountName = "123456789"
    println(account)
}