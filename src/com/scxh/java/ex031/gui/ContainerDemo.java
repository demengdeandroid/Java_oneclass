package com.scxh.java.ex031.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContainerDemo extends JFrame{
	
	public ContainerDemo(){
		this.setTitle("����ѧϰ");
		getContentPane().setBackground(Color.BLUE);
		this.setBounds(500, 100, 400, 300);
		this.setVisible(true);
		this.setLayout(new BorderLayout());
	}
	
	public void ininWindow(){
		JPanel jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jp.setBackground(Color.red);
		jp.setSize(50, 20);
		
		
		JButton loginBtn = new JButton("��¼");
		JButton registBtn = new JButton("ע��");
		
		jp.add(loginBtn);
		jp.add(registBtn);
		
		this.add("North",jp);
		
		
		JPanel jp1 = new JPanel();
		jp1.setLayout(new FlowLayout());
		jp1.setBackground(Color.yellow);
		JButton loginBtn1 = new JButton("��¼1");
		JButton registBtn1 = new JButton("ע��1");
		
		jp1.add(loginBtn1);
		jp1.add(registBtn1);
		
		this.add("South",jp1);
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new FlowLayout());
		jp2.setBackground(Color.green);
		JButton loginBtn2 = new JButton("��¼2");
		JButton registBtn2 = new JButton("ע��2");
		
		jp2.add(loginBtn2);
		jp2.add(registBtn2);
		
		this.add("West",jp2);
		
		
		JPanel jp3 = new JPanel();
		jp3.setLayout(new FlowLayout());
		jp3.setBackground(Color.green);
		JButton loginBtn3 = new JButton("��¼3");
		JButton registBtn3 = new JButton("ע��3");
		
		jp3.add(loginBtn3);
		jp3.add(registBtn3);
		
		this.add("East",jp3);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new ContainerDemo().ininWindow();

	}
	
	

}
