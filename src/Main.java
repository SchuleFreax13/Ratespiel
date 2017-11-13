import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		while (true) {
			ein_spiel: {
				int zufallszahl = (int) (Math.random() * 100);
				for (int i = 0; i < 7; i++) {
					System.out.print(">");
					int eingabe = Integer.valueOf(scanner.nextLine());
					if (eingabe == zufallszahl) {
						System.out.println("Gewonnen!");
						break ein_spiel;
					} else if (eingabe > zufallszahl) {
						System.out.println("Die Zahl ist niedriger!");
					} else {
						System.out.println("Die Zahl ist höher!");
					}
				}
				System.out.println("Verloren!");
				System.out.println();
			}
		}
	}

}
