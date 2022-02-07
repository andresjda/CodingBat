public boolean double23(int[] nums) {
    if(nums.length > 1){
        if(nums[0] == 2 || nums[0] == 3) {
            if(nums[0] == nums[1]){
                return true;
            }
        }
    }
    return false;
}
