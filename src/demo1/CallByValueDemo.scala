package demo1

/**
  * User: van
  * Date: 2018/8/28
  * Time: 14:09
  */
object CallByValueDemo {

  def main(args: Array[String]): Unit = {

    funct(saySmth())


  }

  def funct(x: Int): Unit = {
    println("x1=" + x)
    println("x1=" + x)
    println("x1=" + x)
    println("x1=" + x)
  }

  def saySmth() = {
    println("say somthing")
    1
  }


}
