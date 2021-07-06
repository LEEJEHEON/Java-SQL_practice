package baekjoon;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class baekjoon_1159 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> dn = new HashMap <String,Integer>();
		int count = sc.nextInt();
		for (int i=0;i<count;i++) {
			String a = sc.next();
			if (dn.containsKey(a.substring(0,1)))
				dn.put(a.substring(0,1),dn.get(a.substring(0,1))+1);
			else
				dn.put(a.substring(0,1),1);
		}
		Set<String> keys = dn.keySet();
		String answer="";
		for(String key:keys) {
			if(dn.get(key)>=5)
				answer += key;
		}
		if(answer.equals(""))
			System.out.print("PREDAJA");
		else
			System.out.print(answer);

	}
}
