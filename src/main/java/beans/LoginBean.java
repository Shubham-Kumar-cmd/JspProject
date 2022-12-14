package beans;

import dao.EmpDao;

public class LoginBean {
	private String username;
	private String password;
	public LoginBean() {
		
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public boolean loginVerify() {
		EmpDao edao = new EmpDao();
		boolean flag=edao.emplogin(this);
		return flag;
	}
}
