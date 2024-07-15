import scala.io.StdIn.readLine
import scala.io.StdIn.readInt

object inventory_management {
    def main(args: Array[String]): Unit ={
        

        def getProductList(n: List[String]): List[String] = {
            val word = readLine("Enter string or 'done' to stop adding list: ")
            word match {
                case "done" => n
                case _ => getProductList(n :+ word)
            }
        }

        def printProductList(n:List[String],index: Int = 1): Any = if(!n.isEmpty)
            {println(s"$index => ${n.head}");printProductList(n.tail,index + 1)}

        def getTotalProducts(n:List[String]): Unit = {
            println(s"The total number of list entered is: ${n.length}")

        }

        val initialList = List[String]()
        val productList = getProductList(initialList)
        printProductList(productList)

        getTotalProducts(productList)



    }
}