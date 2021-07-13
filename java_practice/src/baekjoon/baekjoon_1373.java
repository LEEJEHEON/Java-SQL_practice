package baekjoon;
import java.util.Scanner;

public class baekjoon_1373 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a [] = sc.next().split("");
		long sum=0;
		int i =0;
		for(int k=a.length-1;k>-1;k--) {
			if (Integer.parseInt(a[k])==1)
				sum += Math.pow(2,i);
			i++;
		}
		System.out.print(Long.toOctalString(sum));
	}
}
