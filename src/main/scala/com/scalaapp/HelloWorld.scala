// First Scala app
/*
 * Basic Hello World App
 */

/**
  * This is the main object for the Hello World App.
  * This is a { Scala Doc Comment }.
  */
object HelloWorld {
  /**
    * This is the main method for the application.
    * @param args are the arguments received by the application.
    */
  def main(args: Array[String]): Unit = {
    println("To: World, From: Scala")

    max_num()

    num_power_of_num(3)
  }

  def max_num() = {
    val ages = Seq(42, 75, 29, 64)
    println(s"The oldest person is ${ages.max}")
  }

  def num_power_of_num(x: Int) : Int = {
    var result = x * x
    print(result)
    return result
  }
}