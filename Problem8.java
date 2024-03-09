import java.util.*;

public class Main {

	public static int scoreOfParentheses(String s) {

		Stack<Integer> st = new Stack<>();

		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '(') {
				st.push(0);
			}
			else {
				int score = 0;

				while(st.peek() != 0) {
					score += st.peek();
					st.pop();
				}
				st.pop();

				if(score == 0) {
					st.push(1);
				}
				else {
					st.push(score * 2);
				}
			}
		}

		int ans = 0;

		while(st.size() > 0) {
			ans += st.peek();
			st.pop();
		}

		return ans;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();

		int ans = scoreOfParentheses(s);
		System.out.println(ans);

	}
}

/*

Problem:
856. Score of Parentheses (LeetCode)

Input:
()

Output:
1

Input:
()()

Output:
2

Input:
(())

Output:
2

Input:
(((())()()))

Output:
16

*/