object Question08 {

  def getSum(list:List[Int]):Int={
    if (list.isEmpty) 0
    else list.head+getSum(list.tail)
  }

  def sumAll(lists:List[List[Int]]) :List[Int] = {
    if (lists.isEmpty) List()
    else getSum(lists.head)::sumAll(lists.tail)
  }

  def main(args:Array[String]) :Unit={
    println(sumAll(List(List(1,2,3,4,5),List(),List(4,5,0),List(5))))
  }

}
