public static int sortPermutation(int[] nums) {
        int k = -1;
        for (int i = 0; i < nums.length; i++) {
            if (i == nums[i])
                continue;
            k &= nums[i];

        }
        return (k == -1) ? 0 : k;
    }
