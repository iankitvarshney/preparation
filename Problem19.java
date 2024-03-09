import java.util.*;

public class Main {

	public static void display(int[] ans) {

		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();

	}

	public static int[] sortedSquares(int[] nums) {

		int pos = 0;
		int neg = 0;
		int idx = 0;
		int[] ans = new int[nums.length];

		while(pos < nums.length && nums[pos] < 0) {
			pos++;
		}
		neg = pos - 1;

		while(neg >= 0 && pos < nums.length) {
			if(nums[pos] < (0 - nums[neg])) {
				ans[idx] = (nums[pos] * nums[pos]);
				pos++;
				idx++;
			}
			else {
				ans[idx] = (nums[neg] * nums[neg]);
				neg--;
				idx++;
			}
		}

		while(pos < nums.length) {
			ans[idx] = (nums[pos] * nums[pos]);
			pos++;
			idx++;
		}

		while(neg >= 0) {
			ans[idx] = (nums[neg] * nums[neg]);
			neg--;
			idx++;
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

		int[] ans = sortedSquares(nums);
		display(ans);

	}
}

/*

Problem:
977. Squares of a Sorted Array

Input:
5
-4 -1 0 3 10

Output:
0 1 9 16 100 

Input:
5
-7 -3 2 3 11

Output:
4 9 9 49 121 

*/