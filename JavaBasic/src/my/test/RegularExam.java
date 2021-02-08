package my.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s = "‪C:\\Users\\KOSTA\\Desktop\\use";
		Pattern p = Pattern.compile("\\\\\\w*");
//System.out.println(sc.nextLine());
//		Pattern p = Pattern.compile("\\p{Alnum}*");
		Matcher m = p.matcher(s);
		while (m.find())
			System.out.println(m.group());
	}
}
