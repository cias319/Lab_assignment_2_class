package Assignment_2_class

fun main() {
        val account = BankAccount(123456789, 1000.0)
        println("Initial balance: ${account.getBalance()}")

        account.deposit(500.0)
        account.withdraw(200.0)
        account.withdraw(1500.0)
        println("Final balance: ${account.getBalance()}")

}
class BankAccount( private var Accno: Int, private var balance: Double) {
        fun deposit(amount: Double) {
            if (amount > 0) {
                balance += amount
                println("Deposited $$amount. New balance is $balance")
            } else {
                println("Deposit amount must be positive.")
            }
        }
        fun withdraw(amount: Double) {
            if (amount > 0 && amount <= balance) {
                balance -= amount
                println("Withdrew $$amount. New balance is $$balance")
            } else if (amount > balance) {
                println("Insufficient balance. Withdrawal amount exceeds current balance.")
            } else {
                println("Withdrawal amount must be positive.")
            }
        }
        fun getBalance(): Double {

            return balance
        }
}
