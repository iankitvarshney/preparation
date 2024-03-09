import java.util.*;

public class Main {

	public static void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void recursivePermute(int index, int[] nums, List<List<Integer>> ans) {

		if(index == nums.length) {
			List<Integer> ds = new ArrayList<>();
			for(int i = 0; i < nums.length; i++) {
				ds.add(nums[i]);
			}

			ans.add(new ArrayList<>(ds));
			return;
		}

		for(int i = index; i < nums.length; i++) {
			swap(i, index, nums);
			recursivePermute(index + 1, nums, ans);
			swap(i, index, nums);
		}

	}

	public static List<List<Integer>> permutations(int[] nums) {

		List<List<Integer>> ans = new ArrayList<>();
		recursivePermute(0, nums, ans);
		return ans;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] nums = new int[n];

		for(int i = 0; i < n; i++) {
			nums[i] = scn.nextInt();
		}

		List<List<Integer>> ans = permutations(nums);
		System.out.println(ans);

	}
}

/*

Input:
3
1 2 3

Output:
[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 2, 1], [3, 1, 2]]


Time Complexity:
O(N! * N)

*/