package lab.io.rush.dao;

public interface ManageRedis {
	public int getByMname(String mname);
	public void setMovie(String mname,int tsum);
}
