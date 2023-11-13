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
				String ending1 = " дней ";
				String ending2 = " день ";
				String ending3 = " дня ";
				answer = analyzer.ending(days, ending1, ending2, ending3);
				ending1 = " часов ";
				ending2 = " час ";
				ending3 = " часа ";
				answer = answer + analyzer.ending(hours, ending1, ending2, ending3);
				ending1 = " минут ";
				ending2 = " минута ";
				ending3 = " минуты ";
				answer = answer + analyzer.ending(minutes, ending1, ending2, ending3);
				System.out.println(answer);
				String test = "new commit";
			}
		} else {
			System.out.println("Введите, сколько минут осталось до события");
		}
	}
}
