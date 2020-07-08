package demo1

/**
  * User: van
  * Date: 2018/8/28
  * Time: 11:35
  */
object Drunkard {

  //最开始拥有的软妹币
  var money = 10

  //每天喝掉一个软妹币
  def drink: Unit = {
    money -= 1
  }

  //数钱时要算上被喝掉的软妹币
  def count: Int = {
    drink
    money
  }

  //每天都数钱
  def printByName(x: => Int): Unit = {
    for (i <- 0 until 5)
      println(x)
  }

  def printByValue(x: Int): Unit = {
    for (i <- 0 until 5)
      println(x)
  }

  def main(args: Array[String]) = {
    printByName(count)
    printByValue(count)
  }

}
