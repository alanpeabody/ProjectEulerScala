class FibonacciSum(max: Int) {
  def printSum = {
    println("The sum of even numbers in the fibonacci sequence under " + max + " is " + sum)
  }

  def sum: Int = {
    evenFibonacci.foldLeft(0) ((sum, i) => sum + i)
  }

  def evenFibonacci = {
    fibonacci(Nil).filter(i => i % 2 == 0)
  }

  def fibonacci(soFar: List[Int]): List[Int] = soFar match {
    case Nil => fibonacci(List(2,1))
    case soFar if soFar.head > max => soFar.tail
    case _ => fibonacci(soFar.tail.head + soFar.head :: soFar)
  }

}
val smallSum = new FibonacciSum(10)
smallSum.printSum

val largeSum = new FibonacciSum(4000000)
largeSum.printSum
