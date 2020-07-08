package demo1

/**
  * User: van
  * Date: 2018/8/17
  * Time: 14:06
  */
object LabmdaDemo1 {

  def main(args: Array[String]): Unit = {

    val newList = List(1, 2, 3).map { (x: Int) => x * 2 }
    for (elem <- newList) {
      println(elem)
    }

    val dd = doubles(2)
    println(dd)

    println(cha("12323")("asd"));


    println(f2(11))

    println(strFun("abc"))

    println(addFun("abc", "def"))

    println(addfun1("bbbb"))

  }

  def doubles(x: => Int) = {
    println("Now doubling " + x)
    x * 2
  }

  def cha(str: String)(str1: String): Int = str.length - str1.length

  val f2: Int => String = myInt => "my int v2: " + myInt.toString

  var strFun: String => String = myAddfun => "myAddfun result is " + myAddfun

  var addFun: Function2[String, String, String] = (str1, str2) => "result is " + str1 + str2

  var addfun1: Function1[String, String] = str1 => "result is " + str1 + "aaaaaaaa"


}
