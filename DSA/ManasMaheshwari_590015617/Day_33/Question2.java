class Question2 {
    public static void main(String[] args) {
        String s = "AB+CD-*"; // Sample test case
        
        String[] stack = new String[s.length()];
        int top = -1;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                top++;
                stack[top] = String.valueOf(c);
            } else {
                String op2 = stack[top];
                top--;
                String op1 = stack[top];
                top--;
                
                String newExpr = c + op1 + op2;
                top++;
                stack[top] = newExpr;
            }
        }
        
        System.out.println(stack[top]);
    }
}
