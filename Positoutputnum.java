package hello;

import java.util.Scanner;

public class Positoutputnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int mode = 1;
		int y = x;
		int count = 0;
		while (x >= 10) {
			mode *= 10;
			if ((x % 10) == 0) {
				count++;
			}
			x /= 10;
		}
		System.out.println("mode:" + mode);
		System.out.println("count:" + count);
		do {
			int digit = y / mode;
			y = y % mode;
			mode /= 10;
			switch (digit) {
			case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			case 4:
				System.out.println("four");
				break;
			case 5:
				System.out.println("five");
				break;
			case 6:
				System.out.println("six");
				break;
			case 7:
				System.out.println("seven");
				break;
			case 8:
				System.out.println("eight");
				break;
			case 9:
				System.out.println("nine");
				break;
			}
		} while (y > 0);
		for (int i = 0; i < count; i++) {
			System.out.println("zero");
		}
	}

}
