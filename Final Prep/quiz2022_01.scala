object quiz2022_01 {
  def insertIftrue(l:List[Int],f:Int=>Boolean):List[Int]={
    if (l.isEmpty) return List()
    else if (f(l.head)) return l.head::insertIftrue(l.tail,f)
    else return insertIftrue(l.tail,f)
  }

  def insertIffalse(l: List[Int], f: Int => Boolean): List[Int] = {
    if (l.isEmpty) return List()
    else if (!f(l.head)) return l.head :: insertIffalse(l.tail, f)
    else return insertIffalse(l.tail, f)
  }

  def partition(l:List[Int], f:Int => Boolean):List[List[Int]] = {
    if (l.isEmpty) return List(List(),List())
    List(insertIftrue(l,f),insertIffalse(l,f))
  }

  def f1(x:Int):Boolean = { x%2 == 1 }
  def f2(x:Int):Boolean = { x*x > 10 }

  def main(args: Array[String]): Unit = {
    val l1 = List(1,2,3,4,5)
    println(partition(l1,f1))
    println(partition(l1,f2))
    println(partition(l1,(x => x==0)))
    println(partition(l1,(x => x<6)))
  }
}
