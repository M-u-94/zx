package lab.io.rush.action;


import java.io.UnsupportedEncodingException;

import javax.annotation.Resource;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import lab.io.rush.servic.GrabTickets;
import lab.io.rush.servicImpl.CachedTicketsSumImpl;
import lab.io.rush.servicImpl.GrabTicketsImpl;



public class GrabTicketsAction extends ActionSupport{
	private String mname;
	private int mid;
	
	BeanFactory factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	private GrabTickets tickets = (GrabTickets)factory.getBean("grabTickets");
	
	
	

	//GrabTickets tickets  = (GrabTickets)ApplicationContextHelper.getBean("grabTickets");
	public String bookingTickets() throws UnsupportedEncodingException{
		mname = new String(mname.getBytes("ISO-8859-1"),"utf-8");
		if(tickets.grapTickets(mname)){
			return SUCCESS;
		}
			
		return ERROR;
	}
	
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}

	public int getMid() {
		return mid;
	}

	public void setMid(int mid) {
		this.mid = mid;
	}

	
	
	
}
