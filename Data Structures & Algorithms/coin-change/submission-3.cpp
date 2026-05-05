class Solution {
public:

    int helper(vector<int>& coins, int amount, map<int, int>& memo) {
        
        if (memo.find(amount) != memo.end()) {
            std::cout << "memo" << std::endl;
            return memo[amount];
        }

        if (amount < 0) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }

        int min = helper(coins, amount - coins[0], memo);
        for (int i = 0; i < coins.size(); i++) {
            int res = helper(coins, amount - coins[i], memo);
            if (min == -1 && res != -1) {
                min = res;
            } else if (min != -1 && res != -1 && res < min) {
                min = res;
            }
        }

        if (min == -1) {
            memo[amount] = min;
            return -1;
        } else {
            memo[amount] = min + 1;
        }

        return min + 1;

    }

    int coinChange(vector<int>& coins, int amount) {

        // memoize on each amount
        // memoize the shortest path 

        map<int, int> memo;
        return helper(coins, amount, memo);
        
    }
};
