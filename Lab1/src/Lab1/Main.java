package Lab1;

public class Main {
	public static void main(String[] args) {
		int[][] table = new int[3][8];
		double[] arr = { 30.0, 10000.1, 12.5, 99.99, 0.0, -23.45, -4.5, -129.675 };
		for (int i = 0; i < table[0].length; i++) {
			table[0][i] = (int) Math.round(arr[i]);
			table[1][i] = (int) Math.floor(arr[i]);
			table[2][i] = (int) Math.ceil(arr[i]);
		}
		for (int i = 0; i < table.length; i++) {
			for (int j = 0; j < table[0].length; j++) {
				System.out.print(table[i][j] + "\t");
			}
			System.out.println();
		}
		for (int i = 0; i < table[0].length; i++) {
			long answer = Math.round(arr[i]);
			System.out.print(answer + "\t");
		}
	}
}
