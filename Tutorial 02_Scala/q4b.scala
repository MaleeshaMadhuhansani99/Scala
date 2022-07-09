object q4b extends App{
  def attendees(price:Int)={
    120+(15-price)/5*20;
  }
  def rev(price:Int)={
    attendees(price)*price;
  }
  def cost(price:Int)={
    500+3*attendees(price);
  }
  def profit(price:Int)={
    rev(price)-cost(price);
  }
  def highest(t1:Int,t2:Int,t3:Int)={
    var max:Int=0;
    if (t2>t1) {
      max=t2;
    }else{
      max=t1;
    }
    if (max<t3) {
      t3;
    }else{
      max;
    }
  }
   var ticket15:Int=profit(15);
   var ticket10:Int=profit(10);
   var ticket20:Int=profit(20);

   var highestProfit:Int=highest(ticket15,ticket10,ticket20);
   printf("Highest profit is: Rs.");
   println(highestProfit);

}
