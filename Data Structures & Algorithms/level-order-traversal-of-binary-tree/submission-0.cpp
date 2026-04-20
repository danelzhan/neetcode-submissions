/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    vector<vector<int>> levelOrder(TreeNode* root) {

        std::vector<std::queue<TreeNode*>> q;
        std::vector<std::vector<int>> result;
        if (root == nullptr) {
            return result;
        }
        int level = 0;
        std::queue<TreeNode*> init_q;
        q.push_back(init_q);
        q[level].push(root);

        while (level < q.size() && q[level].size() > 0) {

            std::vector<int> row;

            while (q[level].size() > 0) {


                TreeNode* n = q[level].front();
                q[level].pop();
                row.push_back(n->val);

                if ((n->left != nullptr || n->right != nullptr) && level + 1 == q.size()) {
                    std::queue<TreeNode*> new_q;
                    q.push_back(new_q);
                }

                if (n->left != nullptr) {
                    q[level + 1].push(n->left);
                }
            
                if (n->right != nullptr) {
                    q[level + 1].push(n->right);
                }

            }
            
            result.push_back(row);
            level++;

        }

        return result;
        
    }
};
