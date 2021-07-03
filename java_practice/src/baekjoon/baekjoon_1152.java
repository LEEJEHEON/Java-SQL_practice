package baekjoon;
import java.util.Scanner;

public class baekjoon_1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word=sc.nextLine();
		if (word.substring(0,1).equals(" "))
			if (word.equals(" ")) {
				System.out.print(0);
				System.exit(0);
			}
			word = word.substring(1);
		String[] answer = word.split(" ");
		System.out.print(answer.length);
	}
}
