public int[] makeEnds(int[] nums) {
    int[] f = new int[2];
    
    f[0] = nums[0];
    f[1] = nums[nums.length-1];
    
    return f;
  }
