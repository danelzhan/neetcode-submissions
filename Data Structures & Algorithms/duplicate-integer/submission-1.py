class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        
        temp = []

        for i in nums:
            for j in temp:
                if i == j:
                    return True
            temp.append(i)

        return False
