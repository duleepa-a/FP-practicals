object practical07 {

    //Funtions for Question 01 starts here--------------------------------------------------------

    def filterEvenNumbers(numList : List[Int]): List[Int] = {
        numList.filter(num => num % 2 == 0)
    }

    //Funtions for Question 02 starts here--------------------------------------------------------

    def calculateSquare(numList : List[Int]): List[Int] = {
        numList.map(num => num* num)
    }

    //Funtions for Question 03 starts here-------------------------------------------------------- 

    def isPrime(num : Int): Boolean = {
        if (num <= 1) false
        else if (num == 2) true
        else !((2 until num).exists(i => num % i == 0))

    }

    def filterPrime(numList : List[Int]): List[Int] = {
        numList.filter(num => isPrime(num))
    }

    def main(args:Array[String]): Unit = {
       
        println("Question 01");
        
        val inputQ1 = List(1,2,3,4,5,6,7,8,9,10);
        val outputQ1 = filterEvenNumbers(inputQ1);

        println("Input  : " + inputQ1 );
        println("Output : " + outputQ1);
        printf("\n\n");

        println("Question 02");

        val inputQ2 = List(1,2,3,4,5);
        val outputQ2 = calculateSquare(inputQ2);

        println("Input  : " + inputQ2 );
        println("Output : " + outputQ2);
        printf("\n\n");

        println("Question 03");

        val inputQ3 = List(1,2,3,4,5,6,7,8,9,10);
        val outputQ3 = filterPrime(inputQ3);

        println("Input  : " + inputQ3 );
        println("Output : " + outputQ3);
        printf("\n\n");


    }



}