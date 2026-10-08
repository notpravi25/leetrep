class Solution:
    def moveZeroes(self, nums: list[int]) -> None:
        l=0
        r=0
        while(r<len(nums)):
            if nums[l]==0 and nums[r]!=0:
                temp = nums[l]
                nums[l]=nums[r]
                nums[r]=temp
                r=r+1
                l=l+1
            elif nums[r]!=0 and nums[r]:
                r=r+1
                l=l+1
            else:
                r=r+1
        return nums