package baekjoon;
import java.util.Scanner;

public class baekjoon_5543 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s[] = new int[5];
		for(int i=0;i<5;i++)
			s[i] = sc.nextInt();
		int min = s[0];
		for(int i=0;i<3;i++) {
			if (min>s[i])
				min = s[i];
		}
		if (s[3]>s[4])
			System.out.print(min+s[4]-50);
		else
			System.out.print(min+s[3]-50);
	}
}
