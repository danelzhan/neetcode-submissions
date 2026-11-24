class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        
    # run dfs, mark everything that dfs runs on to 0, count number of dfs runs
        count = 0
        stack = []
        for i in range(len(grid)):
            for j in range(len(grid[i])):
                if grid[i][j] == "1":
                    count += 1
                    self.helper(grid, stack, i, j)
        
        return count


    def helper(self, grid, stack, i, j):
        grid[i][j] = 0

        if grid[min(len(grid)-1, i+1)][j] == '1':
            stack.append((min(len(grid)-1, i+1), j))
        if grid[max(0, i-1)][j] == '1':
            stack.append((max(0, i-1), j))
        if grid[i][min(len(grid[i])-1, j+1)] == '1':
            stack.append((i, min(len(grid[i])-1, j+1)))
        if grid[i][max(0, j-1)] == '1':
            stack.append((i, max(0, j-1)))

        while (len(stack) > 0):
            n = stack.pop()
            return self.helper(grid, stack, n[0], n[1])
        
        return