package baekjoon;
import java.util.Scanner;

public class baekjoon_2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		for(int i=0;i<a;i++) {
			int num = sc.nextInt();
			String st[] = sc.next().split("");
			for(int j=0;j<st.length;j++) {
				for(int k=0;k<num;k++) {
					System.out.print(st[j]);
				}
			}
			System.out.println();
		}
	}
}
