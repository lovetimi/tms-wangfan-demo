package demo1

import org.apache.spark.{SparkConf, SparkContext}

/**
  * User: van
  * Date: 2019/7/12
  */
object WordCountApp {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setAppName("Spark Pi")
    val spark = new SparkContext(conf)
    val slices = if (args.length > 0) args(0).toInt else 2
    val n = 100000 * slices
    val count = spark.parallelize(1 to n, slices).map { i =>
      val x = Math.random * 2 - 1
      val y = Math.random * 2 - 1
      if (x * x + y * y < 1) 1 else 0
    }.reduce(_ + _)
    println("Pi is roughly " + 4.0 * count / n)
    spark.stop()

  }

}
