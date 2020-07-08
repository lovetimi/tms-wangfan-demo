package demo2

/**
  * User: van
  * Date: 2018/9/4
  * Time: 15:13
  */
object ExtendDemo {

  def main(args: Array[String]): Unit = {
    val sheep = new Sheep("mie");
    sheep.run();
    sheep.eat("glass")
    val s = "f";
    println(rMatch(s))
  }

  def rMatch(s: String) = s match {
    case "a" => "A"
    case "b" => "B"
    case _ => "nil"
  }

}
