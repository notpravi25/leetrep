class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int i =0; int j =1;
        while(i<j && j<nums.length){
            if(nums[i]==nums[j]){
                return nums[j];
            }
            else{
                i++;
                j++;
            }
        }
        return -1;
    }
}