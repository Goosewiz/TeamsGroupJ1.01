package Task6;

public class WordEndings {
	public String dayEnding(int day) {
		String answer = Integer.toString(day);
		switch (day % 100) {
		case 11:
		case 12:
		case 13:
		case 14:
			answer = answer + " дней ";
			break;
		default:
			switch (day % 10) {
			case 1:
				answer = answer + " день ";
				break;
			case 2:
			case 3:
			case 4:
				answer = answer + " дня ";
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 0:
				answer = answer + " дней ";
				break;
			}
			break;
		}
		return answer;
	}

	public String hourEnding(int hour) {
		String answer = Integer.toString(hour);
		switch (hour % 100) {
		case 11:
		case 12:
		case 13:
		case 14:
			answer = answer + " часов ";
			break;
		default:
			switch (hour % 10) {
			case 1:
				answer = answer + " час ";
				break;
			case 2:
			case 3:
			case 4:
				answer = answer + " часа ";
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 0:
				answer = answer + " часов ";
				break;
			}
			break;
		}
		return answer;
	}

	public String minuteEnding(int minute) {
		String answer = Integer.toString(minute);
		switch (minute % 100) {
		case 11:
		case 12:
		case 13:
		case 14:
			answer = answer + " минут ";
			break;
		default:
			switch (minute % 10) {
			case 1:
				answer = answer + " минута ";
				break;
			case 2:
			case 3:
			case 4:
				answer = answer + " минуты ";
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 0:
				answer = answer + " минут ";
				break;
			}
			break;
		}
		return answer;
	}
}
