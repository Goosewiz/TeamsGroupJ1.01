package Task2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextDouble()) {
			System.out.println("Rational number");
		} else if (sc.hasNextInt()) {
			System.out.println("Integer number");
		} else if (sc.hasNextBoolean()) {
			System.out.println("Boolean value");
		} else if (sc.hasNextLine()) {
			System.out.println("Text");
		}
	}
}
