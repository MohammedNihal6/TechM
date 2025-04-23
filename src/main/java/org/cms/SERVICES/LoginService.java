package org.cms.SERVICES;
import java.util.List;

import org.cms.MODEL.Login;
interface LoginService {
	public int insertLogin(Login o);
	public int updateLogin(Login o, int id);
	public int deleteLogin(int o);
	public List<Login> fetchAll();
	public Login fetchOneLogin(int o);

}
