public int[] rotateLeft3(int[] nums) {
    int[] done = new int[3];
    done[0] = nums[1];
    done[1] = nums[2];
    done[2] = nums[0];
    return done;
  }
