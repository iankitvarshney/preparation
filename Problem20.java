import java.util.*;

public class Main {

	public static int strStr(String haystack, String needle) {

		for(int i = 0; i <= haystack.length() - needle.length(); i++) {
			if(haystack.charAt(i) == needle.charAt(0)) {
				boolean flag = true;
				for(int j = 0; j < needle.length(); j++) {
					if(needle.charAt(j) != haystack.charAt(i + j)) {
						flag = false;
						break;
					}
				}
				if(flag == true) {
					return i;
				}
			}
		}

		return -1;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String haystack = scn.nextLine();
		String needle = scn.nextLine();

		int ans = strStr(haystack, needle);
		System.out.println(ans);

	}
}

/*

Problem:
28. Find the Index of the First Occurrence in a String (LeetCode)

Input:
sadbutsad
sad

Output:
0

Input:
leetcode
leeto

Output:
-1

Input:
a
a

Output:
0

*/