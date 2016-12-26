package lab.io.rush.daoImpl;

import lab.io.rush.dao.ManageRedis;
import lab.io.rush.util.TicketsUtil;
import redis.clients.jedis.Jedis;

public class ManageRedisImpl implements ManageRedis {
	private Jedis jedis; 

	@Override
	public int getByMname(String mname) {
		
		//return jedis.get("ticketsNum");
		if(jedis.get(mname).equals("0"))
			return 0;
		return Integer.parseInt(jedis.get(mname));
	}
	
	public void setMovie(String mname,int tsum){
		jedis.set(mname,tsum+"");
	}
	

	public Jedis getJedis() {
		return jedis;
	}

	public void setJedis(Jedis jedis) {
		this.jedis = jedis;
	}
	
}
