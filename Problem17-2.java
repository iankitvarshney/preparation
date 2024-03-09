import java.util.*;

public class Main {

	public static String arrangeWords(String s) {

		String[] words = new String[10];
		StringBuilder sb = new StringBuilder();
		int idx = 0;
		int maxi = 0;

		while(idx < s.length()) {
			int start = idx;
			int num = 0;
			String word = "";

			while(idx < s.length() && (
				(s.charAt(idx) >= 'a' && s.charAt(idx) <= 'z') || 
				(s.charAt(idx) >= 'A' && s.charAt(idx) <= 'Z'))) {
				idx++;
			}
			word = s.substring(start, idx);

			while(idx < s.length() && s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
				num = (num * 10) + (s.charAt(idx) - '0');
				idx++;
			}

			words[num] = word;
			maxi = Math.max(maxi, num);
			idx++;
		}

		for(int i = 1; i <= maxi; i++) {
			sb.append(words[i]);
			if(i != maxi) {
				sb.append(" ");
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();

		String ans = arrangeWords(s);
		System.out.println(ans);

	}
}

/*

Problem:
1859. Sorting the Sentence (LeetCode)

Input:
sentence4 a3 is2 This1

Output:
This is a sentence

Input:
is2 sentence4 This1 a3

Output:
This is a sentence

Input:
Myself2 Me1 I4 and3

Output:
Me Myself and I

*/