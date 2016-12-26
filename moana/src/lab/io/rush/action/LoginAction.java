package lab.io.rush.action;

import com.opensymphony.xwork2.ActionSupport;
/*
 * �����¼������˺�����Ӧ�������ݿ�ȡ
 */
public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userName;
	private String passWord;
	public String userLogin(){
		//if(userName.equals("")&&passWord.equals("a")){
			
			return SUCCESS;
		//}
			
		//return ERROR;
	}
	
		
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
}
