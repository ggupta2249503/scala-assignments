import scala.collection.mutable.ListBuffer

object P09_consecutiveduplicatessublists {
  def main(args: Array[String]) {
        val lst=List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        var lstBuff= new ListBuffer[Char]()
        val lstBuffMast= new ListBuffer[ListBuffer[Char]]()
        lstBuff+=lst.head
        lst.tail.foreach{x=>
            //println()
            if(lstBuff.last==x){
               lstBuff+=x 
            } else {
                lstBuffMast+=lstBuff
                lstBuff=  ListBuffer[Char]()
                lstBuff+=x
            }
            
           
    }
    lstBuffMast+=lstBuff
    println(lstBuffMast)
}
  
  
}