package org.cms.REPOSITORY;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.cms.DATASOURCES.MySqlDBSource;
import org.cms.MODEL.Login;

public class LoginRepository {
	private MySqlDBSource ds;
	public LoginRepository(MySqlDBSource ds) {
		super();
		this.ds=ds;
	}
	public MySqlDBSource getDs() {
		return ds;
	}
	public void setDs(MySqlDBSource ds) {
		this.ds = ds;
	}
	public int insertLogin(Login o) {
		int r=0;
		try {
		String sql="insert into login values(?,?,?)";
		PreparedStatement ps=ds.getConnection().prepareStatement(sql);
		ps.setInt(1, o.getId());
		ps.setString(2, o.getEmail());
		ps.setString(3, o.getPassword());
		r=ps.executeUpdate();
		
		}catch(Exception e) {
			System.out.println(e);
		}
		return r;
    }
	public List<Login> fecthAllLogins(){
		List<Login> list=new ArrayList<Login>();
		Login o;
		try {
		String sql="select * from login";
		Statement st=ds.getConnection().createStatement();
		ResultSet set=st.executeQuery(sql);
		while(set.next()) {
			int id=set.getInt(1);
			String email=set.getString(2);
			String password=set.getString(3);
			o=new Login(id,email,password);
			list.add(o);
		}
		}catch(Exception e) {
			System.out.println(e);
		}
		 return list;		
	}
	
	
//	public List<Login> fetchAllLogins() {
//	    List<Login> list = new ArrayList<>();
//	    try {
//	        String sql = "SELECT * FROM login";
//	        Statement st = ds.getConnection().createStatement();
//	        ResultSet set = st.executeQuery(sql);
//	        
//	        while (set.next()) {
//	            int id = set.getInt(1);
//	            String email = set.getString(2);
//	            String password = set.getString(3);
//	            Login o = new Login(id, email, password);
//	            list.add(o); // Add to list
//	        }
//	        
//	        set.close();
//	        st.close();
//	    } catch (Exception e) {
//	        e.printStackTrace(); // Log error
//	    }
//	    return list;
//	}

	
	public int updateLogin(Login o, int id) {
		int r=0;
		try {
			String sql="update login set email=?, password=? where id=?";
			PreparedStatement ps=ds.getConnection().prepareStatement(sql);
			ps.setString(1, o.getEmail());
			ps.setString(2, o.getPassword());
			ps.setInt(3, id);
			r=ps.executeUpdate();
		}catch(Exception e) {}
		 return r;
	}
	public int deleteLogin(int id) {
		int r=0;
		try {
			String sql="delete from login where sid=?";
			PreparedStatement ps=ds.getConnection().prepareStatement(sql);
			ps.setInt(1,id);
			r=ps.executeUpdate();
		}catch(Exception e) {
			System.out.println(e);
		}
		return r;
	}
	public Login fetchOneLogin(int id) {
		Login o=new Login();
		try {
			String sql="select * from login where id=?";
			PreparedStatement ps=ds.getConnection().prepareStatement(sql);
			ps.setInt(1,id);
			ResultSet r=ps.executeQuery();
			while(r.next()){
				o.setId(r.getInt(1));
				o.setEmail(r.getString(2));
				o.setPassword(r.getString(3));
			}
			System.out.println(o);
		}catch(Exception e) {
			System.out.println(e);
		}
		return o;
	}
	}


