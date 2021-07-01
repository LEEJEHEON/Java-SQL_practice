package baekjoon;
import java.util.Scanner;

public class baekjoon_1085 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int i[] = new int[4];
		for (int n=0;n<4;n++)
			i[n] = sc.nextInt();
		i[2] -= i[0];
		i[3] -= i[1];
		int min = i[0];
		for (int n=1;n<4;n++) {
			if (min >= i[n])
				min = i[n];
		}
		System.out.print(min);
	}
}
