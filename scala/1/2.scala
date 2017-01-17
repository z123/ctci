def reverseStr(s: String): String = {
  val charArray = s.toCharArray
  for (i <- (0 to s.length / 2)) {
    val temp = charArray(i)
    charArray(i) = charArray(s.length - 1 - i)
    charArray(s.length - 1 - i) = temp
  }
  charArray.mkString
}
