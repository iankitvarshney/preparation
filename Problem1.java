import java.util.*;

public class Main {

	public static void pattern(int n) {

		int rows = 2 * n - 1;
		int cols = rows;
		int value = n;

		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				System.out.print(value + " ");
			}
			System.out.println();

			if(i < n - 1) {
				value--;
				cols -= 2;
			}
			else {
				value++;
				cols += 2;
			}

			if(i == n - 1) {
				cols++;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		pattern(n);

	}
}

/*

Problem:
Pattern Printing

Input:
4

Output:
4 4 4 4 4 4 4 
3 3 3 3 3 
2 2 2 
1 
2 2 2 2 
3 3 3 3 3 3 
4 4 4 4 4 4 4 4 

*/