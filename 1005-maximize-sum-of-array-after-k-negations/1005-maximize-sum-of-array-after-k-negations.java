class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {

        Arrays.sort(nums);

        int i = 0;

        while(k > 0) {

            if(nums[i] < 0) {

                nums[i] = -nums[i];
                i++;

                if(i == nums.length) {
                    Arrays.sort(nums);
                    i = 0;
                }

            } else {

                Arrays.sort(nums);
                i = 0;

                nums[i] = -nums[i];

                i = 0;
            }

            k--;
        }

        int sum = 0;

        for(int x : nums) {
            sum += x;
        }

        return sum;
    }
}