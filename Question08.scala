object Question08 {

  def getbyindex(list:List[Int],index:Int,current:Int):Int={
    if (list.isEmpty) return 0
    if (index==current) return list.head
    getbyindex(list.tail,index, current+1)
  }

  def getSumByindex(lists:List[List[Int]],index:Int,currentSum:Int):Int={
    if (lists.isEmpty) return currentSum
    getSumByindex(lists.tail,index, currentSum+getbyindex(lists.head,index,0))
  }

  def getmaxsize(currentmax:Int,lists:List[List[Int]]):Int={
    if (lists.isEmpty) return currentmax
    if (lists.head.size>currentmax) return getmaxsize(lists.head.size,lists.tail)
    return getmaxsize(currentmax,lists.tail)
  }

  def sumAllOperate(lists:List[List[Int]],currentidx:Int,resultidx:Int) :List[Int] = {
    if (currentidx>=resultidx) return List()
    return getSumByindex(lists,currentidx,0)::sumAllOperate(lists,currentidx+1,resultidx)
  }

  def sumAll(lists: List[List[Int]]):List[Int]={
    sumAllOperate(lists,0,getmaxsize(0,lists))
  }

  def main(args:Array[String]) :Unit={
    println(sumAll(List()))
    println(sumAll(List(List())))
    println(sumAll(List(List(1,2,3,4),List(),List(4,5),List(1,2,3,4,5,6))))
    println(sumAll(List(List(3,4),List(1,2,3,4,5,6),List(1,2,3,4))))
    println(sumAll(List(List(1,2,3,4,5,6),List(1,2,3,4),List(1,2),List(0,0,0,0,0,0,0,0,9))))
  }

}