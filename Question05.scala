object Question05 {

  def getReverse(l:List[Any]): List[Any]={
    if (l.isEmpty) return List()
    getReverse(l.tail)++List(l.head)
  }

  def isSame(l1:List[Any],l2:List[Any]):Boolean={
    if(l1.isEmpty && l2.isEmpty) return true
    if(l1.isEmpty || l2.isEmpty) return false
    l1.head==l2.head && isSame(l1.tail,l2.tail)
  }
 
  def palindrome(l :List[Any]): Boolean ={
    isSame(l,getReverse(l))
  }

  def main(args:Array[String]):Unit={
    println(palindrome(List(1,2,2,1)))
    println(palindrome(List(1,2,3,2,1)))
    println(palindrome(List(1,2,2,1,5)))
    println(palindrome(List(4,1,2,2,1,5)))
    println(palindrome(List(4,1,2,2,1)))
  }

}
