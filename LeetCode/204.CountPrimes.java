class Solution:
    def countPrimes(self, n: int) -> int:
        
        list1 = []
        count = 0
        for i in range(0,n+1):
            list1.append(i)
        
        
        for index in range(2,n+1):
            if list1[index] != 0:
                count += 1
                
                for current in range (index * index , n + 1, index):
                    list1[current] = 0
        
        return count
                    
