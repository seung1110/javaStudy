package kosta.oop3;

public class ServiceMain {

	public static void main(String[] args) {
//		OracleDao od = new OracleDao();
//		Service s = new Service(od);
//
//		s.insertService();
//		s = new Service(new MysqlDao());
////		 s.setDao(new MysqlDao());
//		s.insertService();
		
		DAO dao = new DAO() {
			@Override
			public void insert() {
				System.out.println("MySQLDao 호출");
			}
		};
		
		Service se = new Service(dao);
		se.insertService();
	}

}
