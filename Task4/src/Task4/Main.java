package Task4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		if (sc.hasNextInt()) {
			n = sc.nextInt();
		}
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = -1000 + (int)(Math.random()*2000);
			System.out.print(array[i] + " ");
		}
		System.out.println(" ");
		int count = 0;
		int answer = 0;
		int condition = 0;
		if (array[0]>0)
			condition = 1;
		else if (array[0]<0)
			condition = -1;
		else
			condition = 0;
		for (int i = 0; i < n; i++) {
			if (array[i]>0 && condition>0) {
				count = count + 1;
			} else if (array[i]>0 && condition<0){
				if (count > answer) {
					answer = count;
				}
				count = 1;
				condition = 1;
			} else if (array[i]<0 && condition<0){
				count = count + 1;
			} else if (array[i]<0 && condition>0){
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
				condition = 0;
			}
		}
		if (count > answer)
			answer = count;
		System.out.println(answer);
		System.out.println(answer);
	}
}
