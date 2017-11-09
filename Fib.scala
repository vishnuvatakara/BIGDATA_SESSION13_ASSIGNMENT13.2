 object FIB{ //class object
  
  def fibseq(n: Int):Seq[Int] = {//function with parameter n
       var num1 = 0  //variable declaration 
       var num2 = 1
       for( i <- 1 to n) yield { //for loop 1 to n
         //implements fib logic
         var num3 = num1 + num2
         num1 = num2
         num2 = num3
         num1
         
       }
       
  }
  def main(args:Array[String])//main function
  {
      println(fibseq(9))  //function calling
  }
 }   