package baekjoon;
import java.util.Scanner;

public class baekjoon_1373 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a= sc.next();
		boolean temp = true;
		int v = a.length()-3;
		int w = a.length();
		StringBuilder answer = new StringBuilder();
		String[] b ;
		int sum=0;
		while(temp) {
			int i =0;
			sum=0;
			if (v>0) {
				b= a.substring(v,w).split("");
				w= v;
				v -=3;
			}
			else {
				b = a.substring(0,w).split("");
				temp = false;
			}
			for (int p=b.length-1;p>=0;p--) {
				System.out.println(b[p]+"  "+i+" "+sum);
				if (Integer.parseInt(b[p])==1)
					sum += (int) Math.pow(2,i);
				i++;
				}
			System.out.println("sum : "+sum);
			answer.append(Integer.toString(sum));
		}
		if (a.equals(0))
			System.out.print(0);
		else
			System.out.print(answer.reverse());
	}
}