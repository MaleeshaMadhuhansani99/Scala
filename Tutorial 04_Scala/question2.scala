object question2 extends App {
  print("Input number :")
  var num=scala.io.StdIn.readInt()
  number(num)

  def number(x: Int):Unit = x match {
    case 0 => println("Zero")
    case y if(y<0) => println("Negative")
                      evenOdd(x)
    case _ => evenOdd(x)
  }

  def evenOdd(x: Int):Unit = x match {
    case y if(y%2==0) => println("Even Number")
    case y if(y%2==1 ) => println("Odd Number")
  }
}
