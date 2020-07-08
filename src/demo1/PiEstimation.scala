package demo1

import org.apache.spark.{SparkConf, SparkContext}

/**
  * User: van
  * Date: 2018/8/16
  * Time: 14:19
  */
object PiEstimation {

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf();
    conf.setAppName("RDDTestApplication")
    conf.setMaster("local")

    val sc = new SparkContext(conf);
    val number = 1 to 100
    val rdd = sc.parallelize(number);
    val sum = rdd.reduce(_ + _)
    print("1+2+3+...+99+100=" + sum)

  }

}
