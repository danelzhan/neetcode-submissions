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

    static int helper(TreeNode* root, int greatest) {

        if (root == nullptr) {
            return 0;
        }

        if (root->val >= greatest) {

            return 1 + helper(root->left, root->val) + helper(root->right, root->val);

        } else {

            return helper(root->left, greatest) + helper(root->right, greatest);

        }


    }

    int goodNodes(TreeNode* root) {

        // recursivley traverse the tree
        // keep track of the greatest value in current branch
        // greatest starts off as the root node
        // passed as a param whilst recursing
        // if node >= greatest, then add 1 to the count
        // if node < greatest, then return the current count
        // recurse
        // return 0 on a nullptr

        return helper(root, root->val);
        
    }
};
