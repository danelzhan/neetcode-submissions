class Solution {
public:

    static int helper(vector<int>& cost, map<int, int>& memo, int floor) {

        if (floor == cost.size()) {
            return 0;
        }

        if (floor == cost.size() - 1) {
            return cost[floor];
        }

        if (memo.find(floor) != memo.end()) {
            return memo[floor];
        }

        int res = cost[floor] + min(helper(cost, memo, floor + 1), helper(cost, memo, floor + 2));
        memo[floor] = res;

        return res;

    }

    int minCostClimbingStairs(vector<int>& cost) {

        // memoize the costs
        // min the cost for 1 and 2 steps, add the current cost to it
        
        map<int, int> memo;
        return min(helper(cost, memo, 0), helper(cost, memo, 1));
        
    }

};
