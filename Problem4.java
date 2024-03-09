import java.util.*;

public class Main {

	public static String getAlphabetWithFrequency(String s) {

		StringBuilder sb = new StringBuilder();
		char prevChar = s.charAt(0);
		int freq = 1;

		for(int i = 1; i < s.length(); i++) {
			if(s.charAt(i) != prevChar) {
				sb.append(prevChar);
				sb.append(freq);
				prevChar = s.charAt(i);
				freq = 1;
			}
			else {
				freq++;
			}
		}

		sb.append(prevChar);
		sb.append(freq);

		return sb.toString();
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();

		String ans = getAlphabetWithFrequency(s);
		System.out.println(ans);

	}
}

/*

Input:
APPLE

Output:
A1P2L1E1

Input:
abbcccdddd

Output:
a1b2c3d4

*/