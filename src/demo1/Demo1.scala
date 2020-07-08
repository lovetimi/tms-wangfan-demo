package demo1

import scala.collection.mutable
import scala.io.Source

/**
  * User: van
  * Date: 2018/6/26
  * Time: 16:13
  */
object Demo1 {

  def main(args: Array[String]): Unit = {

    val queue = new mutable.Queue[String]()
    var depth = 0
    queue.enqueue("http://www.baidu.com/")
    queue.enqueue("https://csos.cloudcare.cn/")
    while (queue.size > 0) {
      // 把队列中首个元素弹出
      val urlStr = queue.dequeue()
      val result = Source.fromURL(urlStr)
      val lines = result.getLines()
      val regex = """<title>(.*?)</title>""".r

      var string = ""
      for (s <- lines) {
        string += s
        string += "\r\n"
      }
      // 打印查看结果
      println(string)

      val finalArray = regex.findAllIn(string)
      for (m <- finalArray)
        println(m)

    }

  }

}
