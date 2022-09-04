object tute extends App {
encodeOrDecode();

def encode(t:String, s:Int, let:Array[Char]) = {
  var cipher_text = "";
  var i=0;
  var len=t.length()-1;
  for (i <- 0 to len){
    var a=0;

    for(j <- 0 to (let.length-1)){
        if(t.charAt(i)==let(j)){
          a=a+1;
        }
    }

    if (a == 0){
      cipher_text = cipher_text + t.charAt(i);

    }else {
      var lt_no=0;
      for(j <- 0 to (let.length-1)){
        if(t.charAt(i)==let(j)){
          lt_no=j;
        }
      }
      var letterNo=lt_no+s;
      if(letterNo>51){
        letterNo=letterNo-52;
        val l=let(letterNo).toLower;
        cipher_text = cipher_text+ l;
      }else if(letterNo>25 && lt_no<26){
        val l=let(letterNo).toUpper;
        cipher_text =cipher_text + l;
      }else{
        cipher_text =cipher_text+ let(letterNo);
      }
    }
  }
  print(cipher_text);
}

def decode(t:String, s:Int, let:Array[Char] )={
  var cipher_text="";
  var i=0;
  var len=t.length()-1;
  for (i <- 0 to len){
    var a=0;

    for(j <- 0 to (let.length-1)){
        if(t.charAt(i)==let(j)){
          a=a+1;
        }
    }
    if (a == 0){
      cipher_text = cipher_text + t.charAt(i);

    }else{
      var lt_no=0;
      for(j <- 0 to (let.length-1)){
        if(t.charAt(i)==let(j)){
          lt_no=j;
        }
      }
        var letterNo=lt_no-s;
        var letter=0;
        if(letterNo<0){
          letterNo=letterNo+26;
          cipher_text = cipher_text+ let(letterNo);
        }else if(letterNo<26 && lt_no>25){
          val l=let(letterNo).toLower;
          cipher_text = cipher_text+ l;
        }else{
          cipher_text =cipher_text+ let(letterNo);
        }
      }
    }
      print(cipher_text);
}


def cipher()={
  var letters  = Array('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z','a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');
  var text=scala.io.StdIn.readLine("Input text :");
  var decission=scala.io.StdIn.readLine("Encode or decode :").toLowerCase();

  if(decission != "encode" && decission != "decode"){
    println("Wrong Input! Try again...");
    decission=scala.io.StdIn.readLine("Encode or decode :").toLowerCase();
  }

  print("Enter number of shifts :");
  var s=scala.io.StdIn.readInt();
  var shift=s%52;

  if (decission== "decode" ){
    decode(text,shift,letters);
  } else if (decission== "encode"){
    encode(text,shift,letters);
  }
}
}
