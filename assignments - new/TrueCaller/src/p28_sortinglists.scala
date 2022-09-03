import scala.collection.mutable.ListBuffer

object p28_sortinglists {
  def main(args:Array[String]){
    
    //PART A
    val lst=List(List('a', 'b', 'c'), List('d', 'e'), List('f', 'g', 'h'), List('d', 'e'), List('i', 'j', 'k', 'l'), List('m', 'n'), List('o'))
    val lst1=lst.sortWith((x,y)=>x.length<y.length)
    println(lst1)
    
    //PART B
   //val lst2=List(3,2,3,2,4,2,1)
   
   val lst2=lst.groupBy(x=>x.length)
   println(lst2)
   val lst3=lst2.map(x=>(x._2)).toList.sortWith((x,y)=>x.length<y.length).flatten
   
    println(lst3)
    
    //playing with groupBy
  
    val lst_char= List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
    val lst_char1=lst_char.groupBy(x=>x)
    println(lst_char1)
    val lst_char_zip=lst_char.zipWithIndex
    val lst_char_zip_grp=lst_char_zip.groupBy(x=>x._1)
    val lst_char_zip_grp_mod=lst_char_zip_grp.map(x=>x._2)
    val lst_char_zip_grp_mod_ext= lst_char_zip_grp_mod.map(x=>x.map(y=>y._1))
    println(lst_char_zip)
    println(lst_char_zip_grp)
    println(lst_char_zip_grp_mod)
    println(lst_char_zip_grp_mod_ext)
  }
}