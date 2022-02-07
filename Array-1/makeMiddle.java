public int[] makeMiddle(int[] nums) {
    int[] k = new int[2];
    k[0] = nums[nums.length/2-1];
    k[1] = nums[nums.length/2];
    return k;
  }
  