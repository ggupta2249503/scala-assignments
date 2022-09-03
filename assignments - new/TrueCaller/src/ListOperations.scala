
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map
object ListOperations {
   
  def main(args:Array[String]) {
    
    
  // P6 checking pallindrome  
  val pal_lst= List(1, 2, 3, 2, 1)
  val rev_pal_lst = pal_lst.reverse
  if (pal_lst == rev_pal_lst) {
    println("pallindrome")
    
  } else {
    println("not palindrome")
  }
  
  //P7 flattening a nested list
  
  val lst_nest=List(List(1, 1), 2, List(3, List(5, 8)))
  
  def func(x:List[Any]):List[Any]= x.flatten{
    
    case a: Int => List(a)
    case b :List[Any] => func(b)
    
  }
  
  val k=func(lst_nest)
  println(k)
  
  
  
  
  //p09 
  val lst_cons=List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
  val lstBuff_cons= new  ListBuffer[Char]()
  
  var lstBuff_mast= new ListBuffer[ListBuffer[Char]]()
   var lstBuff_eq= new ListBuffer[Char]()
   lstBuff_eq+=lst_cons.head
 
val lst2=List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e', 'e')
for(i<-0 to lst_cons.length-2){
 
  if(lst_cons(i)==lst_cons(i+1)){
    
    lstBuff_eq+=lst_cons(i)
  } else {
    //lstBuff_eq+=lst_cons(i)
    lstBuff_mast+=lstBuff_eq
    lstBuff_eq= new ListBuffer[Char]()
    lstBuff_eq+=lst_cons(i+1)
    
  }
  
  
  
}
  lstBuff_mast+=lstBuff_eq
  //lstBuff_mast+=lstBuff_noteq
  println(lstBuff_mast)
  
  
  //p10
 val lst_p10= lstBuff_mast.map(x=>(x.length,x(0)))
 println(lst_p10)
 
 //p11
 val lst_p11=lstBuff_mast.map{
    x=> if (x.length>1){
      (x.length,x(0))
    } else {
      x(0)
    }
  }
  println(lst_p11)
  
 //p12
  
val lst_dec=List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))

val lst_dec_new=lst_dec.map(x=>List.fill(x._1)(x._2)).flatten
println(lst_dec_new)
  
  //p14
  val lst_dup=List('a', 'b', 'c', 'c', 'd')
  val lst_dup_flat=lst_dup.map(x=>List.fill(2)(x)).flatten
  println(lst_dup_flat)
  
  //p16
  val lst_16=List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  val lst_16_zip=lst_16.zipWithIndex.map(x=>(x._1,x._2+1)).filter(x=>x._2%3!=0).map(x=>x._1)
  println(lst_16_zip)
  
  //p17
  val lst_17=List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
  val lstBuff_17= new ListBuffer[Char]()
  val lstBuff_17_new= new ListBuffer[Char]()
  val lstBuff_17_mast= new ListBuffer[ListBuffer[Char]]()
  val findout=lst_17.zipWithIndex.map{x=>
    
    if(x._2<3){
      lstBuff_17+=x._1
    } else {
      lstBuff_17_new+=x._1
    }
    
  }
  lstBuff_17_mast+=lstBuff_17
  lstBuff_17_mast+=lstBuff_17_new
  println(lstBuff_17_mast)
  println(findout)
  
  //p17
  val lst_fil=lst_17.zipWithIndex.filter(x=>x._2<3).map(x=>x._1)
  println(lst_fil)
  val lst_fil_other=lst_17.diff(lst_fil)
  println(lst_fil_other)
  
  //p18
  val lst_slice=lst_17.zipWithIndex.filter(x=>x._2>=3 && x._2<7).map(x=>x._1)
  println(lst_slice)
  
  //p19
  
  //p20
  val lst_20=List('a', 'b', 'c', 'd')
  val lst_20_rem=lst_20.zipWithIndex.filter(x=>x._2!=1).map(x=>x._1)
  println(lst_20_rem)
  
  
  // legato question  to find the frequency of each element in list
  val lst_leg=List(1,2,2,3)
  val map_leg= Map[Int,Int]()
  var count=0
  lst_leg.foreach{x=>
    if(map_leg.contains(x)){
      count=map_leg(x)
      count+=1
      map_leg(x)=count
      count=0
    } else {
      
      map_leg+=(x->1)
      count=0
      
    }
    
  }
  println(map_leg)
  
  //better way to solve legato question
  val lst_leg_map=lst_leg.groupBy(x=>x).map(x=>(x._1,x._2.length))
  println(lst_leg_map)
  
  }

  
}