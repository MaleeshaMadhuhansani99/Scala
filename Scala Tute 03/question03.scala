object question03 extends App {

  def volume(r: Double): Double = (4/3) * math.Pi *r *r *r;

  printf("The volume of a sphere is ");
  println(volume(5));

}
