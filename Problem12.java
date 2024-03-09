import java.util.*;

public class Main {

	public static int candy(int[] ratings) {

		int totalCandies = 0;
		int[] candies = new int[ratings.length];

		candies[0] = 1;

		for(int i = 1; i < candies.length; i++) {
			if(ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			}
			else {
				candies[i] = 1;
			}
		}

		for(int i = candies.length - 2; i >= 0; i--) {
			if(ratings[i] > ratings[i + 1] && candies[i] <= candies[i + 1]) {
				candies[i] = candies[i + 1] + 1;
			}
		}

		for(int i = 0; i < candies.length; i++) {
			totalCandies += candies[i];
		}

		return totalCandies;

	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] ratings = new int[n];

		for(int i = 0; i < n; i++) {
			ratings[i] = scn.nextInt();
		}

		int ans = candy(ratings);
		System.out.println(ans);

	}
}

/*

Problem:
135. Candy (LeetCode)

Input:
3
1 0 2

Output:
5

Input:
3
1 2 2

Output:
4

Input:
7
1 2 87 87 87 2 1

Output:
13

Input:
6
29 51 87 87 72 12

Output:
12

Input:
5
1 3 4 5 2

Output:
11

*/