package demo1

/**
  * User: van
  * Date: 2018/8/28
  * Time: 15:40
  */
object MapDemo {

  def main(args: Array[String]): Unit = {

    var colors1 = Map("red" -> "#FF0000",
      "azure" -> "#F0FFFF",
      "peru" -> "#CD853F")
    var colors2 = Map("blue" -> "#0033FF",
      "yellow" -> "#FFFF00",
      "red" -> "#FF0000")

    colors2 += ("greenn" -> "green")

    //  ++ 作为运算符
    var colors = colors1 ++ colors2
    println("colors1 ++ colors2 : " + colors)

    //  ++ 作为方法
    colors = colors1.++(colors2)
    println("colors1.++(colors2)) : " + colors)

    colors.keys.foreach { i =>
      print("key: " + i)
      println(";value: " + colors.get(i).get)
    }

  }

}
