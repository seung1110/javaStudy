package kosta.video;

public class VideoMain {

	public static void main(String[] args) {
		GeneralMember[] gm = {new GeneralMember("aaa","홍길동","동탄"),
				new SpecialMember("bbb","김철수","서울",10)};
//		GeneralMember gm = new GeneralMember("aaa","홍길동","동탄");
//		SpecialMember sm = new SpecialMember("bbb","김철수","서울",10);
		Video v1 = new Video("1","트랜스포머3","서봉수");
		Video v2 = new Video("2","쿵푸팬더2","지성민");
		gm[0].rentalService(v1);
		gm[1].rentalService(v2);
//		gm.rentalService(v1);
//		sm.rentalService(v2);
		
		for(GeneralMember g : gm) {
			g.printMember();
			System.out.println();
		}

		
	}	

}
