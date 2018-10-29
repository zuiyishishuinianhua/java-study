import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Solution20 {

    /*给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。

    有效字符串需满足：

    左括号必须用相同类型的右括号闭合。
    左括号必须以正确的顺序闭合。*/

    public static void main(String[] args) {
        String str = "()[]{}";
        Solution20 solution = new Solution20();

        System.out.println(solution.isValid(str));

    }

    public boolean isValid(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            Character match = getMatch(chars[i]);
            if(stack.isEmpty()) {
                if(match)
                return false;
            }
            if(stack.peek().equals(match)) {
                stack.pop();
            } else {
                stack.push(chars[i]);
            }

        }
        return stack.isEmpty();
    }


    public Character getMatch(char c) {
        Map<Character, Character> match = new HashMap<>();
        match.put('}', '{');
        match.put(')', '(');
        match.put(']', '[');
        return match.get(c);
    }






    public static void print(int[] nums) {
        Arrays.stream(nums).forEach(System.out::println);
    }

}
