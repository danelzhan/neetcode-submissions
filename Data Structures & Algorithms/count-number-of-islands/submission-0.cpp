class Solution {
public:
    int numIslands(vector<vector<char>>& grid) {

        // bfs

        std::queue<std::pair<int,int>> q;
        int count = 0; 
        // start bfs on non marked verticies
        for (int i = 0; i < grid.size(); i++) {
            for (int j = 0; j < grid[0].size(); j++) {

                if (grid[i][j] == '1') {
                    // launch bfs
                    count++;
                    std::pair<int,int> v = std::make_pair(i, j);
                    q.push(v);

                    int l;
                    int k;

                    while (q.size() > 0) {

                        

                        std::pair<int,int> v = q.front();
                        q.pop();
                        l = v.first;
                        k = v.second;

                        grid[l][k] = '2';

                        if (l - 1 >= 0 && grid[l - 1][k] == '1') {
                            v = std::make_pair(l - 1, k);
                            q.push(v);
                        }

                        if (l + 1 < grid.size() && grid[l + 1][k] == '1') {
                            v = std::make_pair(l + 1, k);
                            q.push(v);
                        }

                        if (k - 1 >= 0 && grid[l][k - 1] == '1') {
                            v = std::make_pair(l, k - 1);
                            q.push(v);
                        }

                        if (k + 1 < grid[0].size() && grid[l][k + 1] == '1') {
                            v = std::make_pair(l, k + 1);
                            q.push(v);
                        }
 
                    }


                }

            }
        }

        return count;
        
    }
};
