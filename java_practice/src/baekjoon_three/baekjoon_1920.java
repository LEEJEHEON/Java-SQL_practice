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
		
		
		for(int n=0;n<baekjoon.size();n++) {
			System.out.print(baekjoon.get(n)+ " ");
		}
		
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
		n=Sort(n,0,n.size()-1);
		
		return n;
	}
	//sort(nlogn)
	public static ArrayList Sort(ArrayList i, int start, int end) {
		ArrayList<Integer> tmp = (ArrayList<Integer>) i.clone();
		int min;
		for(int num1=0;num1<i.size();num1++) {
			min = 100000001;
			for(int num2=num1+1;num2<i.size();num2++) {
				if(num2<num1)
					
				
			}
			
		}
		
		//i.set(,)
		
		
		return i;
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
