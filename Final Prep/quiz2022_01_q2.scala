object quiz2022_01_q2 {
  def compliment(f:Int => Int):Int => Int ={
    (x:Int)=> -f(x)
  }

  def f1(x:Int):Int ={ x -1000 }

  def main(args: Array[String]): Unit = {
    println(compliment((x => x*x))(-5))
    println(compliment((x => x*x))(3))
    println(compliment((x => -1*x*x))(3))
    val c = compliment(f1)
    println(c(3))
    println(c(3000))
  }
}
