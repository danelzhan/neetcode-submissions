class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        
        seen = {}
        
        for c in s:
            if seen.get(c) == None:
                seen.update({c : 1})
            else:
                seen.update({c : seen.get(c) + 1})
        
        for c in t:
            if seen.get(c) == None:
                seen.update({c : -1})
            else:
                seen.update({c : seen.get(c) - 1})

        for c in seen.values():
            if (c != 0):
                return False
        
        return True