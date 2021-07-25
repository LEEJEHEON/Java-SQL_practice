package baekjoon;
import java.util.Scanner;

public class baekjoon_1259 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			String a[] = sc.nextLine().split("");
			if ((a.length==1)) {
				if(a[0].equals("0"))
					break;
				else {
					System.out.println("yes");
					continue;
				}
			}

			int size = a.length-1;
			for(int i=0;i<(a.length/2);i++) {
				if(a[size].equals(a[i])){
					if(i+1==a.length/2)
						System.out.println("yes");
					size --;
				}
				else {
					System.out.println("no");
					break;
				}
			}
		}
	}
}

