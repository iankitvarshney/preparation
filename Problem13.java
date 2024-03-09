import java.util.*;

public class Main {

	public static void display(int[][] matrix) {

		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static void rotate(int[][] matrix) {

		int n = matrix.length;

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][n - 1 - j];
				matrix[i][n - 1 - j] = temp;
			}
		}

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] matrix = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = scn.nextInt();
			}
		}

		rotate(matrix);
		display(matrix);

	}
}

/*

Problem:
48. Rotate Image (LeetCode)

Input:
3
1 2 3
4 5 6
7 8 9

Output:
7 4 1 
8 5 2 
9 6 3 

Input:
4
5 1 9 11
2 4 8 10
13 3 6 7
15 14 12 16

Output:
15 13 2 5 
14 3 4 1 
12 6 8 9 
16 7 10 11 

*/