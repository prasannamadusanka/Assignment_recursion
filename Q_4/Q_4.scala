object Q_4 extends App {
  def isEven(n:Int):Boolean ={
    if (n==0) true
    else isOdd(n-1)

  }
  def isOdd(n:Int):Boolean = !(isEven(n))

  println(isOdd(10)) 
}
