object Question04 {

  def merge(l1:List[Int],l2:List[Int]):List[Int]={
    if (l1.isEmpty) return l2
    if (l2.isEmpty) return l1
    if (l1.head>l2.head) l2.head::merge(l1,l2.tail)
    else l1.head::merge(l1.tail,l2)
  }

  def firstHalf(l:List[Int],i:Int):List[Int]={
    if (i==0) return List()
    l.head::firstHalf(l.tail,i-1)
  }

  def secondHalf(l:List[Int],i:Int):List[Int]={
    if (i==0) return l
    secondHalf(l.tail,i-1)
  }

  def mergesort(l: List[Int]):List[Int] ={
    if (l.length<=1) return l
    var mid=l.length/2:Int
    merge(mergesort(firstHalf(l,mid)),mergesort(secondHalf(l,mid)))
  }

  def main(args:Array[String]):Unit={
    println(mergesort(List(5,6,7,0,8,2,10)))
    println(mergesort(List()))
    println(mergesort(List(0)))
    println(mergesort(List(0,1,2,3,4,5)))
    println(mergesort(List(5,3,4,0,8,5,1,8)))
    println(mergesort(List(5,4,3,2,1,0)))
    println(mergesort(List(1,1,1,1,1,1)))
  }
}
