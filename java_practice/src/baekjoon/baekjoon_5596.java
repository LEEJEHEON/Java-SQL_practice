package baekjoon;
import java.util.Scanner;

public class baekjoon_5596 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int S=0 , T=0 ;
		for (int i=0;i<4;i++)
			S += sc.nextInt();
		for (int i=0;i<4;i++)
			T += sc.nextInt();
		if (S >= T)
			System.out.print(S);
		else
			System.out.print(T);
	}
}
