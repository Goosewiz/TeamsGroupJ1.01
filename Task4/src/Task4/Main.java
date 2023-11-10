package Task4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		int prevNumberSign;
		int count = 1;
		int answer = 0;
		int k = 1;
		int number = -1000 + (int) (Math.random() * 2000);
		System.out.print(number + " ");
		if (number > 0)
			prevNumberSign = 1;
		else if (number < 0)
			prevNumberSign = -1;
		else
			prevNumberSign = 0;
		if (n > 1) {
			 while (k < n) {
				number = -1000 + (int) (Math.random() * 2000);
				System.out.print(number + " ");
				if ((number > 0 && prevNumberSign > 0) || (number < 0 && prevNumberSign < 0) || (number == 0 && prevNumberSign == 0)) {
					count = count + 1;
				} else {
					answer = Math.max(answer, count);
					count = 1;
					prevNumberSign = (int) Math.signum(number);
				}
				k++;
			}
		}
		if (count > answer)
			answer = count;
		System.out.println();
		System.out.println(answer);
	}
}