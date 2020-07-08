package demo1

/**
  * User: van
  * Date: 2018/8/29
  * Time: 14:15
  */
object TupleDemo {

  def main(args: Array[String]): Unit = {

    var sss = ("aa",1,"sss",23)

    println(sss._1)

    sss.productIterator foreach println

    for(x<-sss.productIterator)
      println(x)

  }

}
