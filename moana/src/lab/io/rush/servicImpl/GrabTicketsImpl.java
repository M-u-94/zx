package lab.io.rush.servicImpl;

import lab.io.rush.daoImpl.ManageDBImpl;
import lab.io.rush.servic.GrabTickets;

public class GrabTicketsImpl implements GrabTickets {
	private ManageDBImpl manageDB;
	
	public boolean grapTickets(String mname) {
		return manageDB.desNum(mname);
	}
	public boolean grapTickets(int mid){
		return manageDB.desNum(mid);
	}
	
	
	public ManageDBImpl getManageDB() {
		return manageDB;
	}
	public void setManageDB(ManageDBImpl manageDB) {
		this.manageDB = manageDB;
	}
	

}
