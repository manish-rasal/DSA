/**
 * You are given a string s and an integer k, a k duplicate removal consists of choosing k adjacent and equal letters from s and removing them, causing the left and the right side of the deleted substring to concatenate together.
 *
 * We repeatedly make k duplicate removals on s until we no longer can.
 *
 * Return the final string after all such duplicate removals have been made. It is guaranteed that the answer is unique.
 */
class Solution {
    class Pair {
        char c;
        int count;
        Pair (char c, int count) {
            this.c = c;
            this.count = count;
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st = new Stack<>();
        int i = 0;
        while(i < s.length()) {
            if(st.isEmpty() || st.peek().c != s.charAt(i)) {
                st.push(new Pair(s.charAt(i), 1));
            } else {
                if(st.peek().c == s.charAt(i)) {
                    if(st.peek().count == k - 1) {
                        st.pop();
                    } else if(st.peek().count < k - 1) {
                        st.peek().count += 1;
                    }
                }
            }
            i++;
        }
        StringBuilder result = new StringBuilder();
        for(Pair p: st) {
            while(p.count > 0) {
                result.append(p.c);
                p.count--;
            }
        }
        return result.toString();
    }
}