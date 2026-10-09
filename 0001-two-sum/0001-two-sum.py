class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        d={}
        for i in range(len(nums)):
            if target-nums[i] not in d:
                d[nums[i]]=i
            else:
                return [i,d[target-nums[i]]]