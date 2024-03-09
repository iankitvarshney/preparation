import java.util.*;

public class Main {

	public static void display(int[] ans) {

		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();

	}

	public static int[] findDiagonalOrder(int[][] mat) {

		int row = 0;
		int col = 0;
		int[] ans = new int[mat.length * mat[0].length];

		for(int i = 0; i < ans.length; i++) {
			ans[i] = mat[row][col];

			if((row + col) % 2 == 0) { // moving up
				if(col == mat[0].length - 1) {
					row++;
				}
				else if(row == 0) {
					col++;
				}
				else {
					row--;
					col++;
				}
			}
			else { // moving down
				if(row == mat.length - 1) {
					col++;
				}
				else if(col == 0) {
					row++;
				}
				else {
					row++;
					col--;
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