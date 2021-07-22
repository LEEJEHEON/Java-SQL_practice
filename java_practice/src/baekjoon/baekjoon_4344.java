package baekjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b,c;
		double avg,count;
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i=0;i<a;i++) {
			avg = 0;
			count =0;
			list.clear();
			b = sc.nextInt();
			for (int j=0;j<b;j++) {
				c =sc.nextInt();
				list.add(c);
				avg += c;
			}
			avg /= b;
			for (Integer j : list) {
				if (j>avg) {
					count ++;
				}
			}
			avg = (count/b)*100;
			System.out.println(String.format("%.3f",avg)+"%");
		}
	}
}
