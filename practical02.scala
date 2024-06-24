object practical02{

    //Question 03  functions --------------------------------------------------------------
    def calculateWorkingHourSalary(n : Int) : Double ={
        250*n
    }
    def calculateOTHourSalary(n : Int) : Double ={
        85*n
    }

    def calculateTax(n : Double) : Double ={
        (n*12)/100
    }
    def sum(a : Double, b : Double) : Double = {  
        a + b
    }
    def takeHomeSalary(WH : Int, OTH : Int ): Double = {
        var Total =sum(calculateWorkingHourSalary(WH),calculateOTHourSalary(OTH))  
        return Total - calculateTax(Total)
   
    }

    //end of question 3 functions--------------------------------------------------------

    //Question 04 functions--------------------------------------------------------------
    def calculateAttendence(t : Double): Int = {
        var n = 0.00
        var ret = 0

        if (t > 15.00) {
            n = t - 15.00
            ret = (120-(n/5*20)).toInt
            return  ret
        }
        else if ( t < 15.00)
        {
             n = 15.00 - t
             ret = (120 + (n/5*20)).toInt
             return ret
        }
        else {
            return 120
        }
    }

    def costofPerformance(n : Int):Double ={
        500  +  n*3
    } 

    def calculateProfit(t : Double): Double = {
        var att = calculateAttendence(t)
        return (att*t)-costofPerformance(att)
    } 
    //end of question 4 functions--------------------------------------------------------------------

    def main(args: Array[String]): Unit = {   
        
        //Question 1 starts here ---------------------------------------------------------------------
        
        println("Question 01:")
        printf("\n")
        var k,i,j = 2

        var m,n = 5

        var f = 12.0
        var g = 4.0
        var c = 'X'

        println(k + 12 * m)
        println(m/j)
        println(n%j)
        println(m/j*j)
        println(f+10*5+g)
       // println(++i*n)
        i+=1
        println(i*n)
        printf("\n\n")
        
        //Question 2 starts here ---------------------------------------------------------------------
        
        println("Question 02:")
        printf("\n")

        var a = 2
        var b = 3 
        var d = 5 
        var x : Float = k.toInt
        var y  = c.toInt
        x = 4.3f
        y= 4

        println(b*a+c*d);
        b-=1
        d-=1
        println(a);
        a+=1
        println (-1*2 *(g-x)+c)
        y+=1
        println (y);
        y+=1
        a+=1
        println (y*(a));
        
        printf("\n\n")

        //Question 3 starts here ---------------------------------------------------------------------
        
        println("Question 03:")
        printf("\n")
        printf("Take home salary of a employee who works 40 normal hours and 30 OT hours :")
        println(takeHomeSalary(40,30))
        printf("\n\n")

        //Question 4 starts here ---------------------------------------------------------------------

        println("Question 04 :")
        printf("\n")
        printf("profit of the owner if the ticket price is Rs 20.00 : %f", calculateProfit(20.00));

    }
}
