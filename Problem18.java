import java.util.*;

public class Main {

	public static int findNumbers(int[] nums) {

		int ans = 0;

		for(int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int digits = 0;

			while(num > 0) {
				digits++;
				num /= 10;
			}

			if(digits % 2 == 0) {
				ans++;
			}
		}

		return ans;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];

		for(int i = 0; i < n; i++) {
			nums[i] = scn.nextInt();
		}

		int ans = findNumbers(nums);
		System.out.println(ans);

	}
}

/*

Problem:
1295. Find Numbers with Even Number of Digits (LeetCode)

Input:
5
12 345 2 6 7896

Output:
2

Input:
4
555 901 482 1771

Output:
1

*/