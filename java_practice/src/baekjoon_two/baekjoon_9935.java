package baekjoon_two;
import java.util.Scanner;

public class baekjoon_9935 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String words = sc.nextLine();
		String c4 = sc.nextLine();
		
		while(words.contains(c4)) {
			words = words.replace(c4, "");
		}
		if(words.length()==0)
			System.out.print("FRULA");
		else
			System.out.print(words);
	}
}
