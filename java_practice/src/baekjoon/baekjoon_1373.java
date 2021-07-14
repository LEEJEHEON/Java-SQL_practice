package baekjoon;
import java.util.Scanner;

public class baekjoon_1373 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a [] = sc.next().split("");
		int k = a.length-1;
		String answer ="";
		while(k > 0) {
			int i =0;
			int sum=0;
			while (i<3) {
				if (k < 0)
					break;
				if (Integer.parseInt(a[k])==1)
					sum += (int) Math.pow(2,i);
				i++;
				k--;
			}
			System.out.println("sum : "+sum);
			answer = Integer.toString(sum) + answer;
		}
		if (answer.equals(""))
			System.out.print(0);
		else
			System.out.print(answer);
	}
}
// 메모리 초과 오류뜸 전체 split 하지말고 세자리씩 나눠서 split 하는 방향으로 코딩