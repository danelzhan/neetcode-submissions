class Solution {
public:

    static int helper(int n, map<int, int>& memo) {

        if (memo.find(n) != memo.end()) {
            
            return memo[n];

        }

        int res = helper(n - 1, memo) + helper(n - 2, memo);
        memo[n] = res;

        return res;


    }

    int climbStairs(int n) {

        map<int, int> memo;

        memo[1] = 1;
        memo[2] = 2;

        return helper(n, memo);
        
    }

    
};
