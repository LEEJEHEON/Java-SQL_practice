package baekjoon;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class baekjoon_1924 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		LocalDate date = LocalDate.of(2007, a, b);
		DayOfWeek day = date.getDayOfWeek();
		System.out.print(day.getDisplayName(TextStyle.SHORT,Locale.US).toUpperCase());
	}
}
