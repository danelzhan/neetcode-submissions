class Solution:
    def maxArea(self, heights: List[int]) -> int:

        l = 0
        r = len(heights) - 1
        res = 0

        while (r > l):
            area = (r - l) * min(heights[r], heights[l])

            if area > res:
                res = area

            if heights[r] > heights[l]:
                l += 1
            elif heights[r] <= heights[l]:
                r -= 1

        return res