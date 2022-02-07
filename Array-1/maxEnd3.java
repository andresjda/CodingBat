public int[] maxEnd3(int[] nums) {
    int[] end = new int[3];
    if(nums[0] > nums[nums.length-1]) {
      end[0] = nums[0];
      end[1] = nums[0];
      end[2] = nums[0];
    } else {
      end[0] = nums[nums.length-1];
      end[1] = nums[nums.length-1];
      end[2] = nums[nums.length-1];
    }
    return end;
}
