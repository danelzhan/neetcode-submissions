class Solution {
public:

    static bool isPalindrome(int l, int r, string s) {
        while (l < r) {
            if (s[l] != s[r]) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    static string getStr(int l, int r, string s) {

        string res = "";
        while (l <= r) {
            res += s[l];
            l++;
        }

        return res;
    }

    static string helper(string s, int l, int r, map<int, string>& memo) {


        if (memo.find(l) != memo.end()) {
            return memo[l];
        }

        bool currValid = isPalindrome(l, r, s);
        string curr = getStr(l, r, s); 

        if (r + 1 == s.size()) {
            if (currValid) {
                return curr;
            } else {
                return getStr(r, r, s);
            }
        }

        string res1 = helper(s, l + 1, r + 1, memo);
        string res2 = helper(s, l, r + 1, memo);

        if (currValid) {
            if (curr.size() >= res1.size() && curr.size() >= res2.size()) {
                memo[l] = curr;
            } else if (res1.size() >= res2.size() && res1.size() >= curr.size()) {
                memo[l] = res1;
            } else if (res2.size() >= res1.size() && res2.size() >= curr.size()) {
                memo[l] = res2;
            }
        } else {
            if (res1.size() > res2.size()) {
                memo[l] = res1;
            } else {
                memo[l] = res2;
            }
        }

        return memo[l];

    }

    string longestPalindrome(string s) {

        // start at i = 0, can check memo to see if it is a palindrome
        // OR has a palindrome in its subtree, memoized via its index
        // return the memoized result if it does, if it doesnt
        // return the max of the next char or the next char appended
        // to current char. base case is when there is no next char
        // so it returns the last char
       
        map<int, string> memo;
        memo[s.size()-1] = s[s.size()-1];

        return helper(s, 0, 0, memo);

    }
};
