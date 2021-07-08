package baekjoon;
import java.util.Scanner;

public class baekjoon_1225 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A[]= sc.next().split("");
		String B[] = sc.next().split("");
		long answer=0;
		for(int j=0;j<A.length;j++) {
			for(int k=0;k<B.length;k++) {
				answer +=Integer.parseInt(A[j])*Integer.parseInt(B[k]);
			}
		}
		System.out.println(answer);
	}
}
