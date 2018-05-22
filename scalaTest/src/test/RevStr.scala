package test

import org.apache.hadoop.fs.shell.Tail
import scala.util.control.TailCalls.TailRec
import scala.collection.script.End

object RevStr
{
  //using simple logic
  def main(args : Array[String])
  {
     val name:String = "vikil"
     var res = new StringBuffer("")
  
     val len = name.length
     
    // println(name.charAt(2))
  
    for(i <- 0 to (len-1))
      {
        res.append(name.charAt(len - i -1))       
      // println("vikil1")
      }
       
       print("result 1 : ")
       println(res)
       
       
   // by using functions
       
      def rev1(name:String):String =
       {
         if (name.isEmpty()) 
            ""
         else 
            rev1(name.tail) + name.head
           
       }
       
       rev1("vikil")
       print("result 2 : ")
       println(rev1("Vikil"))
       
       println("End of code")
 }
}