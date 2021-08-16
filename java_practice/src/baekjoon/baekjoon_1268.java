package baekjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1268 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int a = sc.nextInt();
		int st[][] = new int[a][5];
		int count,max =0;
		int answer=1;
		for(int i=0;i<a;i++) {
			for(int j=0;j<5;j++) {
				st[i][j] = sc.nextInt();
			}
		}
		for(int i=0;i<a;i++) {
			count =-1;
			for(int j=0;j<5;j++) {
				int num = st[i][j];
				for(int k=0;k<a;k++) {
					if(st[k][j]==num) {
						if(!list.contains(k)) {
							list.add(k);
							count ++;
							break;
						}
					}
				}

			}
			list.clear();
			if(max <count) {
				max=count;
				answer = i+1;
			}
		}
		System.out.print(answer);
	}
}
