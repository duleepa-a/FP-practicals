object practical09Q01{
    
    val interest: Double => Double = deposit => deposit match {
        case d if d <= 20000   => d*0.02
        case d if d <= 200000  => d*0.04
        case d if d <= 2000000 => d*0.035
        case d => d*0.065
    }

    def main(args: Array[String]):Unit={

        var deposit = 10000.0
        var interestAmount = interest(deposit)
        println(s"The Inerest amount of money that the bank pays for deposit amount : Rs.$deposit is Rs.$interestAmount")
        printf("\n\n")

        deposit = 100000.0
        interestAmount = interest(deposit)
        println(s"The Inerest amount of money that the bank pays for deposit amount : Rs.$deposit is Rs.$interestAmount")
        printf("\n\n")

        deposit = 1000000.0
        interestAmount = interest(deposit)
        println(s"The Inerest amount of money that the bank pays for deposit amount : Rs.$deposit is Rs.$interestAmount")
        printf("\n\n")

        deposit = 10000000.0
        interestAmount = interest(deposit)
        println(s"The Inerest amount of money that the bank pays for deposit amount : Rs.$deposit is Rs.$interestAmount")
        printf("\n\n")


    }
}