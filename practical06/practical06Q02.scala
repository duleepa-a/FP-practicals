import scala.io.StdIn.readLine

object practical06Q02{
    
    def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
        if(name.isEmpty) {
            (false, Some("Name cannot be empty."))
        } 
        else if(marks < 0) {
            (false, Some("Marks must be a positive integer."))
        } 
        else if(totalMarks <= 0) {
            (false, Some("Total possible marks must be a positive integer."))
        } 
        else if(marks > totalMarks) {
            (false, Some("Marks obtained cannot exceed total possible marks."))
        } 
        else{
            (true, None)
        }
  }

    
    def getStudentInfo(): (String, Int, Int, Double, String) = {
    
        def readName(): String = {
            val name = readLine("Enter student name: ")
            name
        }

        def readMarks(prompt: String): Int = {
            val marks = readLine(prompt).toInt
            marks
        }

        var validInput = false
        var name = ""
        var marks = 0
        var totalMarks = 0


        def getStudentInfoWithRetry(): Unit = {
            while (!validInput) {
                name = readName()
                marks = readMarks("Enter marks obtained: ")
                totalMarks = readMarks("Enter total possible marks: ")

                val (isValid,errorMessage) = validateInput(name, marks, totalMarks)
                
                if(isValid){
                    validInput = true
                }
                else{
                    println(errorMessage.getOrElse("Invalid input. Please try again."))
                }
            }
        } 

        getStudentInfoWithRetry()   

        val percentage = (marks.toDouble / totalMarks) * 100

        val grade = percentage match {
            case m if m >= 90 => "A"
            case m if m >= 75 => "B"
            case m if m >= 50 => "C"
            case _            => "D"
        }

        (name,marks,totalMarks,percentage,grade)
    }

    def printStudentRecord(record: (String, Int, Int, Double, String)): Unit = {
        
        val (name, marks, totalMarks, percentage, grade) = record
        
        println(s"Student Name: $name")
        println(s"Marks Obtained: $marks")
        println(s"Total Possible Marks: $totalMarks")
        println(s"Percentage: $percentage%")
        println(s"Grade: $grade")
    
    } 

    def main(args: Array[String]): Unit ={

        println("Getting details of the student by user input")
        val student1Info = getStudentInfo()

        printf("\n\n")
        println("Print details of the student:")
        printStudentRecord(student1Info)

    }
}    