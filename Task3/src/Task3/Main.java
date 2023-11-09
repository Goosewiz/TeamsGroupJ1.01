package Task3;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		double max = Double.MIN_VALUE;
		double min = Double.MAX_VALUE;
		double sum = 0;
		double average = 0;
		while (sc.hasNextDouble()) {
			double input = sc.nextDouble();
			count = count + 1;
			sum = sum + input;
			if (input < min)
				min = input;
			if (input > max)
				max = input;
		}
		average = sum / count;
		System.out.println("Count = " + count);
		System.out.println("Maximum = " + max);
		System.out.println("Minimum = " + min);
		System.out.println("Sum = " + sum);
		System.out.println("Average = " + average);
	}
}