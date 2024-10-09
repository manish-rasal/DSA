/**
 * Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.
 *
 * For example:
 * A -> 1
 * B -> 2
 * C -> 3
 * ...
 * Z -> 26
 * AA -> 27
 * AB -> 28
 * ...
 */
class Solution {
    public int titleToNumber(String columnTitle) {
        int n = columnTitle.length();
        int result = 0;
        for(int i = 0; i < n; i++) {
            result += Math.pow(26, n - 1 - i) * (columnTitle.charAt(i) - 'A' +  1);
        }
        return result;
    }
}