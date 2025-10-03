package org.example.primaryconstructor

class Account(
    var balance: Double,
    private var name: String ,
    val accountName: String
) {
    override fun toString(): String {
        return "Account(balance=$balance, name=$name, accountName='$accountName')"
    }
}

fun main() {
    val account = Account(1.0,"John Doe", "123456789")
    account.balance = 5.0
    println(account)
}