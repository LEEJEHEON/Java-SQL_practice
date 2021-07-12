package baekjoon;
import java.util.Scanner;

public class baekjoon_1296 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String me=sc.nextLine();
		String name []=new String[sc.nextInt()];
		String girl;
		String j[];
		int answer=0 ,a=0;
		int L,O,V,E;
		for (int i=0;i<name.length;i++) {
			L=0;
			O=0;
			V=0;
			E=0;
			girl = sc.nextLine();
			name[i] = girl;
			j = me.concat(girl).split("");
			System.out.println(j.length);
			for (int k=0;k<j.length;k++) {
				switch(j[k]) {
					case "L":
						L +=1;
						break;
					case "O":
						O +=1;
						break;
					case "V":
						V +=1;
						break;
					case "E":
						E +=1;
						break;
				}
				System.out.println("J[K] " + j[k] );
			}
			System.out.println("L: " + L);
			System.out.println("O: " + O);
			System.out.println("V: " + V);
			System.out.println("E: " + E);
			//System.out.println(((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100);
			if ((((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100)>a) {
				a = ((L+O)*(L+V)*(L+E)*(O+V)*(O+E)*(V+E))%100;
				answer =i;
				System.out.println(answer);
			}
		}
		System.out.println(name[answer]);

	}
}
