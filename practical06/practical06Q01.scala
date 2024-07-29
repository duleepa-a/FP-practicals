object practical06Q01{

    case class product(name: String,price: Double,quantity: Int)

    val inventory1 : Map[Int,product] = Map(
        101-> product("Pen",20,50),
        102-> product("Pencil",15,100),
        103-> product("CRBook",120,100)
    )

    val inventory2 : Map[Int,product] = Map(
        104-> product("Ruler",10,50),
        102-> product("Pencil",20,150),
        105-> product("Bottle",400,20)
    )

    def retreiveAll(inventory : Map[Int, product]) : Unit = {
        println("All the products in inventory:")
        println(inventory.values.map(_.name))
    }

    def calculateTotal(inventory : Map[Int, product]) : Double = {
        inventory.values.map(product => product.quantity * product.price).sum
    }

    def isInventoryEmpty(inventory: Map[Int, product]): Boolean = {
        inventory.isEmpty
    }

    def mergeInventories(inventory1: Map[Int, product], inventory2: Map[Int, product]): Map[Int, product] = {
        inventory2.foldLeft(inventory1) { case (acc, (id, product)) =>
                acc.get(id) match {
            
            case Some(existingProduct) =>
                acc.updated(id, existingProduct.copy(
                quantity = existingProduct.quantity + product.quantity,
                price = Math.max(existingProduct.price, product.price)
            ))

            case None =>
            acc + (id -> product)
        }
        }
  }

    def printProductDetails(inventory: Map[Int, product], ID: Int): Unit = {
        inventory.get(ID) match {
            case Some(product) =>
                println(s"Product ID: $ID Name: ${product.name}  Quantity: ${product.quantity}  Price: ${product.price}")
            case None =>
                println(s"Item with ID number $ID not found in inventory.")
        }
    }


    def main(args : Array[String]): Unit = {
        
        //Question I
        println("Question I:") 
        retreiveAll(inventory1)

        //Question II
        printf("\n")
        println("Question II:")
        printf("The total value of products in inventory1 : %f",calculateTotal(inventory1))

        //Question III
        printf("\n\n")
        println("Question III:")
        if(isInventoryEmpty(inventory1)){
            println("Inventory 01 is empty")
        }
        else{
            println("Inventory 01 is not empty")
        }

        //Question IV
        printf("\n")
        println("Question IV:")
        val mergedInventory = mergeInventories(inventory1, inventory2)
        println("Merged inventory: ")
        retreiveAll(mergedInventory)

        //Question V
        printf("\n")
        println("Question V:")
        printProductDetails(inventory1,102)

    }
}