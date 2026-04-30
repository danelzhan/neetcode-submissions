class Solution {
public:
    int characterReplacement(string s, int k) {

        // 2 pointers start at index 0
        // move first pointer up, keeping track of how many
        // occurrances of each character there are.
        // the most occurances will be the character we are 
        // replacing other characters with. we keep moving the first
        // pointer up until the number of non most characters is 
        // greater than k, in which case we move the second pointer
        // up, which will remove instances of characters until the number
        // of non most characters is less than or equal to k again. keep
        // track of the largest window size. end when the second pointer 
        // just finished moving up and the first pointer is at the end

        map<char, int> seen;
        int p1 = 0;
        int p2 = 0;
        // window size is p2 - p1 + 1
        char largest = s[0]; 
        int max = 0;
        int hold = 0;
        int replacements = 0;
        
        while(p1 < (int) s.size()) {
            
            hold++;


            if (seen.find(s[p1]) != seen.end()) {
                seen[s[p1]] = seen[s[p1]] + 1; 
            } else {
                seen[s[p1]] = 1;
            }
 
            if (seen[s[p1]] > seen[largest]) {
                largest = s[p1];
                replacements = hold - seen[s[p1]];
            }

            if (s[p1] != largest) {
                replacements++;
            }

            while (replacements > k && p2 < p1) {

                seen[s[p2]] = seen[s[p2]] - 1;
                hold--;

                bool switched = false;

                for (auto const& [key, val] : seen) {

                    if (val > seen[largest]) {
                        largest = key;
                        replacements = hold - seen[largest];
                        switched = true;
                    }

                }


                if (!switched && s[p2] != largest) {
                    replacements--;
                }


                p2++;

            }

            if (hold > max) {
                max = hold;
            }

            if (p1 == (int) s.size() - 1) {
                return max;
            }
            p1++;

        }
        
    }
};
