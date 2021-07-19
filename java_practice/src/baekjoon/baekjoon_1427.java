package baekjoon;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class baekjoon_1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> list = new ArrayList<Integer>();
		String number [] = sc.next().split("");
		for(int i=0;i<number.length;i++)
			list.add(Integer.parseInt(number[i]));
		list.sort(Comparator.reverseOrder());
		for(int i=0;i<number.length;i++)
			System.out.print(list.remove(0));
	}
}
