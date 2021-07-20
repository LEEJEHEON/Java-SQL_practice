package baekjoon;
import java.util.Scanner;

public class baekjoon_2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int answer = 1;
		int temp=A;
		while(temp<V) {
			temp +=A - B;
			answer ++;
		}
		System.out.print(answer);
	}
}
