package org.cms.SERVICES;
import java.util.List;

import org.cms.MODEL.Login;
import org.cms.REPOSITORY.LoginRepository;

public class LoginServiceImpl implements LoginService{
	private LoginRepository repository;
	public LoginServiceImpl() {
		super();
	}
	public LoginServiceImpl(LoginRepository repository) {
		this.repository = repository;
	}
	public int insertLogin(Login o) {
		return repository.insertLogin(o);
	}
	public int updateLogin(Login o, int id) {
		return repository.insertLogin(o);
	}
	public int deleteLogin(int o) {
		return repository.deleteLogin(o);
	}
	public List<Login> fetchAll(){
		return repository.fecthAllLogins();
	}
	public Login fetchOneLogin(int o) {
		return repository.fetchOneLogin(o);
	}
}
	


