class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # iterate through list O(m)
        # for each string, create a dictionary for its characters and number of occurances O(n)
        # if a dictionary is already seen, add it to it's set O(n)
        # if not, create new set O(1)
        # return value set O(1)
        # total, O(m * n)

        results = {}
        
        for s in strs:
            chars = [0] * 26
            for c in s:
                chars[ord(c) - ord('a')] += 1
            
            if results.get(tuple(chars)) == None:
                results[tuple(chars)] = [s]
            else:
                results[tuple(chars)].append(s)

        output = [0] * len(results)
        i = 0

        for res in results.values():
            output[i] = list(res)
            i += 1

        
        return output