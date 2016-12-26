package lab.io.rush.servicImpl;

import lab.io.rush.daoImpl.ManageDBImpl;
import lab.io.rush.daoImpl.ManageRedisImpl;
import lab.io.rush.servic.CachedTicketsNum;
public class CachedTicketsSumImpl implements CachedTicketsNum {
	private ManageRedisImpl manageRedis;
	private ManageDBImpl manageDB;
	
	//if "tsum " has changed,reget from mariadb
	public int reGetTicketsSum(String mname) {
		//seems like stupid
		int tsum = manageDB.getNum(mname);
		manageRedis.setMovie(mname, tsum);
		return manageRedis.getByMname(mname);
	}
	
	//if the "tsum" in Mariadb didnot change,get from redis cache
	public int getTicketsSum(String mname) {
		if(manageRedis.getByMname(mname)==0){
			int tsum = manageDB.getNum(mname);
			manageRedis.setMovie(mname, tsum);
		}
		return manageRedis.getByMname(mname);
	}
	
	public ManageRedisImpl getMangeRedis() {
		return manageRedis;
	}
	public void setManageRedis(ManageRedisImpl manageRedis) {
		this.manageRedis = manageRedis;
	}

	public ManageDBImpl getManageDB() {
		return manageDB;
	}

	public void setManageDB(ManageDBImpl manageDB) {
		this.manageDB = manageDB;
	}



	
	
}
