object question06 extends App{
  println("Enter number")
  var n = scala.io.StdIn.readInt()

  printfibonacci(n)

  def printfibonacci(n:Int):Unit= {
    if (n > 0) printfibonacci(n-1)
    print("%d, %s " . format(fibonacci(n)," "))
  }

  def fibonacci(n:Int):Int= n match{
    case x if x==0 => 0
    case x if x==1 => 1
    case x => fibonacci(n-1)+fibonacci(n-2)
  }
}
