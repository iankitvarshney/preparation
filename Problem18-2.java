import java.util.*;

public class Main {

	public static int findNumbers(int[] nums) {

		int count = 0;

		for(int i = 0; i < nums.length; i++) {
			if((nums[i] >= 10 && nums[i] <= 99) || (nums[i] >= 1000 && nums[i] <= 9999) || nums[i] == 100000) {
				count++;
			}
		}

		return count;

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