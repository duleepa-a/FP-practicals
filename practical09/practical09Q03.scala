object practical09Q03{

   def toUpper(s: String) : String = {
         s.map { c =>
            if (c >= 'a' && c <= 'z'){ 
                (c - 32).toChar 
            }
            else{
                 c
            }     
        }
    }

    def toLower(s: String) : String = {
        s.map { c =>
            if (c >= 'A' && c <= 'Z'){ 
                (c + 32).toChar 
            }
            else{
                 c
            }     
        }
    }

    def formattedNames(name: String)(formatFunc: String => String): String = formatFunc(name)

    def formatNames(name: String) : String = name match {
        case s if s == "Benny"  => formattedNames(name)(toUpper)
        case s if s == "Niroshan" => formattedNames(name)(str => {
            formattedNames(str.substring(0,2))(toUpper) + str.substring(2) 
        }) 

        case s if s == "Saman" => formattedNames(name)(toLower)
        case s if s == "Kumara" => formattedNames(name)(str =>{
            str.substring(0,5) + formattedNames(str.substring(5))(toUpper) 
        })
        case _ => name
    }

    def main(args : Array[String]):Unit = {
        println("Benny: " + formatNames("Benny"))
        println("Niroshan: " + formatNames("Niroshan"))
        println("Saman: " + formatNames("Saman"))
        println("Kumara: " + formatNames("Kumara"))
    }
}