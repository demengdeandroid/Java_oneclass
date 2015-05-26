package com.scxh.java.ex028.net.url;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdressDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.baidu.com");
			String domainName = addr.getHostName();// ���������
			String IPName = addr.getHostAddress();// ���IP��ַ
			
			System.out.println(domainName);
			System.out.println(IPName);

		} catch (UnknownHostException e) {
			e.printStackTrace();
		}

	}

}
