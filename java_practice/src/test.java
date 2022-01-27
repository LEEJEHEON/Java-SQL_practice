import java.util.ArrayList;


public class test {
	public static void main(String args[]){
		ArrayList<Integer> al = new ArrayList<Integer>();

		
		al.add(1);
		al.add(2);
//		al.add(3);
		int[] src; 
		int[] tmp;
		ArrayList<Integer> tem = (ArrayList<Integer>) al.clone();
		
		System.out.println(tem.get(0));
		System.out.println(tem.get(1));
		
		
		

		//System.out.println(al);
//		int a = al.size() /2 ;
//		System.out.println(a);
//		int b = 0;
//		System.out.println(al.get(b++));
//		System.out.println(al.get(b));
		
		
		
		//System.out.println(al.size());
		
	}
}
