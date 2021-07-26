package baekjoon;
import java.util.Scanner;

public class baekjoon_1526 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int a = (num/4);
		int b = (num/7)*7;
		System.out.println("aa"+a);

		if(a>b)
			System.out.print(a);
		else
			System.out.print(b);
	}
}
