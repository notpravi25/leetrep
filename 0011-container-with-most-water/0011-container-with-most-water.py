class Solution:
    def maxArea(self, height: list[int]) -> int:
        s=0
        e=len(height)-1
        m = 0
        while(s!=e):
            m = max(m,(e-s)*(min(height[e],height[s])))
            if(height[s]<height[e]):
                s= s+1
            else:
                e= e-1
        return m
        