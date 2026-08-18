class Solution {
    public int[] singleNumber(int[] nums) {
       int xy_xor = 0;
        for (int num : nums) {
            xy_xor ^= num;
        }
        long diff_bit = (long) xy_xor & -(long) xy_xor;
        int x = 0;
        int y = 0;
        for (int num : nums) {
            if ((num & diff_bit) != 0) {
                x ^= num;
            } else {
                y ^= num;
            }
        }
        return new int[]{x, y}; 
    }
}