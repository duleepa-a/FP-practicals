import scala.io.StdIn.readLine

object practical05Q1{
    
    //Funtions of question 01 starts here ------------------------------------------------------------------------------
    def getProductList(): List[String] ={

        var listOfProducts = List[String]()
        println("Enter product names (type 'done' to end): ")
        var input =""

        while (input != "done") {
            input = readLine()
            if (input != "done") {
                listOfProducts = listOfProducts :+ input
            }
        }

        listOfProducts
    }

    def printProductList(list :List[String]): Unit = {
        var i = 0
        for(i <- 0 to list.length - 1){
            printf("%d. %s\n",i,list(i))
        }
    }
    
    def getTotalProducts(list: List[String]): Int = {
        list.length
    }
    //Funtions of question 01 ends here    

    def main(args: Array[String]): Unit = {
        
        println("Question 01:")
        var myList = getProductList()
        
        printProductList(myList)
        
        printf("\nThe total number of products in the list is: %d\n",getTotalProducts(myList))

    }
}