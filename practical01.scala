object practical01
{
    def AreaOfADisk(r : Float): Double = {
        math.Pi*r*r
    }
    def FtoC(t : Float): Double = {
        t*1.8 +32.0
    }
    def volumeOfSphere(r : Float): Double = {
        4/3*math.Pi*r*r*r
    }

    def discount(n :Float ): Double = {
        n*24.95*40/100
    }

    def shippingCost(n :Float): Double = {
        if (n <= 50){
            return n*3
        }
        else{
            return 50*3 + (n-50)*0.75
        }
    } 

    def wholesaleCost(n : Float): Double = {
        n*24.95 + shippingCost(n) - discount(n) 
    }

    def timeForEasyPace(d : Float): Double ={
        8*d
    }
    def timeForTempo(d : Float): Double = {
        7*d
    }

    def main(args: Array[String]): Unit = {
        println("Question 1:")
        printf("Area of a disk with radius 5 is : %f\n",AreaOfADisk(5.0))
        
        println("Question 2:")
        printf("35C temperature in Fahrenheit is : %fF\n",FtoC(35.0))

        println("Question 3:")
        printf("Volume of a sphere with radius 5 is : %f\n",volumeOfSphere(5.0))

        println("Question 4:")
        printf("Total wholesale cost for 60 copies : Rs. %f\n",wholesaleCost(60))

        println("Question 4:")
        printf("Time for running 2km,3km,2km at an easypace,a tempo pace and an easy pace respectively  :  %f minutes\n",timeForEasyPace(2) + timeForTempo(3) + timeForEasyPace(2) )


    }

}