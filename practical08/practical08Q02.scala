object practical08Q02 {

  def main(args: Array[String]): Unit = {

    val number =args(0).toInt

    val multipleOfThree: Int => Boolean = _ % 3 == 0
    val multipleOfFive: Int => Boolean = _ % 5 == 0


    val result = (multipleOfThree(number), multipleOfFive(number)) match {
      case (true, true)   => "Multiple of Both Three and Five"
      case (true, false)  => "Multiple of Three"
      case (false, true)  => "Multiple of Five"
      case (false, false) => "Not a Multiple of Three or Five"
    }

    println(result)
  }
}
