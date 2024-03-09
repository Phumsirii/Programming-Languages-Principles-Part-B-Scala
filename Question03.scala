object Question03 {

  def member(x:Any,l:List[Any]):Boolean={
    if (l.isEmpty) return false
    if (x==l.head) return true
    member(x,l.tail)
  }
 
  def subList(l1: List[Any], l2:List[Any]): Boolean ={
    if (l1.isEmpty) return true
    if (member(l1.head,l2)) return subList(l1.tail,l2)
    false
  }

  def main(args :Array[String]):Unit={
    println(subList(List(),List(1,2,3,4,-5)))
  }

}
