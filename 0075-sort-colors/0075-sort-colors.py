class Solution:
    def sortColors(self, nums: list[int]) -> None:
        s = 0
        e = len(nums)-1
        m =0
        while(m<=e):
            if(nums[m]==0):
                nums[s],nums[m] = nums[m],nums[s]
                s=s+1
                m=m+1
            elif(nums[m]==2):
                nums[e],nums[m] = nums[m],nums[e]
                e= e-1
            else:
                m=m+1
     
            
        