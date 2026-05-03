class Solution {
public:
    vector<int> plusOne(vector<int>& digits) {
        vector<int> res = digits;
        bool need_digit = false;
        for (int i = digits.size() - 1; i >= 0; i--) {
            if (digits[i] + 1 < 10) {
                res[i] = digits[i] + 1;
                break;
            }
            res[i] = 0;
            if (i == 0) {
                need_digit = true;
            }
        }
        if (need_digit) {
            res.insert(res.begin(), 1);
        }
        
        return res;
    }
};
