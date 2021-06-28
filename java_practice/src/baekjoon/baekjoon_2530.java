package baekjoon;
import java.util.Scanner;

public class baekjoon_2530 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] now = new int[3];
		int n=0;

		for(int i=0;i<now.length;i++)
			now[i]=sc.nextInt();
		int time = sc.nextInt();
		for(int i=2;i>=0;i--) {
			if (i==2) {
				now[i] += time;
				n =now[i]/60;
				now[i] -= (n*60);
			}
			else if (i==1) {
				now[i] += n;
				n = now[i]/60;
				now[i]-= n*60;
			}
			else {
				now[i] += n;
				if (now[i]>=24)
					now[i] %= 24;
			}
		}
		System.out.print(now[0]+" "+now[1]+" "+now[2]);
	}
}
