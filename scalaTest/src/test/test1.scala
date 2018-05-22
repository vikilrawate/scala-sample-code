package test


object test1 {
  
  def main(args : Array[String]) : Unit =
  {
    print("Welcome in SCALA world")
    
    val name = "Vikil"
    
    val list1 = List(1,10,34,54)
    
   // name.foreach(println)
    
    println(name)
    println(list1)
    
    // it will display the all the element in saperate line
    list1.foreach(println)
    
    
    for(i <- 10 to 1)
    {
      println(i)
      
    }
   
    
    
    
  }
  
  
  // This will print first before main method
  // println("Welcome in SCALA world 1")
  
}