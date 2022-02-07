public int[] midThree(int[] nums) {
    int[] n = new int[3];
    
    if(nums.length == 3) 
    return nums;
    
    n[0] = nums[nums.length/2 -1 ];
    n[1] = nums[nums.length/2];
    n[2] = nums[nums.length/2 + 1];
    
    return n;
    
  }
  