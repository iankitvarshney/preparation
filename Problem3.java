import java.util.*;

public class Main {

	public static void concentricSquarePattern(int n) {

		int rows = 2 * n - 1;
		int cols = rows;
		int outers = 0;
		int inners = cols;
		int innerval = n;

		for(int i = 0; i < rows; i++) {
			int outerval = n;
			for(int j = 0; j < outers; j++) {
				System.out.print(outerval + " ");
				outerval--;
			}

			for(int j = 0; j < inners; j++) {
				System.out.print(innerval + " ");
			}

			outerval++;
			for(int j = 0; j < outers; j++) {
				System.out.print(outerval + " ");
				outerval++;
			}
			System.out.println();

			if(i < n - 1) {
				innerval--;
				inners -= 2;
				outers++;
			}
			else {
				innerval++;
				inners += 2;
				outers--;
			}
		}
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		concentricSquarePattern(n);

	}
}

/*

Problem:
Concentric Square Pattern

Input:
5

Output:
5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5 

*/