import java.util.*;

public class Main {

	public static void display(int[] ans) {
		
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();

	}

	public static int[] findDiagonalOrder(int[][] mat) {

		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
		int[] ans = new int[mat.length * mat[0].length];
		int idx = 0;

		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < mat[0].length; j++) {
				if(map.containsKey(i + j) == false) {
					map.put(i + j, new ArrayList<Integer>());
				}
				map.get(i + j).add(mat[i][j]);
			}
		}

		for(Map.Entry<Integer, ArrayList<Integer>> m : map.entrySet()) {
			int diagonalIndex = m.getKey();
			ArrayList<Integer> list = m.getValue();

			if(diagonalIndex % 2 == 0) {
				for(int i = list.size() - 1; i >= 0; i--) {
					ans[idx] = list.get(i);
					idx++;
				}
			}
			else {
				for(int i = 0; i < list.size(); i++) {
					ans[idx] = list.get(i);
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