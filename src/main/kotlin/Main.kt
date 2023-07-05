fun main(){
//    val input = "abcdefg"
//    val evenChars = getEvenChars(input)
//    println(evenChars)
//
//    val savingsAccount = SavingsAccount(1000.0)
//
//    savingsAccount.deposit(500.0)
//    savingsAccount.withdraw(200.0) // withdrawalCount = 1
//    savingsAccount.withdraw(300.0) // withdrawalCount = 2
//    savingsAccount.withdraw(400.0) // withdrawalCount = 3
//    savingsAccount.withdraw(500.0)
//
//
//    val account = CurrentAccount("123456789", "John Doe", 1000.0)
//    account.deposit(500.0)
//    account.withdraw(200.0)
//    account.details()
//
//    val array = arrayOf("Hello", "world", "!")
//    val result = joinStrings(array)
//    println(result)
}

//9.Create a kotlin class CurrentAccount with the following attributes:account number,account name
//        account,balance.It has the following functions:
//        a.deposit(amount:Double)-incremets the balance by the amount deposited
//        b.withdraw(amount:Double)-decrements the balance by the amount withdrawn
//        c.details()-prints out the account number aqnd balance and name in this format:
//"Account number x with balance y is operated by z"
//class CurrentAccount(val accountNumber: String, val accountName: String, var balance: Double) {
//    fun deposit(amount: Double) {
//        balance += amount
//    }
//
//    fun withdraw(amount: Double) {
//        balance -= amount
//    }
//
//    fun details() {
//        println("Account number $accountNumber with balance $balance is operated by $accountName")
//    }
//}
////10.Write a kotlin program that given a string it returns a string containing all the characters
////        at even indices
//fun getEvenChars(input: String): String {
//    var evenChars = ""
//    for (i in input.index  step 2) {
//        evenChars += input[i]
//    }
//    return evenChars
//}

////11.Using OOP in kotlin, create a Savings Account inheriting from the Current Account class but
////performs a withdrawal method and a person can only withdraw if they have only withdrawn less than
////        4 times else they are not eligible to withdraw from their account
//open class CurrentAccount(var balance: Double) {
//    open fun deposit(amount: Double) {
//        balance += amount
//    }
//
//    open fun withdraw(amount: Double) {
//        if (balance >= amount) {
//            balance -= amount
//        } else {
//            println("Insufficient funds")
//        }
//    }
//}
//class SavingsAccount(balance: Double) : CurrentAccount(balance) {
//    var withdrawalCount = 0
//
//    override fun withdraw(amount: Double) {
//        if (withdrawalCount < 4) {
//            super.withdraw(amount)
//            withdrawalCount++
//        } else {
//            println("Withdrawal limit reached")
//        }
//    }
//}
////12.Write a kotlin program that takes in an array of strings ,joins them all into one strings
////and returns it
//fun joinStrings(array: Array<String>): String {
//    return array.joinToString("")
//}
////13.You have a list of students grades. Write a kotlin program that calculates the average grade of all the
////        students in the list and prints the result
//fun calculateAverageGrade(grades: List<Int>) {
//    val sum = grades.sum()
//    val average = sum.toDouble() / grades.size
//    println("The average grade is: $average")
//}
//val grades = listOf(80, 90, 75, 85, 95)
//calculateAverageGrade(grades)
//
//or
//val grades = listOf(80, 90, 75, 85, 95)
//val average = grades.average()
//println("The average grade is: $average")
////14.Write a kotlin function that takes an array of characters as input and returns the number of vowels
////        present in the array
//fun countVowels(chars: CharArray): Int {
//    var count = 0
//    val vowels = setOf('a', 'e', 'i', 'o', 'u')
//    for (char in chars) {
//        if (char.toLowerCase() in vowels) {
//            count++
//        }
//    }
//    return count
//}
//val chars = charArrayOf('a', 'b', 'c', 'd', 'e')
//val numVowels = countVowels(chars)
//println("Number of vowels: $numVowels")