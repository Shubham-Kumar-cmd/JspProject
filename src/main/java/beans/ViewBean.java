package beans;

import java.util.ArrayList;

import dao.EmpDao;

public class ViewBean {
	private int id;
	private String name;
	private String email;
	private long mobile;
	private String address;
	private int salary;
	public ViewBean() {
		
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
	public ArrayList<ViewBean> getAllRecords(){
		EmpDao edao=new EmpDao();
		ArrayList<ViewBean> al=edao.empView();
		return al;
	}
}
