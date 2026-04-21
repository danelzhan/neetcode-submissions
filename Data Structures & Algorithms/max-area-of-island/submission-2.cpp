class Solution {
public:
    int maxAreaOfIsland(vector<vector<int>>& grid) {

        // loop through entire grid
        // launch bfs on non visited verticies
        // have a for each bfs, save the largest count
        // return the largest count
        
        int result = 0;
        queue<pair<int, int>> q;

        for (int row = 0; row < grid.size(); row++) {
            for (int col = 0; col < grid[row].size(); col++) {

                if (grid[row][col] == 1) {
                    
                    pair<int, int> v = make_pair(row, col);
                    grid[row][col] = -1;
                    q.push(v);

                    int count = 0;

                    while (q.size() > 0) {

                        count++;
                        
                        pair<int, int> current = q.front();
                        q.pop();
                        int i = current.first;
                        int j = current.second;

                        if (i - 1 >= 0 && grid[i-1][j] == 1) {
                            pair<int, int> next = make_pair(i-1, j);
                            grid[i-1][j] = -1;
                            q.push(next);
                        }

                        if (i + 1 < grid.size() && grid[i+1][j] == 1) {
                            pair<int, int> next = make_pair(i+1, j);
                            grid[i+1][j] = -1;
                            q.push(next);
                        }

                        if (j - 1 >= 0 && grid[i][j-1] == 1) {
                            pair<int, int> next = make_pair(i, j-1);
                            grid[i][j-1] = -1;
                            q.push(next);
                        }

                        if (j + 1 < grid[i].size() && grid[i][j+1] == 1) {
                            pair<int, int> next = make_pair(i, j+1);
                            grid[i][j+1] = -1;
                            q.push(next);
                        }

                    }
                    
                    if (count > result) {
                        result = count;
                    }

                }

            }
        }

        return result;
        
    }
};
