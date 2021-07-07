package baekjoon;
import java.util.Scanner;

public class baekjoon_1173 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int exer[] = new int[5];
		for (int i=0;i<exer.length;i++)
			exer[i]=sc.nextInt();
		int m = exer[1];
		if (m+exer[3] > exer[2]) {
			System.out.print(-1);
			System.exit(0);
		}
		while (exer[0] > 0) {
			if (exer[1]+exer[3] <= exer[2]) {
				exer[1] += exer[3];
				exer[0] --;
			}
			else {
				exer[1] -=exer[4];
				if (exer[1]<m) {
					exer[1] = m;
				}
			}
			count ++;
		}
		System.out.print(count);
	}
}
