class Solution:
    def isPalindrome(self, s: str) -> bool:
        l = 0
        r = len(s) - 1

        s = s.lower()

        while (r > l):
            print(ord(s[r]))
            if (ord(s[l]) < ord('a') or ord(s[l]) > ord('z')) and (ord(s[l]) < ord('0') or ord(s[l]) > ord('9')):
                print('out')
                l += 1

            elif (ord(s[r]) < ord('a') or ord(s[r]) > ord('z')) and (ord(s[r]) < ord('0') or ord(s[r]) > ord('9')):
                print('out')
                r -= 1

            elif s[l] != s[r]:
                return False

            else:
                l += 1
                r -= 1

        return True