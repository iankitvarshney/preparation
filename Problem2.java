import java.util.*;

public class Main {

	public static int findOccurence(String s, String word) {

		for(int i = 0; i <= s.length() - word.length(); i++) {
			if(s.charAt(i) == word.charAt(0)) {
				int idx = i;
				for(int j = 0; j < word.length(); j++) {
					if(s.charAt(idx) != word.charAt(j)) {
						break;
					}
					idx++;
				}
				if(idx - i == word.length()) {
					return i;
				}
			}
		}

		return -1;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();
		String word = scn.nextLine();

		int index = findOccurence(s, word);
		System.out.println(index);

	}
}

/*

Problem:
Find the first occurence of the word in another word.

Input:
itisnotaproblem
not

Output:
4

*/