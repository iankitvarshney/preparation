import java.util.*;

public class Main {

	public static List<String> commonChars(String[] words) {

		int[][] freq = new int[26][2];
		int[] count = new int[26];
		List<String> chars = new ArrayList<>();

		for(int i = 0; i < 26; i++) {
			count[i] = Integer.MAX_VALUE;
		}

		for(int i = 0; i < words.length; i++) {
			for(int j = 0; j < words[i].length(); j++) {
				int charIndex = words[i].charAt(j) - 'a';

				if(freq[charIndex][0] == i) {
					freq[charIndex][0]++;
					freq[charIndex][1] = 1;
				}
				else if(freq[charIndex][0] == i + 1) {
					freq[charIndex][1]++;
				}
			}
			for(int j = 0; j < 26; j++) {
				if(freq[j][1] > 0) {
					count[j] = Math.min(count[j], freq[j][1]);
				}
			}
		}

		for(int i = 0; i < 26; i++) {
			if(freq[i][0] == words.length) {
				char ch = (char)('a' + i);
				int charFrequency = count[i];

				while(charFrequency > 0) {
					chars.add("" + ch);
					charFrequency--;
				}
			}
		}

		return chars;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = Integer.parseInt(scn.nextLine());
		String[] words = new String[n];

		for(int i = 0; i < n; i++) {
			words[i] = scn.nextLine();
		}

		List<String> chars = commonChars(words);
		System.out.println(chars);

	}
}

/*

Problem:
1002. Find Common Characters (LeetCode)

Input:
3
cool
lock
cook

Output:
[c, o]

Input:
3
bella
label
roller

Output:
[e, l, l]

Input:
8
acabcddd
bcbdbcbd
baddbadb
cbdddcac
aacbcccd
ccccddda
cababaab
addcaccd

Output:
[]

*/