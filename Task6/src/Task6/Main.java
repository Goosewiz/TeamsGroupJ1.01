package Task6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		if (args.length == 1) {
			int minutes = Integer.parseInt(args[0]);
			if (minutes <= 0) {
				System.out.println("Уже началось!");
			} else {
				int days = minutes / 1440;
				minutes = minutes % 1440;
				int hours = minutes / 60;
				minutes = minutes % 60;
				String answer = "";
				WordEndings analyzer = new WordEndings();
				answer = analyzer.dayEnding(days);
				answer = answer + analyzer.hourEnding(hours);
				answer = answer + analyzer.minuteEnding(minutes);
				System.out.println(answer);
			}
		}
	}
}
