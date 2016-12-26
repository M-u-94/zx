package lab.io.rush.action;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import lab.io.rush.servicImpl.CachedTicketsSumImpl;
import net.sf.json.JSONObject;

public class RefreshDataAction extends ActionSupport {
	private JSONObject jsonObject;
	private String mname;
	private String mid;// notice "String" ,actually is "int" back system
	private String tsum;
	
	BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	CachedTicketsSumImpl cachedTsum = (CachedTicketsSumImpl) factory.getBean("cachedTsumImpl");

	public String refreshData() throws UnsupportedEncodingException {
		tsum = cachedTsum.getTicketsSum(mname) + "";
		jsonObject = strToJson(tsum);
		return SUCCESS;
	}

	public JSONObject strToJson(String str) {
		Map<String, String> map = new HashMap<>();
		map.put("key", str);
		return JSONObject.fromObject(map);
	}

	public String getMname() {
		return mname;
	}

	public void setMname(String mname) {
		this.mname = mname;
	}

	public String getMid() {
		return mid;
	}

	public void setMid(String mid) {
		this.mid = mid;
	}

	public JSONObject getJsonObject() {
		return jsonObject;
	}

	public void setJsonObject(JSONObject jsonObject) {
		this.jsonObject = jsonObject;
	}

	public String getTsum() {
		return tsum;
	}

	public void setTsum(String tsum) {
		this.tsum = tsum;
	}

	
}
