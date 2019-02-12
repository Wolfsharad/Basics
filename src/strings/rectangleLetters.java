package strings;

public class rectangleLetters {
	public static void main(String[] args) {
		int num = 6;
		for (int i = 0; i < num; i++) {
			System.out.println();
			for (int j = 0; j < num; j++) {
				System.out.print((char) (65 + i));
			}
		}
	}
}
