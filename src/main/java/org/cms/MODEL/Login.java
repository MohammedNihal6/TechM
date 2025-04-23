package org.cms.MODEL;

import java.io.Serializable;
import java.util.Objects;

public class Login implements Comparable<Login>,Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String email;
	private String password;
	
	public Login(int id, String email, String password) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
	}
	public Login() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Login [id=" + id + ", email=" + email + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(email, id, password);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(password, other.password);
	}
	
	
	public int compareTo(Login o) {
		
		return id.compareTo(o.getId());
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
