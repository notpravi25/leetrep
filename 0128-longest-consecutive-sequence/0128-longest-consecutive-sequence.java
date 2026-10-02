class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int max = 1;
        int count = 1;
        int i = 0;
        if (nums.length == 0) {
            return 0;
        }
        while (i + 1 < nums.length) {
            if (nums[i + 1] - nums[i] == 1) {
                count++;
                max = Math.max(count, max);
            } else if (nums[i + 1] - nums[i] > 1) {
                count = 1;
            }
            i++;
        }
        return max;
    }
}