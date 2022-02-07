public int[] biggerTwo(int[] a, int[] b) {
    int ba = 0;
    int bb = 0;
    
    for(int i = 0; i < a.length; i++) {
      ba += a[i];
    }
    
    for(int i = 0; i < a.length; i++) {
      bb += b[i];
    }
    
    if(ba < bb) {
      return b;
    } else {
      return a;
    }
  }
  