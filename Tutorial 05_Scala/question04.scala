object question extends App{
  println("Enter number")
  var number = scala.io.StdIn.readInt()

  checkEvenOdd(number)

  def checkEvenOdd(x:Int):Unit ={
    if(x==0){
      print("This is an even number")
    }else if(x==1){
      print("This is an odd number")
    }else{
      checkEvenOdd(x-2)
    }

  }

}
