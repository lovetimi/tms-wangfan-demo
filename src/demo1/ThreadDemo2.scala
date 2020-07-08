package demo1

import java.util.concurrent.{Callable, ExecutorService, Executors, FutureTask}

/**
  * User: van
  * Date: 2018/8/31
  * Time: 13:23
  */
object ThreadDemo2 {

  def main(args: Array[String]): Unit = {
    var threadPool: ExecutorService = Executors.newFixedThreadPool(3)

    try {

      val future = new FutureTask[String](new Callable[String] {
        override def call(): String = {
          Thread.sleep(100)
          return "im result"
        }
      })

      threadPool.execute(future)
      println(future.get())

    } finally {
      threadPool.shutdown()
    }

  }

}
