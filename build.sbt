name := "Learn Spark--WordCount"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies ++=Seq(
"org.apache.spark"%"spark-core_2.10"%"1.5.1"%"provided",

"org.apache.hadoop"%"hadoop-client"%"2.6.0"%"provided"

)