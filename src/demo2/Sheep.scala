package demo2

/**
  * User: van
  * Date: 2018/9/4
  * Time: 15:11
  */
class Sheep(val name: String) extends Animal(name) {


  def run() {
    println(name + " run!!!")
  }

}
