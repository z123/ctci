
//def allUniqueCharacters(s: String): Boolean = {
  //s = s.sorted
  //var prev = ''
  //for (i <- (0 until s.length)) {
    //if (prev == s(i)) {
      
    //} else {
      //prev = s(i)
    //}
  //}
//}


def allUniqueCharactersRecursive(s: String): Boolean = {
  def helper(prev: Char, s: String): Boolean = {
    if (s.length == 0) {
      true
    } else if (prev == s(0)) {
      false
    } else {
      helper(s(0), s.substring(1))
    }
  }

  helper(s(0), s.sorted.substring(1))
}
