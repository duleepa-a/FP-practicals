object practical10{

    class Rational(x : Int  ,  y : Int){
        def numer = x 
        def denom  = y
        
        def neg = new Rational(-this.numer,this.denom);

        def sub(r : Rational) = new Rational(x*r.denom - y*r.numer,y*r.denom);

            override def toString: String = s"$numer/$denom";
    }

    class Account(var balance: Double) {
  
    def deposit(amount: Double): Unit = {
        if (amount > 0) {
        balance += amount
        println(s"Deposited $amount. New balance: $balance")
        } else {
        println("Deposit amount must be positive.")
        }
    }

    def withdraw(amount: Double): Unit = {
        if (amount > 0 && amount <= balance) {
        balance -= amount
        println(s"Withdrew $amount. New balance: $balance")
        } else if (amount > balance) {
        println("Insufficient balance.")
        } else {
        println("Withdraw amount must be positive.")
        }
    }

    def transfer(amount: Double,toAccount: Account): Unit = {
        if (amount > 0 && amount <= balance) {
        this.withdraw(amount)
        toAccount.deposit(amount)
        println(s"Transferred $amount to another account. New balance: $balance")
        } else if (amount > balance) {
        println("Insufficient balance for transfer.")
        } else {
        println("Transfer amount must be positive.")
        }
    }
    }

    class BankAccount(var balance: Double) {
  
        def deposit(amount: Double): Unit = {
            if (amount > 0) balance += amount
        }

        def withdraw(amount: Double): Unit = {
            if (amount > 0 && amount <= balance) balance -= amount
        }

        def transfer(amount: Double, toAccount: Account): Unit = {
            if (amount > 0 && amount <= balance) {
            this.withdraw(amount)
            toAccount.deposit(amount)
            }
        }

        def applyInterest(): Unit = {
            if (balance > 0) {
            balance += balance * 0.05
            } else {
            balance += balance * 0.1
            }
        }

        override def toString: String = s"Account(balance: $balance)"
    }

    class Bank(val accounts: List[BankAccount]) {

        def accountsWithNegativeBalances: List[BankAccount] = {
            accounts.filter(_.balance < 0)
        }

        def totalBalance: Double = {
            accounts.map(_.balance).sum
        }

        def applyInterestToAllAccounts(): Unit = {
            accounts.foreach(_.applyInterest())
        }
    }

    def countLetterOccurrences(words: List[String]): Int = {

        val lengths = words.map(_.length)
        val totalLetters = lengths.reduce(_ + _)
  
        totalLetters
    }


    def main(args: Array[String]): Unit = {
        
        var r = new Rational(2,3);

        println("Question 01: ");
        println("Rational number: " + r.numer + "/" + r.denom );
        r = r.neg;
        println("Neg of rational number: " + r.numer + "/" + r.denom );

        printf("\n\n");
        println("Question 02: ");
        val x = new Rational(3,4);
        val y = new Rational(5,8);
        val z = new Rational(2,7);

        println("X = " + x.numer + "/" + x.denom );
        println("Y = " + y.numer + "/" + y.denom );
        println("Z = " + z.numer + "/" + z.denom );
        println(z);

        r = x.sub(y).sub(z);
        println("X-Y-Z = " + r.numer + "/" + r.denom );

        // println("X" + x.toString());

        printf("\n\n");
        println("Question 03: ");
        var acc1 = new Account(500.0);
        var acc2 = new Account(1000.0);

        println("Balance in Acc1 :" + acc1.balance);
        acc1.deposit(200.0);
        acc1.withdraw(600.0);

        printf("\n\n");
        println("Balance in Acc1 :" + acc1.balance);
        println("Balance in Acc2 :" + acc2.balance);
        acc2.transfer(400.0,acc1);
        println("Balance in Acc1 :" + acc1.balance);
        println("Balance in Acc2 :" + acc2.balance);

        printf("\n\n");
        println("Question 04: ");

        val account1 = new BankAccount(1000.0)
        val account2 = new BankAccount(-200.0)
        val account3 = new BankAccount(500.0)

        val bank = new Bank(List(account1, account2, account3))

        val negativeAccounts = bank.accountsWithNegativeBalances
        println("Accounts with negative balances: " + negativeAccounts)

        val total = bank.totalBalance
        println("Total balance of all accounts: = " + total);

        bank.applyInterestToAllAccounts()
        println("Final balances after applying interest: " + bank.accounts);


        printf("\n\n");
        println("Question 05: ");
        val words = List("apple", "banana", "cherry", "date")
        val totalCount = countLetterOccurrences(words)
        println("Total count of letter occurrences:" + totalCount)

    }
}