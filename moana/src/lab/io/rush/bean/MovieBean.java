package lab.io.rush.bean;
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;  
import javax.persistence.Table;  
import javax.persistence.UniqueConstraint;
  
@Entity  
@Table(name="Movie")  
public class MovieBean {  
    @Id  
    @GeneratedValue(strategy = GenerationType.IDENTITY)  
    @Column(name="id")  
    private int id;  
    
    @Column(unique=true,name="mid")
    private int mid;  
    
	@Column(name="mname")
	//@Column(name="mname")
    private String mname;
    
    @Column(name="tsum")
    private int tsum;
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

    public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getTsum() {
		return tsum;
	}

	public void setTsum(int tsum) {
		this.tsum = tsum;
	}
 
}
