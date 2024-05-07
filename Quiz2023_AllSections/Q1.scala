

object Q1 {

  def merge(l1: List[Int], l2: List[Int]): List[Int] = {
    if (l1.isEmpty) return l2
    if (l2.isEmpty) return l1
    if (l1.head > l2.head) l2.head :: merge(l1, l2.tail)
    else l1.head :: merge(l1.tail, l2)
  }

  def firstHalf(l: List[Int], i: Int): List[Int] = {
    if (i == 0) return List()
    l.head :: firstHalf(l.tail, i - 1)
  }

  def secondHalf(l: List[Int], i: Int): List[Int] = {
    if (i == 0) return l
    secondHalf(l.tail, i - 1)
  }

  def mergesort(l: List[Int]): List[Int] = {
    if (l.length <= 1) return l
    var mid = l.length / 2: Int
    merge(mergesort(firstHalf(l, mid)), mergesort(secondHalf(l, mid)))
  }

  def appendfirsthalf(l:List[Int],i:Int):List[Int]={
    if(i==0) return List()
    l.head::appendfirsthalf(l.tail,i-1)
  }

  def appendsecondhalf(l:List[Int],i:Int):List[Int]={
    if (i==0) return l
    appendsecondhalf(l.tail,i-1)
  }

  def sortTwoLists(l1:List[Int],l2:List[Int]): (List[Int],List[Int]) = {
    return (appendfirsthalf(mergesort(l1++l2),l1.length),appendsecondhalf(mergesort(l1++l2),l1.length))
  }





}
