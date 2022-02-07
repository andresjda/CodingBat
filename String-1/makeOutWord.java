public String makeOutWord(String out, String word) {
    String returnStr;
    String p1 = out.substring(0,2);
    String p2 = out.substring(2,4);
    returnStr = p1 + word + p2;
    
    
    return returnStr;
  }
