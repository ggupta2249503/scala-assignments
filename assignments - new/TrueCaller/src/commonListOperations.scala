

object commonListOperations {
  def main(args:Array[String]) {
    //p1 to p5
    val lst =List(1, 1, 2, 3, 5, 8)
    println(lst.last)
    println(lst.head)
    println(lst.tail)
    println(lst(lst.length-1))
    println(lst(1))
    println(lst.reverse)
    println(lst.length)

    
}
}