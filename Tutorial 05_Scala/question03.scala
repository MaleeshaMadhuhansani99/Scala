object question extends App{
  println("Enter number")
  var number = scala.io.StdIn.readInt()

  print(getSum(number))

  def getSum(x:Int):Int ={

    if(x<=1){
      return x

    }else{
      return x+ getSum(x-1)
    }

  }

}
