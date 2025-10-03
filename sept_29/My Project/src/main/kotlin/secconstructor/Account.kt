package org.example.secconstructor

class Account(
    var balance: Double,
    var name: String,
    var accountNumber: String
) {
    constructor(accountNumber: String) : this(balance = 0.0, name = "Unknown", accountNumber = accountNumber)
//    constructor(accountNumber: String, name: String) : this(balance = 0.0, name = name, accountNumber = accountNumber)
    constructor(accountNumber: String, name: String) : this(accountNumber = accountNumber)
//    constructor(accountNumber: String, name: String, balance: Double) : this(balance = 0.0, name = name, accountNumber = accountNumber)


    override fun toString(): String {
        return "Account(balance=$balance, name=$name, accountName='$accountNumber')"
    }
}

fun main() {
    val account = Account(balance = 5.0, "John Doe", "123456789")
//    account.balance = 5.0
//    account.name = "John"
//    account.accountNumber = "123456789"
    println(account)
}