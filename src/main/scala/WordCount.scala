import org.apache.spark.SparkContext
import org.apache.spark.SparkConf
import org.apache.spark.SparkContext._

object WordCount {
   def main (args: Array[String]){
    // create and initialize  SparkContext object by my own SparkConf object
    val conf=new SparkConf().setMaster("local").setAppName("WordCount")
    val sc=new SparkContext(conf)

    // create an RDD named lines by read from outside file
    val lines=sc.textFile("file:/Users/elephant/dev/file/file1.txt")
    // transform to produce  new RDD named words
    val words=lines.flatMap(lines=>lines.split(" "))
    // transform to produce new RDD named counts
    val counts=words.map(word=>(word,1)).reduceByKey(_+_)
    // action actually excute
    counts.saveAsTextFile("file:/Users/elephant/dev/file/output")
  }
}
