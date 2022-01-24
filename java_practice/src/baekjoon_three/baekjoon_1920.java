package baekjoon_three;

import java.util.ArrayList;
import java.util.Scanner;

// 이진 탐색
public class baekjoon_1920 {
	public static void main(String[] args) {
		ArrayList<Integer> baekjoon = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt(); 
		baekjoon = list_n(i);
		int j = sc.nextInt();
		while (j > 0) {
			int searchNum = Integer.parseInt(sc.next());
			System.out.println(search(baekjoon, searchNum));
			j--;
		}

	}

	// list input(오름차순)
	public static ArrayList<Integer> list_n(int i) {
		ArrayList<Integer> n = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);

		while (i > 0) {
			n.add(Integer.parseInt(sc.next()));
			i--;
		}
		sortList(n);
		
		return n;
	}
	//sort(nlogn)
	public static void sortList(ArrayList i) {
		
	}

	// 이진탐색
	public static int search(ArrayList i , int searchNum) {
		int low = 0;
		int high = i.size()-1;
		int mid;
		while(low <= high) {
			mid = (low+high)/2;	
			if (i.get(mid).equals(searchNum))
				return 1;
			else if((int)i.get(mid) < searchNum)
				low = mid+1;
			else
				high = mid-1;
		}
		return 0;
	}
}
