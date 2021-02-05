package kosta.video;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExam02 {

	public static void main(String[] args) {
//		String data[] = {
//				"bat", "bba", "bbg", "bonus",
//				"CA", "ca", "c232", "car",
//				"date", "dic", "diraaa"
//		};
//		
//			
//		
//		for(String s : data) {
//			Matcher m = p.matcher(s);
//			if(m.matches()) {
//				System.out.println(s);
//			}
//		}
//
//		String source = "ab?cde?fgh";
//		String reg = "\\w*";
//		
//		Pattern p = Pattern.compile(reg);
//		
//		Matcher m = p.matcher(source);  // 정규표현식에 맞는 그룹들을 가지고 있음
//		
//		while(m.find()) {
//			System.out.println(m.group()); 
//		}
//	
		
		String source = "HP : 010-1111-1111, HOME : 02-222-2222";
		// 출력  010-1111-1111           02-222-2222
		String reg = "(";
//		String reg = "[0-9]*\\-[0-9]*\\-[0-9]*";
	
		
		Pattern p = Pattern.compile(reg);
		Matcher m = p.matcher(source);
		while(m.find()) {
			System.out.println(m.group());
		}
	}

}
