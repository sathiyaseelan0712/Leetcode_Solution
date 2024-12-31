class Solution {
public:
    int findDuplicate(vector<int>& nums) {
       unordered_set<int> m;
       for(int num : nums){
        if(m.count(num)){
            return num;
        }
        m.insert(num);
       }
       return 0;
    }
};
