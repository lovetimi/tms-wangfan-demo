package demo1

/**
  * User: van
  * Date: 2018/8/29
  * Time: 17:00
  */
object ListDemo {

  def main(args: Array[String]): Unit = {

    val sss = List("111", "222", "3333", "4444")

    println(sss)

    var asd =  sss toSeq

    println(asd)

    asd foreach println

    //sss foreach println

     var str = "1232"

     println (str substring(1,2))


    val dd = "1123" :: "sdfsdf" :: sss

    dd foreach println

  }

}
