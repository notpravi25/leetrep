class Solution:
    def findMaxAverage(self, nums: list[int], k: int) -> float:
        s=0
        m=0
    
        for i in range(k):
            s=s+nums[i]
        m=s/k
        for i in range(k,len(nums)):
            s= s+nums[i]-nums[i-k]
            a= s/k
            if(a>m):
                m = a
        return m