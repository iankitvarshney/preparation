import java.util.*;

public class Main {

	public static String decodeString(String s) {

		StringBuilder sb = new StringBuilder();
		ArrayList<Integer> frequency = new ArrayList<>();
		ArrayList<Integer> startIndex = new ArrayList<>();
		int num = 0;

		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if(ch >= 'a' && ch <= 'z') {
				sb.append(ch);
			}
			else if(ch >= '0' && ch <= '9') {
				num = (num * 10) + (ch - '0');
			}
			else if(ch == '[') {
				frequency.add(num);
				num = 0;
				startIndex.add(sb.length());
			}
			else if(ch == ']') {
				int freq = frequency.remove(frequency.size() - 1);
				int index = startIndex.remove(startIndex.size() - 1);
				String str = sb.substring(index);

				for(int j = 1; j < freq; j++) {
					sb.append(str);
				}
			}
		}

		return sb.toString();
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();

		String ans = decodeString(s);
		System.out.println(ans);

	}
}

/*

Problem:
394. Decode String (LeetCode)

Input:
ab2[ab2[ef]cd]cd

Output:
ababefefcdabefefcdcd

Input:
3[a]2[bc]

Output:
aaabcbc

Input:
3[a2[c]]

Output:
accaccacc

Input:
2[abc]3[cd]ef

Output:
abcabccdcdcdef

Input:
2[e3[dc]1[t2[rj]]]

Output:
edcdcdctrjrjedcdcdctrjrj

*/