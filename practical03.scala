object practical03{
    //Question 01
    def reverseString(string : String, len : Int): String = {
        if(len == 1 ) {
            return string.charAt(0)+""
        }
        else{
            return string.charAt(len-1) + reverseString(string,len-1)
        }
    }

    //Question 02
    def newListWithMoreThan5(lst : List[String]): List[String] = {
        var newList : List[String] = List()
        for(i <- 0 to lst.length - 1){
            if(lst(i).length > 5 ){
                newList = newList:+ lst(i)
            }
        }

        return newList
    }

    //Question 03
    def arthmeticMean(a : Int , b : Int): Float = {
        var number = (a + b)/2
        return BigDecimal(number).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat
    }

    //Question 04
    def evenSumInList(lst : List[Int]): Int = {
        var sum = 0
        for(i <- 0 to lst.length - 1){
            if(lst(i) % 2 == 0){
                sum = sum + lst(i)
            }
        }

        return sum 
    } 

    def main(args: Array[String]): Unit = {  
        
        //Question 01
        printf("Question 01 :\nThe reversed string of hello is : ")
        var s = "hello"
        var l = s.length()
        var result1 = reverseString(s,l)
        println(result1)

        //Question 02
        printf("\n\n Question 02 :\n")
        var list = List("Apple","Orange","Grape","Pineapple")
        list = list:+ "mango"
        var result2 = newListWithMoreThan5(list)
        result2.foreach(println)

        //Question 03
        printf("\n\n Question 03 :\n")
        var num1 = 10
        var num2 = 12
        println("The arthmetic mean of 10 and 12 is :" + arthmeticMean(num1,num2))
        
        //Question 04
        printf("\n\n Question 04 :\n")
        var intList = List(42,5,81,52,9,10)
        println("The sum of the even numbers is :" + evenSumInList(intList)) 
        
 
    }
}