import java.util.*;

public class Main {

	public static void recursivePermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {

		if(ds.size() == nums.length) {
			ans.add(new ArrayList<>(ds));
			return;
		}

		for(int i = 0; i < nums.length; i++) {
			if(freq[i] == false) {
				freq[i] = true;
				ds.add(nums[i]);
				recursivePermute(nums, ds, ans, freq);
				freq[i] = false;
				ds.remove(ds.size() - 1);
			}
		}

	}

	public static List<List<Integer>> permutations(int[] nums) {

		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		boolean[] freq = new boolean[nums.length];

		recursivePermute(nums, ds, ans, freq);
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
[[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]


Time Complexity:
O(N! * N)

*/