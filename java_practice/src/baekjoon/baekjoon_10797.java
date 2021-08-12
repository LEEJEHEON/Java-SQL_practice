package baekjoon;
import java.util.Scanner;

public class baekjoon_10797 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int day = sc.nextInt();
		for(int i=0;i<5;i++) {
			if(sc.nextInt()==day)
				count ++;
		}
		System.out.print(count);
	}
}
