package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import beans.EditBean;
import beans.LoginBean;
import beans.RegisterBean;
import beans.UpdateBean;
import beans.ViewBean;

public class EmpDao {
	//for login 
	public boolean emplogin(LoginBean lb) {
		boolean flag=false;
		try {
			Connection connection=DBConnection.getConnection();
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from login_emp where username='"+lb.getUsername()+"' and password='"+lb.getPassword()+"'");
			while(rs.next()) {
				flag=true;
				System.out.println("ResultSet success "+rs);
				return flag;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return flag;
	}

	//for register
	public boolean empregister(RegisterBean rb) {
		boolean flag=false;
		int i=0;
		try {
			Connection connection=DBConnection.getConnection();
			PreparedStatement ps=connection.prepareStatement("insert into register_emp values(?,?,?,?,?,?)");
			ps.setInt(1, rb.getId());
			ps.setString(2, rb.getName());
			ps.setString(3, rb.getEmail());
			ps.setLong(4, rb.getMobile());
			ps.setString(5, rb.getAddress());
			ps.setInt(6, rb.getSalary());
			i=ps.executeUpdate();
			ps.close();
			if(i==1) {
				PreparedStatement ps1=connection.prepareStatement("insert into login_emp values(?,?,?)");
				ps1.setInt(1, rb.getId());
				ps1.setString(2, rb.getUsername());
				ps1.setString(3, rb.getPassword());
				i=ps1.executeUpdate();
				ps1.close();
				if(i==1) {
					flag=true;
					System.out.println("success register "+flag);
				}
				else {
					flag=false;
					return flag;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}

	//for edit profile
	public RegisterBean empupdate(EditBean eb) {
		RegisterBean rb=null;
		try {
			Connection connection=DBConnection.getConnection();
			PreparedStatement ps=connection.prepareStatement("select * from register_emp where id=?");
			ps.setInt(1, eb.getId());
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				rb=new RegisterBean();
				rb.setId(rs.getInt(1));
				rb.setName(rs.getString(2));
				rb.setEmail(rs.getString(3));
				rb.setMobile(rs.getLong(4));
				rb.setAddress(rs.getString(5));
				rb.setSalary(rs.getInt(6));
				System.out.println("get record success");
				return rb;
			}
			ps.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rb;
	}

	//for update profile
	public boolean recordsUpdate(UpdateBean ub) {
		boolean flag=false;
		int i=0;
		try {
			Connection connection=DBConnection.getConnection();
			PreparedStatement ps=connection.prepareStatement("update register_emp set name=?,email=?,mobile=?,address=?,salary=? where id=?");
			ps.setString(1, ub.getName());
			ps.setString(2, ub.getEmail());
			ps.setLong(3, ub.getMobile());
			ps.setString(4, ub.getAddress());
			ps.setInt(5, ub.getSalary());
			ps.setInt(6, ub.getId());
			i=ps.executeUpdate();
			ps.close();
			if(i==1) {
				flag=true;
			}
			else {
				flag=false;
				return flag;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	//delete profile
	public boolean empDelete(UpdateBean ub) {
		boolean flag=false;
		int x=0;
		int y=0;
		try {
			Connection conn=DBConnection.getConnection();
			Statement stmt=conn.createStatement();
			x=stmt.executeUpdate("delete from register_emp where id="+ub.getId());
			if(x==1) {
				y=stmt.executeUpdate("delete from login_emp where id="+ub.getId());
				if(y==1) {
					flag=true;
					System.out.println("deleted success "+flag);
				}
				else {
					flag=false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
	
	//view
	public ArrayList<ViewBean> empView(){
		ArrayList<ViewBean> al=new ArrayList<ViewBean>();
		try {
			Connection conn=DBConnection.getConnection();
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from register_emp");
			while(rs.next()) {
				ViewBean vb=new ViewBean();
				vb.setId(rs.getInt(1));
				vb.setName(rs.getString(2));
				vb.setEmail(rs.getString(3));
				vb.setMobile(rs.getLong(4));
				vb.setAddress(rs.getString(5));
				vb.setSalary(rs.getInt(6));
				al.add(vb);
			}
			System.out.println("all record found");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return al;
	}
}
