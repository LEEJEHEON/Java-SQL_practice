package baekjoon;
import java.util.Scanner;

public class baekjoon_2752 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a[] = new int[3];
		for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		int min=a[0];
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(min>a[i])
				min = a[i];
			if(max<a[i])
				max = a[i];
		}
		System.out.print(min+" ");
		for(int i=0;i<a.length;i++)
			if((a[i]!=min)&(a[i]!=max))
				System.out.print(a[i]+" ");
		System.out.print(max);
	}
}
