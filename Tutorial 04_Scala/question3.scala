object question3 extends App {

  println(toUpper("Benny"))
  println(formatNames("Niroshan",1))
  println(toLower("Saman"))
  println(formatNames("Kumara",5))

  def toUpper(x: String): String= {
    var str=x.toUpperCase()
    return str
  }

  def toLower(y:String): String={
    var str=y.toLowerCase()
    return str
  }

  def formatNames(name:String, x:Int):String={
    var str=""
    var i=0
    if(x<name.length()){
      while(i!=name.length()){
        if(i==x){
          var letter=name.charAt(i)
          letter=letter.toUpper
          str = str+letter
        }else{
          str= str+name.charAt(i)
        }
        i=i+1
      }

    }
  return str
  }
}
