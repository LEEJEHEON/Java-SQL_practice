package baekjoon;
import java.util.Scanner;

public class baekjoon_1267 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sumY=0,sumM =0;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			sumY += Yong(a);
			sumM += min(a);
		}
		if (sumY>sumM)
			System.out.print("M " + sumM);
		else if(sumY==sumM)
			System.out.print("Y M "+sumY);
		else
			System.out.print("Y "+ sumY);
	}
	public static int Yong(int a) {
		int i =0;
		int price=0;
		while(i<=a) {
			price += 10;
			i +=30;
		}
		return price;
	}
	public static int min(int a) {
		int i =0;
		int price=0;
		while(i<=a) {
			price += 15;
			i +=60;
		}
		return price;
	}

}
