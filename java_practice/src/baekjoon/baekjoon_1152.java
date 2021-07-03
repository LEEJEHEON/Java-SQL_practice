package baekjoon;
import java.util.Scanner;

public class baekjoon_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word=sc.nextLine();
		if (word.substring(0,1).equals(" "))
			word = word.substring(1);
			System.out.print(word);

			if (word.equals(" ")) {
				System.out.print(0);
				System.exit(0);
			}
		String[] answer = word.split(" ");
		System.out.print(answer.length);

	}
}
