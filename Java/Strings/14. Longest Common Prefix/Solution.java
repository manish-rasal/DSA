/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        int n = strs.length;
        int len = strs[0].length();
        for(int i = 0; i < len; i++) {
            for(int j = 1; j < n; j++) {
                if(i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i)) return result.toString();
            }
            result.append(strs[0].charAt(i));
        }
        return result.toString();
    }
}