public String comboString(String a, String b) {
    if (a.length() < b.length ()) {
    return a + b + a;
    } else {
      return b + a + b;
    }
  }
