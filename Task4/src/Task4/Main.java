package Task4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		int condition;
		int count = 1;
		int answer = 0;
		int k = 1;
		int number = -1000 + (int) (Math.random() * 2000);
		System.out.print(number + " ");
		if (number > 0)
			condition = 1;
		else if (number < 0)
			condition = -1;
		else
			condition = 0;
		do {
			number = -1000 + (int) (Math.random() * 2000);
			System.out.print(number + " ");
			if (number > 0 && condition > 0) {
				count = count + 1;
			} else if (number > 0 && condition < 0) {
				if (count > answer) {
					answer = count;
				}
				count = 1;
				condition = 1;
			} else if (number < 0 && condition < 0) {
				count = count + 1;
			} else if (number < 0 && condition > 0) {
				if (count > answer) {
					answer = count;
				}
				count = 1;
				condition = -1;
			} else {
				if (count > answer) {
					answer = count;
				}
				count = 0;
				if (number > 0)
					condition = 1;
				else if (number < 0)
					condition = -1;
				else
					condition = 0;
			}
			k++;
		} while (k < n);
		if (count > answer)
			answer = count;
		System.out.println();
		System.out.println(answer);
	}
}