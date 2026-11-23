class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        fwd_pass = [None] * len(nums)
        rev_pass = [None] * len(nums)
       
        ftotal = 1
        btotal = 1
        for i in range(len(nums)):
            ftotal = nums[i] * ftotal
            btotal = nums[len(nums) - i - 1] * btotal
            fwd_pass[i] = ftotal
            rev_pass[len(nums) - 1 - i] = btotal

        result = [None] * len(nums)

        for i in range(len(nums)):
            if i == 0:
                result[i] = rev_pass[i + 1]
            elif i == len(nums) - 1:
                result[i] = fwd_pass[i - 1]
            else:
                result[i] = rev_pass[i + 1] * fwd_pass[i - 1]

        return result


