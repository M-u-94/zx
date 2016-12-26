package lab.io.rush.dao;

import java.util.List;



public interface ManageDB {
	public void creatTable(int mid, String mname, int tsum);
	public List findBySQL(String sql);
	public void excuteUpdate(String sql);
	public int getNum(String mname);
	public int getNum(int mid);
	public boolean desNum(String mname);
	public boolean desNum(int mid);
	
}
