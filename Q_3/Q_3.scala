object Q_3 extends App {
   def getSum(n:Int):Int=n match{
     case 1=>1
     case _=>n+getSum(n-1)
   }
   println(getSum(5))
}
