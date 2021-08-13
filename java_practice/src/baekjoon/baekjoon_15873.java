package baekjoon;
import java.util.Scanner;

public class baekjoon_15873 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a [] = sc.nextLine().split("");
		int sum=0;
		for(int i =0;i<a.length;i++) {
			if(Integer.parseInt(a[i])==0)
				sum +=9;
			sum += Integer.parseInt(a[i]);
		}
		System.out.println(sum);
	}
}
