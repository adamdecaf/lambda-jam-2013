
object Boot {
  def main(args: Array[String]) {
    //Recognize.count

    val scores = Recognize.test()
    val sum = scores.sum
    val length = scores.length
    println("Total Score: " + (sum / length))
  }
}