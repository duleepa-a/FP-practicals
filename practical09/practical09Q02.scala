object practical09Q02 {

    val isNumber : Int => Unit = num => num  match{
            case n if n <= 0 => println("Entered num is Negetive/Zero")            
            case n if (n % 2 == 0 ) => println("Entered num is an Even number")
            case n => println("Entered num is an Odd Number") 
    }
    

    def main(args : Array[String]):Unit = {
        if(args.length != 1){
            println("please enter an intger")
            System.exit(1)
        }

        val num = args(0).toInt
        
        isNumber(num)
    }
}