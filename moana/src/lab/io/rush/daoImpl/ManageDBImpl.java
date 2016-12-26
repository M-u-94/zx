package lab.io.rush.daoImpl;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.eclipse.persistence.sdo.types.SDOWrapperType.Bytes_hexBunaryWrapperImpl;

import lab.io.rush.bean.MovieBean;
import lab.io.rush.dao.ManageDB;




public class ManageDBImpl implements ManageDB {
	private MovieBean movie;
	
	private static final String PERSISTENCE_UNIT_NAME = "MovieBean"; 
	private static final EntityManagerFactory factory = Persistence.createEntityManagerFactory(  
            PERSISTENCE_UNIT_NAME); 
	private EntityManager em = factory.createEntityManager(); 
	
	
	public ManageDBImpl(){
		em.getTransaction().begin(); 
	}
	
	public void creatTable(int mid, String mname, int tsum) {
		movie.setMid(mid);
		movie.setMname(mname);
        movie.setTsum(tsum);
        em.persist(movie);  
        em.getTransaction().commit();  
	}
	
	public List findBySQL(String sql){
        Query query = em.createNativeQuery(sql);
        List list =  query.getResultList();
        return list;
	}
	
	
	public void excuteUpdate(String sql){
		Query query = em.createNativeQuery(sql);
		query.executeUpdate();
		em.getTransaction().commit();  
	}
	public int getNum(String mname){
		String sql ="select tsum from movie where mname='"+mname+"';";
		List<Integer> list= findBySQL(sql);
		return list.get(0);
	}
	
	public int getNum(int mid){
		String sql="select tsum from movie where mid="+mid+";";
		List<Integer> list= findBySQL(sql);
		return list.get(0);
	}

	public boolean desNum(String mname){
		//String sqla ="select tsum from movie where mname='"+mname+"';";
		String sqlb ="update movie set tsum=tsum-1 where mname='"+mname+"';";
		//List<Integer> list= executeSQL(sqla);
		
		//if(list.get(0)<=0)
		if(getNum(mname)<=0)
			return false;
		excuteUpdate(sqlb);
		return true;
	}
	
	public boolean desNum(int mid){
		//String sqla ="select tsum from movie where mname='"+mname+"';";
		String sqlb ="update movie set tsum=tsum-1 where mid="+mid+";";
		//List<Integer> list= executeSQL(sqla);
				
		//if(list.get(0)<=0)
		if(getNum(mid)<=0)
			return false;
		excuteUpdate(sqlb);
		
		return true;
	}
	
	
	
	
}
