object Q_2 extends App{

    def GCD(x:Int,y:Int):Int=y match{
      case 0=>x
      case y if(y>x)=>GCD(y,x)
      case _=>GCD(y,x%y)
    }
    def isPrime(p:Int,n:Int=2):Boolean =n match{
      case n if(n==p)=>true
      case n if GCD(p,n)>1=>false
      case _=>isPrime(p,n+1)
    }
  def primeseq(n:Int):Any={
    if(n==2) println(2)
    else{
      primeseq(n-1)
      if(isPrime(n)) {println(n)}

    }
  }
  primeseq(20)

}
