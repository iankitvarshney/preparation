import java.util.*;

public class Main {

	public static List<Character> nonRepeatingChars(String s) {

		int[] freq = new int[26];
		List<Character> ans = new ArrayList<>();

		for(char ch : s.toCharArray()) {
			int charIndex = ch - 'a';
			freq[charIndex]++;
		}

		for(int i = 0; i < 26; i++) {
			if(freq[i] == 1) {
				char ch = (char)(i + 'a');
				ans.add(ch);
			}
		}

		return ans;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();

		List<Character> ans = nonRepeatingChars(s);
		System.out.println(ans);

	}
}

/*

Problem:
Finding out non-repeating characters from a string

Input:
abecdcbffghhi

Output:
[a, d, e, g, i]

*/