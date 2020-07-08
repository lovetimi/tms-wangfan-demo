package demo1

import java.util.concurrent.Executors

import util._
import scala.concurrent.{ExecutionContext, Future}


/**
  * User: van
  * Date: 2018/8/31
  * Time: 13:54
  */
object FetureDemo {

  def main(args: Array[String]): Unit = {

    Future { Thread.sleep(3000); println("hi") }(ExecutionContext.fromExecutor(Executors.newFixedThreadPool(1))
    )
    println("waiting")


    println(Try(10).flatMap { x => Try(x + "abc") })
    println(Try(10 / 0).flatMap { x => Try(x + "abc") })

    println(Try(10 / 2) match {
      case Success(value) => value;
      case Failure(exception) => exception.getStackTrace
    })

    Thread.sleep(5000)

  }


}
