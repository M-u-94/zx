package lab.io.rush.util;

import java.io.UnsupportedEncodingException;

public class MyEncodingFilter {
	public static String encodingTransfer(String data) throws UnsupportedEncodingException{
		//return new String(data.getBytes("ISO-8859-1"),"utf-8");
		return new String(data.getBytes("ISO-8859-1"),"utf-8");
	}
}
