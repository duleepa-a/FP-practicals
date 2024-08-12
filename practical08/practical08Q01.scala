object practical08Q01{

    def Encryption(string : String , key : Int) : String ={
        string.map{ char =>
        if(char.isLetter){
            val base = if (char.isUpper) 'A' else 'a';
            ((char-base + key )% 26 + base).toChar
        }
        else{
            char
        }
        }
    }

    def Decryption(string : String , key : Int) : String ={
        val decryptKey = 26 - key
        string.map{ char =>
            if(char.isLetter){
                val base = if (char.isUpper) 'A' else 'a';
                ((char-base + decryptKey )% 26 + base).toChar
            }
            else{
                char
            }
        }
    }

    def Cipher(function : (String,Int) => String,text : String , key : Int): String = {
        function(text,key)
    }

    def main(args: Array[String]): Unit={
        val Text = "Duleepa Edirisinghe"
        val key = 3

        println(s"Text: $Text")
        val encryptedText = Cipher(Encryption,Text,key)
        println(s"Encrypted: $encryptedText")

        val decryptedText = Cipher(Decryption,encryptedText,key)
        println(s"Decripted: $decryptedText")
    }
    
}
