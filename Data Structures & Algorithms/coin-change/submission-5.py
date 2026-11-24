class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        # memoized tree?
        memo = {}
        return self.helper(coins, amount, memo)

    def helper(self, coins, amount, memo):
        if memo.get(amount) != None:
            return memo[amount]

        if amount == 0:
            return 0
        
        if amount < 0:
            return -1

        res = []
        count = 0
        for i in coins:
            local = self.helper(coins, amount - i, memo)
            if (local != -1):
                count += 1
                res.append(local)
        
        if count == 0:
            memo[amount] = -1
            return -1
        
        memo[amount] = 1 + min(res)
            
        return memo[amount]