package Task6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		int days = n / 1440;
		n = n % 1440;
		int hours = n / 60;
		n = n % 60;
		System.out.println("Дни " + days);
		System.out.println("Часы " + hours);
		System.out.println("Минуты " + n);
	}
}
