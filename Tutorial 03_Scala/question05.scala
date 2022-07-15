object question05 extends App {
  def easyPace( a : Int):Int = 8 * a;

  def  tempo( b : Int ):Int = 7 * b;

  printf("Total running time is ");
  print( easyPace(4) + tempo(3));
  printf(" minutes.");
}
