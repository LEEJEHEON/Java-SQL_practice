package baekjoon;
import java.util.Scanner;

public class baekjoon_2588 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int B = sc.nextInt();
		String b[] = Integer.toString(B).split("");
		for (int i=2;i>=0;i--)
			System.out.println(a*Integer.parseInt(b[i]));
		System.out.println(a*B);
	}
}
