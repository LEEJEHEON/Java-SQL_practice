package baekjoon;
import java.util.ArrayList;
import java.util.Scanner;

public class baekjoon_1316 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int answer =0;
		String a ;
		ArrayList<String> word = new ArrayList<String>();
		int n = sc.nextInt();
		sc.nextLine();
		for (int i=0;i<n;i++){
			String word_a[] = sc.nextLine().split("");
			word.add(word_a[0]);
			a = word_a[0];
			int j=0;
			System.out.println("---  "+word_a.length);
			while (j<word_a.length-1) {
				j++;
				System.out.println(j + " "+ word_a[j]);
				System.out.println("all ___ "+ word);

				if (word_a[j].equals(a))
					continue;
				else {
					a = word_a[j];
					if (word.contains(word_a[j]))
						break;
					else
						word.add(word_a[j]);
				}
			word.clear();
			if (j+1 == word_a.length)
				answer ++;
			}
			//System.out.print(answer);
		}
		System.out.print(answer);

	}
}
