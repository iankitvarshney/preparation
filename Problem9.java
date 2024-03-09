import java.util.*;

public class Main {

	public static boolean isValid(String s) {

		Stack<Character> stack = new Stack<>();
		for(char c : s.toCharArray()) {
			if(c == '(') {
				stack.push(')');
			}
			else if(c == '{') {
				stack.push('}');
			}
			else if(c == '[') {
				stack.push(']');
			}
			else if(stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}
		return stack.isEmpty();

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();

		boolean ans = isValid(s);
		System.out.println(ans);

	}
}

/*

Problem:
20. Valid Parentheses (LeetCode)

NOTE:
Given problem was Balanced Parentheses (Involves finding the count of pairs)

Input:
()

Output:
true

Input:
()[]{}

Output:
true

Input:
(]

Output:
false

*/