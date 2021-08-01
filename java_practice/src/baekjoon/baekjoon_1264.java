package baekjoon;
import java.util.Scanner;


public class baekjoon_1264 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String word[] = sc.nextLine().split("");
			int answer = 0;
			if ((word[0].equals("#")) && (word.length==1))
				break;
			for (int i=0;i<word.length;i++) {
				switch(word[i]) {
				case "i":
				case "I":
				case "A":
				case "a":
				case "e":
				case "E":
				case "O":
				case "o":
				case "u":
				case "U":
					answer++;
					break;
				default:
					break;
				}
			}
			System.out.println(answer);
		}
	}
}
