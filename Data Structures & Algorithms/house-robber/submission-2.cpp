// jk im back cause im the goat
// its always a fucking binary tree
class Solution {
public:

    static int helper(vector<int> nums, map<int,int>& memo, int house) {

        if (memo.find(house) != memo.end()) {
            return memo[house];
        }

        int profit = nums[house] + 
            max(helper(nums, memo, house + 2), 
                helper(nums, memo, min(house + 3, (int)nums.size() - 1)));

        memo[house] = profit;
        return profit;

    }

    int rob(vector<int>& nums) {

        // greedy picking from non visited nodes
        // memoize
        // find max within array

        map<int,int> memo;
        memo[nums.size() - 1] = nums[nums.size() - 1];
        memo[nums.size() - 2] = nums[nums.size() - 2];

        return max(helper(nums, memo, 0), helper(nums, memo, min((int)nums.size() - 1, 1)));

        
    }
};
