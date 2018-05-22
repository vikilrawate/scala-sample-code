package test

object fibonacci extends App {
  
  //Code for fibonacci series
  
  //solution one
  
  val n = 10;
  
  var prev2 = 0;
  var prev1 = 1;
  
  for(i <- 0 to n-1)
  {
    var res = prev2 + prev1
    print(prev2 +" ")
    prev2 = prev1;
    prev1 = res ;
  }
  println("")
  
  //another solution using functions
   def fib(first:Int=0,second:Int=1):Stream[Int] = 
   {
      Stream.cons(first, fib(second,first + second)).take(10)
    
      
  }
  
  def fibs(a: Int = 0, b: Int = 1): Stream[Int] = Stream.cons(a, fibs(b, a+b)).take(10)
  
  println("Soltion - 2")
  println(fib(10))
  
  println(fibs(0, 1))
  
  println("End of Code")
  
}