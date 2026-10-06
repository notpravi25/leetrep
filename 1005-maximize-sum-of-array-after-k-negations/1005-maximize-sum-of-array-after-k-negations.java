class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int i = 0;
        while(i<nums.length && nums[i]<0 && k>0){
            nums[i] = -nums[i];
            i++;
            k--;
        }
        int sum =0;
        int min = Integer.MAX_VALUE;
        for(int n :nums){
           sum = sum +n;
           min = Math.min(min, n); 
        }
        if(k%2==1){
            sum = sum-2*min;
        }
        return sum;
    }
}