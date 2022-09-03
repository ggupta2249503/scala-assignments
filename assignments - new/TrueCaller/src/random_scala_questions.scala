

object random_scala_questions {
  
  def main(args:Array[String]){
    
    val list=List(2,4,6,8,10,12)
    // all ppairs that make up 14
    val list1=list.sliding(2).toList
    list1.foreach(x=>println(x))
    val list2=list.grouped(2).toList
    list2.foreach(x=>println(x))
  }
}