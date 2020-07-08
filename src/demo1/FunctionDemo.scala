package demo1

/**
  * User: van
  * Date: 2018/7/24
  * Time: 13:51
  */
object FunctionDemo {

  def main(args: Array[String]): Unit = {
    //    sayHello()
    //    (1 to 9).map("^" * _).foreach(println _)
    val f1 = f(2)
    val f4 = f1(4)
    println(f4)
    val f8 = f1(8)
    println(f8)

    val mf1 = mf(2, _: Int)
    val mf4 = mf1(4)
    println(mf4)

    runInThread{
      println("hello world")
    }

  }

  def sayHello() = {
    println("Hello World")
  }

  def multiply(x: Int)(y: Int): Int = x * y

  val f = multiply _

  def multiplyNext(x: Int, y: Int) = x * y

  val mf = multiplyNext _

  def runInThread(block: => Unit) {
    new Thread {
      override def run(): Unit = {
        block
      }
    }.start()
  }

}
