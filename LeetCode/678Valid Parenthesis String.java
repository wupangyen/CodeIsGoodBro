class Solution:
    def checkValidString(self, s: str) -> bool:
        cmin = 0
        cmax = 0
        
        for elem in s:
            
            if elem == '(':
                cmax += 1
                cmin += 1
            if elem == ')':
                cmax -= 1
                cmin = max(0,cmin -1)
            if elem == '*':
                cmax += 1
                cmin = max(0, cmin -1)
            
            if cmax < 0:
                return False
        
        return cmin == 0
