package demo1

/**
  * User: van
  * Date: 2019-09-10
  * Time: 16:48
  */
object Demo111 {

  def main(args: Array[String]): Unit = {

    val result = func(100000,0);
    println(result)

  }

  def func(m:Int,n:Int):Int ={
    if(m == 0 ){
      return n
    }else{
      return func(m-1,n+m)
    }
  }

}
