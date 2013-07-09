import java.io.File

object Recognize {
  final val MAX_TO_TAKE = 10

  // read in check, calculate on each item, find accuracy for each check
  def test(): List[Double] =
    check.map { x =>
      val res = calculate(x._2)
      println(s"Top five: $res, correct: ${x._1}")
      res.filter(_ == x._1).length / MAX_TO_TAKE.toDouble
    }

  def calculate(target: Seq[Int]): Seq[Int] = {
    val distances: List[(Int, BigDecimal)] = library.map( x => (x._1, calculateDistance(target, x._2)) )
    val fewest = distances.sortWith( (a, b) => a._2 < b._2 ).take(MAX_TO_TAKE)
    fewest.map( x => x._1 )
  }

  private[this] lazy val library: List[(Int, Seq[Int])] = readFile(dataFile)
  private[this] lazy val check: List[(Int, Seq[Int])] = readFile(checkFile)

  private[this] def readFile(file: List[String]): List[(Int, Seq[Int])] = {
    file.drop(linesToDrop).map { line =>
      val split = line.split(",")
      (split.head.toInt -> split.tail.map(_.toInt).toSeq)
    }.toList
  }

  // Set((x1, x2), (y1, y2), (z1, z2))
  private[this] def calculateDistance(target: Seq[Int], training: Seq[Int]): BigDecimal =
    target.zip(training).foldLeft(BigDecimal(0)) { (b, a) => b + math.pow((a._1 - a._2), 2) }

  private[this] val linesToDrop = 1
  private[this] lazy val dataFile: List[String] =
    scala.io.Source.fromFile(new File("src/main/resources/sample.csv")).getLines.toList

  private[this] lazy val checkFile =
    scala.io.Source.fromFile(new File("src/main/resources/check.csv")).getLines.toList
}
