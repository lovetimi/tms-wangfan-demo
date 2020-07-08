package demo4

object RecursionDemo {

  def main(args: Array[String]): Unit = {
    val result = tailStack(1)
    println(result)
  }


  /**
    * recursive
    *
    * @param o
    * @return
    */
  def stackOverFlow(o: Int): Int = {
    val result = o + 1
    if (result < 100000) stackOverFlow(result)
    result
  }

  /**
    * tail recursive
    *
    * @param o
    * @return
    */
  def tailStack(o: Int): Int = {
    val result = o + 1
    if (result > 100000)
      result
    else
      tailStack(result)

  }


}
