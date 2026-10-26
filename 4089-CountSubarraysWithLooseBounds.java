class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long count = 0;
        long n = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minK || nums[i] > maxK)
                n = 0;
            else
                n++;
            count += n;
        }
        return count;
    }
}
