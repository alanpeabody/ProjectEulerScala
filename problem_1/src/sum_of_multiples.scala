class SumOfMultiples(start:Int, stop:Int) {
  val range = start to stop

  def printSum = {
    println("The sum of all the multiples of 3 and 5 between " + start + " and " + stop + " is " + sum)
  }

  def sum:Int = {
    multiples.foldLeft(0)((sum,i) => sum + i)
  }

  private def multiples = {
    range.filter(number => multipleOfThreeOrFive(number))
  }

  private def multipleOfThreeOrFive(number:Int):Boolean = {
    number % 3 == 0 || number % 5 == 0
  }

}
val smallSum = new SumOfMultiples(0,9)
smallSum.printSum

val largeSum = new SumOfMultiples(0,999)
largeSum.printSum
