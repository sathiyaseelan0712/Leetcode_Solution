/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left),
 * right(right) {}
 * };
 */
class Solution {
public:
    void vot(TreeNode* root, map<int, map<int, vector<int>>>& m, int ind,
             int level) {
        if (root == NULL)
            return;
        m[ind][level].push_back(root->val);
        vot(root->left, m, ind - 1, level + 1);
        vot(root->right, m, ind + 1, level + 1);
    }
    vector<vector<int>> verticalTraversal(TreeNode* root) {
        map < int, map<int, vector<int>>> m;
        vot(root, m, 0, 0);
        vector<vector<int>> v1;
        for (auto i : m) {
            vector<int> v2;
            for (auto j : i.second) {
                sort(j.second.begin(), j.second.end());
                for (auto l : j.second)
                    v2.push_back(l);
            }
            v1.push_back(v2);
        }
        return v1;
    }
};
