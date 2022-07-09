import scala.io.StdIn.readInt

object q4a extends App{
  def normal(h:Int)={h*250}

  def oT(t:Int)={t*85}

  def tax(s1:Int,n:Int,o:Int)=
    (n>=40 && o>=30)match {
      case true=>s1*0.12;
      case false=>0;
    }

  def salary(n:Int,o:Int)={
      normal(n)+oT(o);
    }

  def takeHomeSalary(nh:Int,oh:Int)={
    var sal=salary(nh,oh);
    sal-tax(sal,nh,oh);
  }


printf("Enter number of normal hours:");
var noOfNomalHours:Int=readInt();

printf("Enter number of OT hours:");
var noOfOTHours:Int=readInt();

printf("Take Home Salary is : Rs.");
println(q4a.takeHomeSalary(noOfNomalHours,noOfOTHours));

}
