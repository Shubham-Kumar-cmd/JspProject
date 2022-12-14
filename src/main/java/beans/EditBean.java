package beans;

import dao.EmpDao;

public class EditBean {
	private int id;
	public EditBean() {
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public RegisterBean editrecords() {
		EmpDao edao=new EmpDao();
		RegisterBean rb=edao.empupdate(this);
		return rb;
	}

}
