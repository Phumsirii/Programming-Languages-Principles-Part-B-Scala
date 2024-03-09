package Questions

object Question01 {
  def insertLast(x: Any, l:List[Any]): List[Any] ={
    l++List(x)
  }

  def main(args: Array[String]): Unit={
    val list=List(1,2,3,4)
    println(insertLast(5,list))
  }

}