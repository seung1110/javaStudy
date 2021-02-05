package kosta.bank;

public class MyBank {
	private Customer[] customers = new Customer[0];
	private int customersNum;

	public MyBank() {
	}

	public void addCustomer(String ID, String name, long balance) {
		if (customers.length == 0) {
			customers = new Customer[1];
			customers[customersNum++] = new Customer(ID, name, balance);
		} else {
			Customer[] temp = new Customer[customers.length+1];
			System.arraycopy(this.customers, 0, temp, 0, customersNum);
			temp[customersNum++] = new Customer(ID, name, balance);
			customers = temp;
		}
	}

	public int getCustomersNum() {
		return customersNum;
	}
	
	public Customer getCustomer(String ID) {
		for(Customer c : this.customers)
			if(ID.equals(c.getId()))
				return c;
		return null;
	}
	
	public Customer[] getAllCustomer() {
		return this.customers;
	}
	

}
