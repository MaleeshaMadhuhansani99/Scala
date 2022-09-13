object q1 extends App {
  val obj1 = new Rational(2,0)
  println(obj1.neg)
}

  class Rational(n:Int, d:Int){
    require(d>0,"d must be greater than 0")
    def numer = n
    def denom = d
    // def numer = n/gcd(n,d)
    // def denom = d/gcd(n,d)

    // private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b,a)

    def neg = new Rational(-this.numer, this.denom)
    override def toString(): String = numer + "/" + denom

}
