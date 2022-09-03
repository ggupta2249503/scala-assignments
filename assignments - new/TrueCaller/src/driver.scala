import scala.io.Source

//ok
import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._

import java.io.FileNotFoundException


object driver {
  

    
    def prefixChecking(str:String,arr:Array[String],preLst:ArrayBuffer[String]) {
        
        if(arr.contains(str)){
            preLst+=str
        } else {
        breakable { arr.map{ x=>
        var boo= str.startsWith(x)
        
        if(boo){
            preLst+=x
            break
        }
            
        }
    }
        
        
    }
    }
    def main(args: Array[String]) {
        try {
        val arrOfPrefixes = Source.fromFile("sample_prefixes.txt").getLines.toArray
        val arrOfPrefixesSorted=arrOfPrefixes.sortWith(_.length>_.length)
        val preLst= ArrayBuffer[String]()
        //print(linesSorted(0))
        
        val str= "4VdwEEXC8GHTFGH"
        //val str="almaslmlsd"
        prefixChecking("8dLfGZU0T",arrOfPrefixesSorted,preLst)
        
        if(preLst.isEmpty){
            println("No matching prefixes found")
        } else {
           println(preLst(0))
        }
        }
        
        catch {
            case a:FileNotFoundException =>{
                println("File not found")
            }
        }
        
    
}
}
