package baekjoon;
import java.util.Scanner;

public class baekjoon_2455 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max =0;
		int people=0;
		for(int i=0;i<4;i++) {
			people = people - sc.nextInt();
			people = people + sc.nextInt();
			if(max<people)
				max=people;
		}
		System.out.println(max);
	}
}
