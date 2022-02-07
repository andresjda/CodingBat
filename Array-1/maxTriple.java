public int maxTriple(int[] nums) {
    int big = 0;
    if(nums[0] > big)
      big = nums[0];
    
    if(nums[nums.length-1] > big)
      big = nums[nums.length-1];
    
    if(nums[nums.length/2] > big) 
      big = nums[nums.length/2];
      
    return big;
  }
