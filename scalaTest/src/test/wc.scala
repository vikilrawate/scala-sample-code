package test

 import org.apache.spark.SparkConf
 import org.apache.spark.SparkContext
 import org.slf4j.event.Level
 import org.apache.log4j.Logger
 
object wc {
  
  def main(args: Array[String])   {
    
    
 //Create conf object
 val conf = new SparkConf()
                .setAppName("WordCount")
                .setMaster("local[4]")
 
 //create spark context object
 val sc = new SparkContext(conf)
   
 //Warn msg after spark context created
    sc.setLogLevel("ERROR")
    sc.setLogLevel("WARN")
    //sc.setLogLevel("INFO")
 /*
//Check whether sufficient params are supplied
 if (args.length < 2) {
 println("Usage: ScalaWordCount <input> <output>")
 System.exit(1)
 }
 * 
 * 
 */
 //Read file and create RDD
 val rawData = sc.textFile("C:/spark/test1.txt")
 
 //convert the lines into words using flatMap operation
 val words = rawData.flatMap(line => line.split(","))
 
 //count the individual words using map and reduceByKey operation
 val wordCount = words.map(word => (word, 1)).reduceByKey(_+_)
 
 //Save the result
 wordCount.collect()
 wordCount.count()
 wordCount.foreach(println)
 println("End of the wordCount program")
 
//stop the spark context
 sc.stop
 }
}