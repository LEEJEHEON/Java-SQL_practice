package baekjoon;
import java.util.Scanner;

public class baekjoon_10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int old []= new int[a];
		String name []= new String[a];
		for(int i=0;i<a;i++) {
			old[i] = sc.nextInt();
			name[i] = sc.next();
		}
		int temp;
		String temp_2;
		for(int i=0;i<a;i++) {



			for(int j=i+1;j<a;j++) {
				if(old[i]>old[j]) {
					temp = old[j];
					temp_2 = name[j];
					old[j] = old[i];
					name[j] = name[i];
					old[i] = temp;
					name[i] = temp_2;
				}
			}
		}
		for(int i=0;i<a;i++) {
			System.out.println(old[i]+" "+name[i]);
		}
	}
}
