import java.util.*;

public class Main {

	public static int findSeats(int n) {
		return ((n - 1) * 3) + 1;
	}

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt(); // number of candidates to be seated

		int seats = findSeats(n);
		System.out.println(seats);

	}
}

/*

Problem:
Arrangements of seats with the gap of two empty seats, 
finding how many seats we have to fill ?

I understood it this way (maybe the question can be different, find out)

If n = 5
Seat Filling:
P S S P S S P S S P S S P

Total seats required = 13 (1 seat for first person and 3 seats for everyone else)

Input:
6

Output:
16

*/