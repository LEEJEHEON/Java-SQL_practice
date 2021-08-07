package baekjoon;
import java.util.Scanner;

public class baekjoon_5063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		for(int i=0;i<a;i++) {
			int r = sc.nextInt();
			int e = sc.nextInt();
			int c = sc.nextInt();
			if((c+r)<e)
				System.out.println("advertise");
			else if((c+r)==e)
				System.out.println("does not matter");
			else
				System.out.println("do not advertise");
		}

	}
}
