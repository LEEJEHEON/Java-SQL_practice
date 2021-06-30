package baekjoon;
import java.util.Scanner;

public class baekjoon_1075 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		int F = sc.nextInt();
		N = ((N/100)*100);
		while(true) {
			if (N%F==0)
				break;
			else
				N++;
		}
		String answer = String.valueOf(N);
		System.out.print(answer.substring(answer.length()-2,answer.length()));
	}
}
