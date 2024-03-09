import java.util.*;

public class Main {

	public static List<Integer> leadersInArray(int[] nums) {

		int maxi = Integer.MIN_VALUE;
		List<Integer> ans = new ArrayList<>();

		for(int i = nums.length - 1; i >= 0; i--) {
			if(nums[i] > maxi) {
				ans.add(nums[i]);
				maxi = nums[i];
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

		List<Integer> ans = leadersInArray(nums);
		System.out.println(ans);

	}
}

/*

Problems:
Leaders in an Array (CodingNinjas)

Input:
9
10 5 15 20 25 1 14 13 20

Output:
[20, 25]

Input:
7
5 6 7 0 1 3 2

Output:
[2, 3, 7]

Input:
6
15 37 1 32 135 2

Output:
[2, 135]

*/