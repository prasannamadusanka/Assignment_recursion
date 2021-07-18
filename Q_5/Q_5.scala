object Q_5 extends App {
  def isEven(n:Int):Boolean ={
    if (n==0) true
    else isOdd(n-1)

  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  def tru()=true

  def evenSum(n:Int):Int={
    if(n==2) 2
    else{
      if (isEven(n)) {n + evenSum(n-2)}
      else {evenSum(n-1)}
    }
  }
  println(evenSum(15))

}
