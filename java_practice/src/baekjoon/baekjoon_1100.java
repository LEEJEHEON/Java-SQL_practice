package baekjoon;
import java.util.Scanner;

public class baekjoon_1100 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer =0;
		String a ;

		for(int i=0;i<8;i++) {
			a = sc.nextLine();
			String ch[] = a.split("");
			for(int j=0;j<8;j++) {
				if (i%2==j%2) {
					if (ch[j].equals("F"))
						answer++;
				}
			}
		}
		System.out.print(answer);
	}
}
