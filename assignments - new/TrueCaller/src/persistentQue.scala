

object persistentQue {
  def main(args:Array[String]){
    
    val lst1=List(1,2,3)
    val lst2 = List("one","two","three")
    
    //expected output -Map(2 -> two, 1 -> one, 3 -> three)
    
    //using map
    val lst1_zip= lst1.zipWithIndex
    val map1=scala.collection.mutable.Map[Int,Int]()
    lst1_zip.map{x=>map1+=(x._2->x._1)}
    println(map1)
    val lst2_zip= lst2.zipWithIndex
    val lst3=lst2_zip.map{x=>
      (map1(x._2),x._1)
    }
    println(lst3)
    val map2=scala.collection.mutable.Map[Int,String]()
    val lst4=lst3.map(x=>map2+=(x._1->x._2))
    //println(lst4)
    println(map2)
    
    //without using map
    val lstnew=lst2_zip.map{x=>
      (lst1_zip(x._2)._1,x._1)
    }
    println(lstnew)
    val map3=scala.collection.mutable.Map[Int,String]()
    val lst5=lstnew.map(x=>map3+=(x._1->x._2))
    //println(lst4)
    println(map3)
    
  }
}