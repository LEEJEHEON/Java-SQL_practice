package baekjoon;
import java.util.Scanner;

public class baekjoon_2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer=0;
		int max = 0;
		for (int i=1;i<10;i++) {
			int b = sc.nextInt();
			if(max < b) {
				max = b;
				answer = i;
			}
		}
		System.out.print(max+"\n"+answer);
	}
}
