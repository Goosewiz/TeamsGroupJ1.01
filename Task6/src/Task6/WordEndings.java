package Task6;

public class WordEndings {
	public String ending(int time, String ending1, String ending2, String ending3) {
		String answer = Integer.toString(time);
		switch (time % 100) {
		case 11:
		case 12:
		case 13:
		case 14:
			answer = answer + ending1;
			break;
		default:
			switch (time % 10) {
			case 1:
				answer = answer + ending2;
				break;
			case 2:
			case 3:
			case 4:
				answer = answer + ending3;
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 0:
				answer = answer + ending1;
				break;
			}
			break;
		}
		return answer;
	}
}
