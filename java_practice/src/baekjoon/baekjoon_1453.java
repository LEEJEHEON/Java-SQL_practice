package baekjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1453 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList <Integer> list = new ArrayList<Integer>();
		int answer = 0;
		int b = sc.nextInt();
		for (int i =0; i<b;i++) {
			int a = sc.nextInt();
			if (list.contains(a)) {
				answer ++;
				continue;
			}
			else
				list.add(a);
		}
		System.out.println(answer);
	}
}
