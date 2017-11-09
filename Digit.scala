

object Digit extends App {
  val myseq = Seq(1,2,3,4,5,6,7,8,9,10) //sequence 
   

def nthRecursive[A](n: Int, ls: Seq[A]): A = (n, ls) match {
        case (0, h :: _   ) => h
        case (n, _ :: tail) => nthRecursive(n - 1, tail)
        case (_, Nil      ) => throw new NoSuchElementException
  }
      println(nthRecursive(6,myseq))
}