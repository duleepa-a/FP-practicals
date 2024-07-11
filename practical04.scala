import scala.io.StdIn._
object practical04{
    var nameArray = Array("Pen","Pencil","Bottle")
    var intArray = Array(10,20,30)

    def displayInventory(): Unit ={
        println("The inventory: ")
        for(i <- 0 to nameArray.length - 1 ){
            printf("%s : %d\n",nameArray(i),intArray(i))
        }
    }

    def restockItem(name : String , quantity : Int) : Unit ={
        if(nameArray.contains(name)){
            var index = nameArray.indexOf(name)
            intArray(index) = intArray(index) + quantity
        }
        else{
            println("The entered item is not in the invnetory")
        }
    }

    def sellItem(name : String, quantity : Int) : Unit = {
        if(nameArray.contains(name)){
            var index = nameArray.indexOf(name)
            intArray(index) = intArray(index) - quantity
        }
        else{
            println("The entered item is not in the invnetory")
        }
    }

    def checkNum(num : Int) : Unit = num  match {
        case  x if x <= 0 => println("Negative/Zero")
        case x if x%2 == 1 => println("Odd Number is given")
        case _ => println("Even Number is given")
    }

    def toUpper(s: String) : String = {
        s.toUpperCase()
    }

    def toLower(s: String) : String = {
        s.toLowerCase()
    }
    
    def main(args: Array[String]): Unit = {
        
        //Question 1 .1)
        printf("Question 01 :\n\n 1)Prining the inventory :")
        displayInventory()

        //Question 1 .2)
        restockItem("Bottle",50)
        printf("\n2)Adding 50 bottles to the stock: \nPrining the inventory :")
        displayInventory()

        //Question 1 .3)
        sellItem("Pen",5)
        printf("\n3)Selling 5 pens : \nPrining the inventory :")
        displayInventory()

        //Question 2
        printf("\n\nQuestion 02 :\n Enter an integer:")        
        val num = readInt()
        checkNum(num)

        //Question 3
        printf("\n\nQuestion 03 :\n")
        println(toLower("HeEllo"))
        println(toUpper("HeEllo"))
    }
}
