package kosta.oop3;

public class Service {
	
	private DAO dao;

	public Service() {}
	
	public Service(DAO dao) {
		this.dao = dao;
	}
	
	public void insertService() {
		dao.insert();
	}
	
	public DAO getDao() {
		return dao;
	}
	public void setDao(DAO dao) {
		this.dao = dao;
	}
}
