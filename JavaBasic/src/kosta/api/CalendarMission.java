package kosta.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.zip.DataFormatException;

public class CalendarMission {

	public static void main(String[] args) {
		// 2021년 2월 달력 출력
		Calendar c = Calendar.getInstance();
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh:mm");
		char[] week = { '일', '월', '화', '수', '목', '금', '토' };
		Scanner sc = new Scanner(System.in);
		System.out.print("년도 : ");
		int year = sc.nextInt();
		System.out.print("월 : ");
		int month = sc.nextInt();
		c.set(year, month- 1, 1);
		
//		System.out.println(df.format(c.getTime()));
		


		System.out.println("               "+year+"년 "+month+"월");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int w = c.get(Calendar.DAY_OF_WEEK);
		
		for (int i = 1; i < c.getActualMaximum(Calendar.DATE)+w; i++) {
			if(i < w) {
				System.out.print("\t");
			}
			else {
				System.out.print((i+1-w)+"\t");
			}
			if(i%7 == 0)
				System.out.println();
		}
		
		
		

	}

}
