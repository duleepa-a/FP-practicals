import scala.io.StdIn.readLine

object practical05Q3{

    def fibonacci(n: Int): Int = {
        if (n <= 1) {
            n
        }
        else {
            fibonacci(n-1) + fibonacci(n-2)
        }
    }      

    def printFibonacciNumbers(n: Int): Unit = {
        for (i <- 0 to n-1) {
            print(fibonacci(i) + " ")
        }
        printf("\n\n");
    }

    def main(args: Array[String]): Unit ={
        
        println("Enter the value of n:")
        val n = scala.io.StdIn.readInt()

        printf("The first %d Fibonacci numbers are:",n)
        printFibonacciNumbers(n)
    }
}