
import scala.collection.mutable.ListBuffer
object P08_consecutiveduplicates {
  def main(args:Array[String]) {
    //p8
    val lst=List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
        val lstBuff= new ListBuffer[Char]()
        lstBuff+=lst.head
        lst.foreach{x=>
        
            if(lstBuff.last!=x){
               lstBuff+=x 
            }
        
    }
    println(lstBuff)
   
    //Another way
    val lstBuff_new= new ListBuffer[Char]()
    lst.foreach{x=>
    if(!lstBuff_new.contains(x)) {
      lstBuff_new+=x
  } else if(lstBuff_new.last!=x) {
    
      
      lstBuff_new+=x
    
  }
    
    
  }
  println(lstBuff_new)

    
}
}