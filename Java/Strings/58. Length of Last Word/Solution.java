/**
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 *
 * A word is a maximal
 * substring
 *  consisting of non-space characters only.
 */
class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0, i = 0;
        int n = s.length();
        while(i < n) {
            if(s.charAt(i) != ' ') {
                count++;
                i++;
            } else {
                while(i < n && s.charAt(i) == ' ') {
                    i++;
                }

                if(i == n) return count;
                else count = 0;
            }
        }
        return count;
    }
}