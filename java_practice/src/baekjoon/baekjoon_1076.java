package baekjoon;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baekjoon_1076 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int value[] = {1,10,100,1000,10000,100000,1000000,10000000,100000000,1000000000};
		Map<String, Integer> color = new HashMap<>();
		color.put("black",0);
		color.put("brown",1);
		color.put("red",2);
		color.put("orange",3);
		color.put("yellow",4);
		color.put("green",5);
		color.put("blue",6);
		color.put("violet",7);
		color.put("grey",8);
		color.put("white",9);
		long answer=color.get(sc.nextLine());
		answer=(answer*10)+color.get(sc.nextLine());
		answer=answer * value[color.get(sc.nextLine())];
		System.out.println(answer);
	}
}
