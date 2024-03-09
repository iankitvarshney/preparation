import java.util.*;

public class Main {

	public static void display(int[] ans) {
		
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();

	}

	public static int[] findDiagonalOrder(int[][] mat) {

		ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		int[] ans = new int[mat.length * mat[0].length];
		int idx = 0;

		for(int i = 0; i <= (mat.length + mat[0].length - 2); i++) {
			list.add(new ArrayList<Integer>());
		}

		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				list.get(i + j).add(mat[i][j]);
			}
		}

		for(int i = 0; i <= (mat.length + mat[0].length - 2); i++) {
			if(i % 2 == 0) {
				for(int j = list.get(i).size() - 1; j >= 0; j--) {
					ans[idx] = list.get(i).get(j);
					idx++;
				}
			}
			else {
				for(int j = 0; j < list.get(i).size(); j++) {
					ans[idx] = list.get(i).get(j);
					idx++;
				}
			}
		}

		return ans;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[][] mat = new int[m][n];

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = scn.nextInt();
			}
		}

		int[] ans = findDiagonalOrder(mat);
		display(ans);

	}
}

/*

Problem:
498. Diagonal Traverse (LeetCode)

Input:
3 3
1 2 3
4 5 6
7 8 9

Output:
1 2 4 7 5 3 6 8 9 

Input:
2 2
1 2
3 4

Output:
1 2 3 4 

*/