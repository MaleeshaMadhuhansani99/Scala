object q2 extends App {
  val x = new Rational(3,4)
  val y = new Rational(5,8)
  val z = new Rational(2,7)

  val answer = x.sub(y).sub(z)
  println(answer)
}

  class Rational(n:Int, d:Int){
    def numer = n
    def denom = d

    def sub(r:Rational) = new Rational(this.numer*r.denom - this.denom*r.numer, this.denom*r.denom)
    override def toString(): String = numer + "/" + denom

  }
