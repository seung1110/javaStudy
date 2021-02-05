package kosta.api;

import java.security.AlgorithmConstraints;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.GregorianCalendar;

public class CalendarExam {

	public static void main(String[] args) {
//		GregorianCalendar gc = new GregorianCalendar();
		Calendar gc = Calendar.getInstance();
		String now = gc.get(Calendar.YEAR) + "년 "
				+(gc.get(Calendar.MONTH)+1) + "월 " // month는 0부터 시작
				+gc.get(Calendar.DATE) + "일 "
				+gc.get(Calendar.HOUR) + "시 "
				+gc.get(Calendar.MINUTE) + "분";
		System.out.println(now);
		
		gc.add(Calendar.DATE, 100);  // 현재 기준 100일 뒤, 앞에 변수에 년,월,일 등 가능

		String future = gc.get(Calendar.YEAR) + "년 "
				+(gc.get(Calendar.MONTH)+1) + "월 "
				+gc.get(Calendar.DATE) + "일 "
				+gc.get(Calendar.HOUR) + "시 "
				+gc.get(Calendar.MINUTE) + "분";
		System.out.println("100일 후 : " + future);
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh:mm"); // 데이터 포맷 설정
		gc.set(2020, 11, 25);  // 2020년 12월 25일로 설정
		System.out.println(df.format(gc.getTime()));
		gc.add(Calendar.DATE, 100); 
		
		String str = df.format(gc.getTime());
		System.out.println(str);
		
		char[] week = {'일','월','화','수','목','금','토'};
		
		for(int i = 0; i < 20 ; i++) {
			gc.set(2021+i,10,10);
			System.out.println(week[gc.get(Calendar.DAY_OF_WEEK)-1]);
		}
		
		gc.set(2020, 0, 1);
		System.out.println(df.format(gc.getTime()));
		
		df = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(df.format(gc.getTime()));
		

		
	}

}
