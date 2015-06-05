package com.scxh.java.ex031.gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class WindowLoginDemo extends JFrame {
	Container container; // ����
	JButton loginBtn; // ��¼��ť
	JButton registBtn; // ע�ᰴť
	
	JLabel userNameLable; // ��ʾ�û����ı�ǩ
	JLabel passWordLable; // ��ʾ�����ǩ
	JLabel imageLable;
	
	JTextField userNameTxt;// �û����ı������
	JTextField passWordTxt;// �����ı������
	
	JPanel imageJP;
	JPanel gridJP;
	JPanel userPwJP;

	public WindowLoginDemo() {
		super("���粼��ѧϰGridLayout");
		this.setBounds(500, 100, 300, 400);
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void init() {
		// �����ؼ�
		ImageIcon image = new ImageIcon("pic\\xslogin.png");
		
		loginBtn = new JButton("��¼");
		registBtn = new JButton("ע��");
		
		userNameLable = new JLabel("�û���:");
		passWordLable = new JLabel("��    ��:");
		imageLable = new JLabel(image);
		
		userNameTxt = new JTextField(10);
		passWordTxt = new JTextField(10);
		gridJP = new JPanel();
		userPwJP = new JPanel();
		imageJP = new JPanel();
		
		imageJP.setLayout(new FlowLayout());
		imageJP.add(imageLable);
		
		gridJP.setLayout(new GridLayout(3,2));
		gridJP.add(userNameLable);
		gridJP.add(userNameTxt);
		gridJP.add(passWordLable);
		gridJP.add(passWordTxt);
		
		userPwJP.setLayout(new FlowLayout());
		userPwJP.add(loginBtn);
		userPwJP.add(registBtn);
		
		container.add(imageJP);
		container.add(gridJP);
		container.add(userPwJP);
		
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WindowLoginDemo().init();
	}

}
