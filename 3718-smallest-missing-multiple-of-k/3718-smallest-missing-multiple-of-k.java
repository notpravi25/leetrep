class Solution {
    public int missingMultiple(int[] nums, int k) {
          int m = k;
       for(int i = 1; ; i++)
           {
               boolean found = false;
               m = k*i;
               for(int j = 0;j<nums.length;j++)
                   {
                       if(nums[j]==m)
                       {
                           found = true;
                           break;
                       }
                   }
               if(! found){
            return m;
           }
        }
    }
}