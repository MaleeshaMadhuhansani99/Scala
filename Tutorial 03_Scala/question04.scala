object question04 extends App {

  def totalCoverPrice(n: Int):Double = 24.95 * n;

  def discout(n:Int):Double= 24.95 * 0.4 * n;

  def shipping(n:Int):Double={
    if (n<=50) {
      n*3;
    }else{
      50 * 3 + ( n - 50 ) * 0.75;
    }
  }

  def totalCost(n:Int):Double={
    totalCoverPrice(n) - discout(n) + shipping(n:Int);
  }

  printf("Total wholesale cost for 60 copies is Rs. ");
  println (totalCost(60));

}
