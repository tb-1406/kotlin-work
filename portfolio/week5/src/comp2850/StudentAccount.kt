package comp2850.banking

class StudentAccount(holder: String, initialBalance: Int = 0): BankAccount(holder){

    init {
        balance=initialBalance
    }


    var overdraft: Int = 0
        set(value) {
            if (value !in 0..100) {
                throw IllegalArgumentException("Overdraft must be between 0 and 100")
            }
            field = value
        }

    override fun withdraw(amount: Int) {
        if (amount<= 0) {
            throw IllegalArgumentException("Withdrawal amount must be greater than 0")
        }

        if (balance - amount < -overdraft) {
            throw IllegalArgumentException("Insufficient funds for withdrawal")
        }
        balance -=amount
    }

    fun withdrawalsAllowed(): Boolean {
        return balance > -overdraft
    }

    override fun toString(): String {
        return "Account for $holder, balance = $balance (overdraft = $overdraft)"
    }

}