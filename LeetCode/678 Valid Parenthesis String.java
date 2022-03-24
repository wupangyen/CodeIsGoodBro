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

  # Solution with Stack                  
  class Solution:
    def checkValidString(self, s: str) -> bool:
        
        stack1 = []
        stack2 = []
        
        for index,elem in enumerate(s):
            
            if elem == "(":
                stack1.append(index)
            elif elem == "*":
                stack2.append(index)
            
            else:
                # check if stack1 not empty
                if stack1:
                    stack1.pop()
                elif stack2:
                    stack2.pop()
                else:
                    return False
        
        
        while stack1 and stack2:
            pos1 = stack1.pop()
            pos2 = stack2.pop()
            
            if pos2 < pos1:
                return False
        
        return len(stack1) == 0
            
