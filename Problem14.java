import java.util.*;

public class Main {

	public static String expand(String s) {

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if(ch >= 'a' && ch <= 'z') {
				sb.append(ch);
			}
			else if(ch >= '0' && ch <= '9') {
				int num = 0;

				while(i < s.length() && (s.charAt(i) >= '0' && s.charAt(i) <= '9')) {
					num = (num * 10) + (s.charAt(i) - '0');
					i++;
				}

				for(int j = 0; j < num; j++) {
					sb.append(s.charAt(i));
				}
			}
		}

		return sb.toString();

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		String s = scn.nextLine();

		String ans = expand(s);
		System.out.println(ans);

	}
}

/*

Input:
aki[2ek][3c]d

Output:
akieekcccd

*/