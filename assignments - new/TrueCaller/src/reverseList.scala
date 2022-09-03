

object reverseList {
  
  def main(args:Array[String]) {
    // P5without using reverse
    val lst =List(1, 1, 2, 3, 5, 8)
    var list1 : List[Int]= List()
    var lst_a=lst
     while(lst_a.length>0) {
       var ele=lst_a.head
       list1=ele ::list1
       lst_a=lst_a.tail
       
     }
    println(list1)

    
}
}