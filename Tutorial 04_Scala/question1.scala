object question1 extends App {
  def interest(m:Double):Double={
    if(m>20000000) {m* 0.065}
    else if(m>20000000){m* 0.035}
    else if(m>200000){m* 0.045}
    else if(m>20000){m* 0.02}
    else 0
  }

  printf("Input deposite :")
  var depposit = scala.io.StdIn.readFloat()
  print("Interest for "+depposit +" is "+ interest(depposit))
}
