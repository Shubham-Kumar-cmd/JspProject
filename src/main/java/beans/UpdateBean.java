package beans;

import dao.EmpDao;

public class UpdateBean {
	private int id;
	private String name;
	private String email;
	private long mobile;
	private String address;
	private int salary;
	public UpdateBean() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean userupdate() {
		EmpDao edao=new EmpDao();
		boolean flag=edao.recordsUpdate(this);
		return flag;
	}
	public boolean userDelete() {
		EmpDao edao=new EmpDao();
		boolean flag=edao.empDelete(this);
		return flag;
	}
}
