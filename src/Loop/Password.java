package Loop;
import java.util.Scanner;
public class Password {

	public static void main(String[] args) {
		String password = "let me in";
		Scanner scanner = new Scanner(System.in);
		String guess;
		for (int i = 0; i < 2; i++) {
			System.out.println("Guess the password:");
			guess= scanner.nextLine();
			guess.equals(password);
		}
		System.out.println("congrets!");
		scanner.close();
	}

}