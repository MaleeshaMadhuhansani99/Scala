object question05 extends App{
  println("Enter number")
  var n = scala.io.StdIn.readInt()

  print(getEvenSum(n-1))

  def getEvenSum(x:Int):Int ={
    if(x<=1){
      return x
    }else if(x%2==1){
      return (x-1)+ getEvenSum(x-3)
    }else{
      return x+ getEvenSum(x-2)
    }

  }
}
