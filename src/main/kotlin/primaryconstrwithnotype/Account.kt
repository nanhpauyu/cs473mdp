package org.example.primaryconstrwithnotype

class Account(
    balance: Double = 0.0,
    name: String = "",
    accountName: String = ""
) {
    init {
        println("In init balance $balance, name $name, accountName $accountName")
    }
    var balance = balance
    var name = name
    var accountName: String = accountName
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