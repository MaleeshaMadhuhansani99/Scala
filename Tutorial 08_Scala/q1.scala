case class Point(x:Int, y:Int){
  def a:Int=x
  def b:Int=y

  val add=()=>a+b

  val move=(dx:Int,dy:Int)=>(x+dx,y+dy)

  val distance=(n:Point)=> Math.sqrt((this.a-n.a)*(this.a-n.a) + (this.b-n.b)*(this.b-n.b))

  val switch=()=> (b,a)

}

object q1 extends App {

  val p1= new Point(2,3)
  val p2=new Point(4,6)

  //adding two numbers
  print("Addition : ")
  println(p1.add())

  //move a point by a given distance dx and dy
  print("After Moving : ")
  println(p1.move(1,1))

  //distance between two given points
  print("Distance : ")
  println(p1.distance(p2))

  //switch the x and y coordinates
  print("After switching : ")
  println(p1.switch())

  }
