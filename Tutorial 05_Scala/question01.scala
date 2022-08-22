object question extends App{
  println("Enter number")
  var number = scala.io.StdIn.readInt()

  var b=prime(number)
  if (b==true){
    print("True")
  }else{
    print("False")
  }

  def prime(x:Int, y:Int=2): Boolean ={
    if(x==1 || x== 2){
      return true
    }else{
      if ((x%y!=0) && (y<x)){
        prime(x,(y+1))
      }else if(y==x){
        return true
      }else{
        return false
      }
    }
  }

}
