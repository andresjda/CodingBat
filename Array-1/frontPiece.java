public int[] frontPiece(int[] nums) {
    if(nums.length == 0 || nums.length == 1 || nums.length == 2)
      return nums;
    
    int[] end = new int[2];
    end[0] = nums[0];
    end[1] = nums[1];
    
    return end;
    
  }
  