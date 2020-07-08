package demo1

/**
  * User: van
  * Date: 2018/8/28
  * Time: 13:48
  */
object CallByNameDemo {

  def main(args: Array[String]): Unit = {

    funct(funSmth())

  }

  def funct(x: => Int) = {
    println("x1=" + x)
    println("x1=" + x)
    println("x1=" + x)
    println("x1=" + x)

  }

  def funSmth() = {
    println("say somthing")
    1
  }


}
