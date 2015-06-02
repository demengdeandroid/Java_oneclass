package com.scxh.java.ex023.io.file.reader.coding;

import java.io.UnsupportedEncodingException;
/**
 * ���Java����̨������������������
 * @author viktor
 *
 */
public class TestCoding2 {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException 
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String gbk = "��";  
		
//		String utf8 = new String(gbk.getBytes("GBK"),"ISO-8859-1");  
//	  
//	    //ģ��UTF-8�������վ��ʾ  
//	    System.out.println(new String(utf8.getBytes("ISO-8859-1"),"GBK"));  
	    
	    
	    printBytes(gbk.getBytes("GBK"));
		printBytes(gbk.getBytes("UTF-8"));
		
		//��,  GBK���� һ���ַ���Ӧ�����ֽ�
		byte[] bytes = new byte[]{new Byte((byte)0xe6),new Byte((byte)0x88),new Byte((byte)0x91)};
		String utf8 = new String(bytes,"UTF-8"); 
		System.out.println(utf8);

	}
	private static void printBytes(byte[] bytes) {
		for (byte b : bytes) {
			printByte(b);
		}
		System.out.println();
	}

	private static void printByte(byte abyte) {
		String hex = "00" + Integer.toHexString((int) abyte);
		System.out.print(hex.substring(hex.length() - 2) + "\t");
	}
}
