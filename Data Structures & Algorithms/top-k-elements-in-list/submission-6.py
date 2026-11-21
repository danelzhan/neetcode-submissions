class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        seen = {}
        for i in nums:
            if (seen.get(i) == None):
                seen[i] = 1
            else:
                seen[i] += 1

        buckets = [None] * len(nums)

        for key, value in seen.items():
            if (buckets[value - 1] == None):
                buckets[value - 1] = [key]
            else:
                buckets[value - 1].append(key)

        result = []

        for i in range(len(buckets)):
            if (buckets[len(buckets) - i - 1] != None):
                for j in range(len(buckets[len(buckets) - i - 1])):
                    result.append(buckets[len(buckets) - i - 1][j])

        return result[:k]