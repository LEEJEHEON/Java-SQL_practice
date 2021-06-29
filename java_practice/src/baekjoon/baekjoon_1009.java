package baekjoon;
import java.util.Scanner;

public class baekjoon_1009 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		for (int i=sc.nextInt();i>0;i--) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int m = 1;
			for(int n=0;n<b;n++)
				m = (m*a) % 10;
			if (m==0)
				System.out.println(10);
			else
				System.out.println(m);
		}
	}
}
