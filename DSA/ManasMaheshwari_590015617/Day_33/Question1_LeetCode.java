class Solution {
    public String removeOuterParentheses(String s) {
        char[] result = new char[s.length()];
        int index = 0;
        int open = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                if (open > 0) {
                    result[index] = c;
                    index++;
                }
                open++;
            } else {
                open--;
                if (open > 0) {
                    result[index] = c;
                    index++;
                }
            }
        }
        
        return new String(result, 0, index);
    }
}
