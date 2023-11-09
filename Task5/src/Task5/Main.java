package Task5;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double price = 0;
		if (sc.hasNextDouble()) {
			price = sc.nextDouble();
		}
		double cost = price/12*10;
		cost = cost * 100;
		cost = Math.round(cost);
		cost = cost / 100;
		double VAT = price/12*2;
		VAT = VAT * 100;
		VAT = Math.round(VAT);
		VAT = VAT / 100;
		double VATruble = Math.round(VAT);
		System.out.println("Сумма без НДС " + cost);
		System.out.println("НДС в чеке " + VAT);
		System.out.println("НДС для налоговой декларации " + VATruble);
	}
}
