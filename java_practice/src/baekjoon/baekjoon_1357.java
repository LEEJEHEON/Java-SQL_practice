package baekjoon;
import java.util.Scanner;


public class baekjoon_1357 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(rev(rev(sc.nextInt())+rev(sc.nextInt())));

	}
	public static int rev(int a) {
		StringBuffer sb = new StringBuffer(Integer.toString(a));
		int b = Integer.parseInt(sb.reverse().toString());
		return b;
	}
}
