//Question number 01,02,03
 object q123 extends App{

    var k:Int=2;
    var i :Int=2;
    var j :Int=2;
    var m :Int=5;
    var n :Int=5;
    var f:Float=12.0f;
    var g:Float=4.0f;
    var c: Char='X';

    val a:Int=k+12*m;
    val b:Int=m/j;
    val x:Int=n%j;
    val d:Int=m/j*j;
    val e:Float=f/10*5+g;
    //var y:Int = ++i*n;
    //Scala does not support increment or decrement operator
    //as scala developers thought it make the specification more
    //than complex while achieving only negligible benifits
    println(a,b,x,d,e)
  
}
