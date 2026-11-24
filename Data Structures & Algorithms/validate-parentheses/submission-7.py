class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        pairs = {')' : '(', '}' : '{', ']' : '['}
        for c in s:
            if c == '(' or c == '{' or c == '[':
                stack.append(c)
            elif len(stack) >= 1 and stack[-1] == pairs[c]:
                stack.pop()
            else:
                return False
        
        return stack == []