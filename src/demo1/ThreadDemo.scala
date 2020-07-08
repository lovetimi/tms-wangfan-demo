package demo1

import java.util.concurrent.{ExecutorService, Executors}

/**
  * User: van
  * Date: 2018/8/31
  * Time: 13:12
  */
object ThreadDemo {

  def main(args: Array[String]): Unit = {
    val threadPool: ExecutorService = Executors.newFixedThreadPool(3)


    try {
      //提交5个线程
      for (i <- 1 to 5) {
        //threadPool.submit(new ThreadDemo("thread"+i))
        threadPool.execute(new ThreadInnerDemo("thread" + i))
      }
    } finally {
      threadPool.shutdown()
    }

  }


  class ThreadInnerDemo(threadName: String) extends Runnable {
    override def run(): Unit = {
      for (i <- 0 to 10) {

        println(threadName + ": => " + i)
        Thread.sleep(300)

      }
    }

  }


}
