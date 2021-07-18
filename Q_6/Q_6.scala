object Q_6 extends App {
  def fib(n:Int):Int = n match{
    case 0=>0
    case 1=>1
    case _=>fib(n-1)+fib(n-2)

  }
  def fibSeq(n:Int):Any = {
    if(n==0) println(0)
    else{
      fibSeq(n-1)
      println(fib(n))

    }
  }
  println(fibSeq(9))

}
