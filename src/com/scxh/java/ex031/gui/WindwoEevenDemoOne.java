package com.scxh.java.ex031.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 1.����->����->����->��� 2.�¼�->����->ע���¼�����
 * 
 * @author viktor
 * 
 */
public class WindwoEevenDemoOne extends JFrame implements ActionListener {
	Container container; //����
	JButton loginBtn;    //��¼��ť
	JButton registBtn;  //ע�ᰴť
	JLabel userNameLable; //��ʾ�û����ı�ǩ
	JLabel passWordLable; //��ʾ�����ǩ

	public WindwoEevenDemoOne() {
		super("��һ�����ڳ���");
		this.setBounds(500, 100, 400, 300);
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
		container.setBackground(Color.white);
		
		this.setVisible(true);
	}

	public void intint() {
		//�����ؼ�
		loginBtn = new JButton("��¼");
		registBtn = new JButton("ע��");
		userNameLable = new JLabel("�û���:");
		passWordLable = new JLabel("����:");

		//��ӿؼ�������
		container.add(userNameLable);
		container.add(loginBtn);
		container.add(passWordLable);
		container.add(registBtn);

		//ע������¼�
		loginBtn.addActionListener(this);
		registBtn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// if(e.getActionCommand() == "��¼") {
		// System.out.println("ok >>>��¼>>>>>>>>>>");
		// }
		// if(e.getActionCommand() == "ע��") {
		// System.out.println("ok >>>ע��>>>>>>>>>>");
		// }

		//��������¼�
		if (e.getSource() == loginBtn) {
			System.out.println("ok >>>��¼>>>>>>>>>>");
		}
		if (e.getSource() == registBtn) {
			System.out.println("ok >>>ע��>>>>>>>>>>");
			this.setVisible(false);
			new ContainerDemo().ininWindow();
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WindwoEevenDemoOne().intint();
	}

}
