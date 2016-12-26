package lab.io.rush.invocation;



import org.aspectj.lang.JoinPoint;

import lab.io.rush.daoImpl.ManageDBImpl;
import lab.io.rush.daoImpl.ManageRedisImpl;

/*
 * if user click "grab tickets" ,update the in-memory database
 * after this method 
 * "public boolean desNum(String mname)"
 * execute method "public void setMovie(String mname,int tsum)"
 */
public class UpdateRedis {
	private ManageDBImpl manageDB;

	private ManageRedisImpl manageRedis;

	private void updateRedis(JoinPoint joinpoint) {
		Object[] object = joinpoint.getArgs();
		String mname = (String) object[0];
		//after desNum  get newest data 
		int tsum = manageDB.getNum(mname);
		manageRedis.setMovie(mname, tsum);

	}

	public ManageDBImpl getManageDB() {
		return manageDB;
	}

	public void setManageDB(ManageDBImpl manageDB) {
		this.manageDB = manageDB;
	}

	public ManageRedisImpl getManageRedis() {
		return manageRedis;
	}

	public void setManageRedis(ManageRedisImpl manageRedis) {
		this.manageRedis = manageRedis;
	}

}
