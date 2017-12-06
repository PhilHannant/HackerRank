object Ransom extends App {

  val magazine: Array[String] = Array("dlji", "eeyfb", "ox", "ayw", "fmphg", "x", "ffbkr", "z", "qiq", "vwvt", "zqgq", "nmw", "hlv", "c", "looms", "ffzif", "wfzx", "gzmf", "ez", "acidl", "mxwcw", "cm", "ichsi", "p", "pltu", "y", "jn", "re", "enujc", "ztm", "k", "s", "pkv", "hv", "om", "bsvw", "czy", "yzm", "lpli", "rj", "rm", "waqyk", "hkxf", "uffv", "rctam", "gp", "c", "enbez", "ngrc", "uos", "wfzx", "z", "hv", "acidl", "mxwcw", "hlv", "dlji", "enujc", "mxwcw", "cm", "p", "om", "pkv", "om", "x", "ox", "enbez", "pkv", "enujc", "rm", "ngrc", "x", "uos", "dlji", "zqgq", "c", "z", "rm", "eeyfb", "bsvw", "c", "dlji", "gzmf", "looms", "re", "p", "mxwcw", "gzmf", "hlv", "hv", "enbez", "y", "pkv", "rm", "y", "p", "gzmf", "ngrc", "gzmf", "wfzx")
  val ransom: Array[String] = Array("ichsi", "c", "c", "uffv", "cm", "jn", "uffv", "s", "rm", "om", "uos", "czy", "czy", "nmw", "hv", "om", "gzmf", "ox", "uos", "pltu", "qiq", "czy", "rj", "vwvt", "s", "c", "ox", "bsvw", "acidl", "ffbkr", "ez", "looms", "ngrc", "yzm", "rj", "dlji", "wfzx", "waqyk", "om", "looms", "z", "om", "waqyk", "zqgq", "wfzx", "om", "dlji", "z", "nmw", "mxwcw")

  val magazineList = magazine.toList
  val ransomList = ransom.toList
  val result = magazineList.filter(d => (ransomList.contains(d)))

  println(ransomList)
  println(result)

  println(ransomList.zip(magazineList).forall { case (fst, snd) => fst == snd })
  val a: Array[String] = Array("dlji", "eeyfb")
  val b: Array[String] = Array("dlji", "eeyfb")
  

  val c = List("two", "times", "three", "is", "not", "four")
  val d = List("two", "times", "two", "is", "four")


  def ransomHelper(magList: List[String], ranList: List[String]): Boolean = ranList match {
    case(x :: xs) if magList.contains(x) => ransomHelper(magList, xs)
    case(x :: xs) if !magList.contains(x) => false
    case(Nil) => true
  }

  println(ransomHelper(magazineList, ransomList))
  println(ransomHelper(a.toList, b.toList))
  println(ransomHelper(c, d))
  if (ransomList.zip(magazineList).forall { case (fst, snd) => fst == snd }) println("Yes")
  else println("No")


}
