class Solution:
    def isPalindrome(self, st: str) -> bool:
        i=0
        j=len(st)-1
        while(j>i):
            if(not(st[j].isalnum())):
                j=j-1
            elif(not(st[i].isalnum())):
                i=i+1
            elif(st[i].lower() != (st[j].lower())):
                return False
            else:
                i=i+1
                j=j-1
        return True