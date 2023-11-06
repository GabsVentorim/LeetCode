import java.util.Stack;

class Solution {

    public boolean isValid(String s) {
        if (s.length() % 2 != 0 || s.length() == 0) return false; // se o tamanho for impar, não é válido
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for(char c : chars) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.empty()) return false;
                char top = stack.pop();
                if (c == ')' && top != '(') return false;
                if (c == ']' && top != '[') return false;
                if (c == '}' && top != '{') return false;
            }
        }
        return stack.empty();
    }
}