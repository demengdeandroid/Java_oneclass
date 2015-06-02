/*
 * Created on 2004-2-11
 */
package com.scxh.java.ex030.data.connects;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ������
 * 
 * @author sqlover
 */
public class Parameter {

	//���ݿ�����
	public static String LOG_CONFIG;
	public static String DB_DRIVER;
	public static String DB_IP;
	public static String DB_NAME;
	public static String DB_PASSWORD;
	public static String DB_TYPE;
	public static String DB_USER;
	
	static private Properties props = new Properties();
	
	static {
		System.out.println("Start Load properties file[conf.properties].");		
		try{

			InputStream in = Parameter.class.getClassLoader().getResourceAsStream("conf.properties");
			if (in == null) {
				System.out.println("Can not find conf.properties.");
				throw new ExceptionInInitializerError("Can not find conf.properties.");
			}
			props.load(in);
		}catch(IOException ex) {
			System.out.println("Load conf.properties data error.");
			throw new ExceptionInInitializerError("Load conf.properties data error.");
		}
		
		//��ʼ��������
		//log4j�����ļ�
		String value =  props.getProperty("log4j.file");
		if (value == null) {
			throw new IllegalArgumentException("Can not get log4j.file.");
		} else {
			System.out.println("LOG_CONFIG=["+value+"]");
			LOG_CONFIG = value;
		}
		
		//���ݿ�����
		value =  props.getProperty("database.driver");
		if (value == null) {
			throw new IllegalArgumentException("Can not get database.driver.");
		} else {
			System.out.println("DB_DRIVER=["+value+"]");
			DB_DRIVER = value;
		}
		
		//���ݿ�ip
		value =  props.getProperty("database.ip");
		if (value == null) {
			throw new IllegalArgumentException("Can not get database.ip.");
		} else {
			System.out.println("DB_IP=["+value+"]");
			DB_IP = value;
		}
		
		//���ݿ���
		value =  props.getProperty("database.name");
		if (value == null) {
			throw new IllegalArgumentException("Can not get database.name.");
		} else {
			System.out.println("DB_NAME=["+value+"]");
			DB_NAME = value;
		}
		
		//���ݿ�����
		value =  props.getProperty("database.password");
		if (value == null) {
			throw new IllegalArgumentException("Can not get database.password.");
		} else {
			System.out.println("DB_PASSWORD=["+value+"]");
			DB_PASSWORD = value;
		}
		
		//���ݿ�����
		value =  props.getProperty("database.type");
		if (value == null) {
			throw new IllegalArgumentException("Can not get database.type.");
		} else {
			System.out.println("DB_TYPE=["+value+"]");
			DB_TYPE = value;
		}
		
		//���ݿ��û���
		value =  props.getProperty("database.user");
		if (value == null) {
			throw new IllegalArgumentException("Can not get database.user.");
		} else {
			System.out.println("DB_USER=["+value+"]");
			DB_USER = value;
		}
	}
}