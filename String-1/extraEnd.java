public String extraEnd(String str) {
    String returning = str.substring(str.length() - 2);
    return returning + returning + returning;
  }