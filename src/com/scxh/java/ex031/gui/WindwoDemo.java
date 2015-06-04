package com.scxh.java.ex031.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.scxh.java.ex015.mangesystem_db.StudentBean;
import com.scxh.java.ex015.mangesystem_db.StudentDB;

/**
 * 1.����->����->����->��� 2.�¼�->����->ע���¼�����
 * 
 * @author viktor
 * 
 */
public class WindwoDemo extends JFrame {
	Container container; // ����
	JButton loginBtn; // ��¼��ť
	JButton registBtn; // ע�ᰴť
	JLabel userNameLable; // ��ʾ�û����ı�ǩ
	JLabel passWordLable; // ��ʾ�����ǩ

	public WindwoDemo() {
		super("��һ�����ڳ���");
		this.setBounds(500, 100, 400, 300);
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
		container.setBackground(Color.white);

		this.setVisible(true);

	}

	public void intint() {
		// �����ؼ�
		loginBtn = new JButton("�������");
		registBtn = new JButton("ע��");
		userNameLable = new JLabel("�û���:");
		passWordLable = new JLabel("����:");

		// ��ӿؼ�������
		container.add(userNameLable);
		container.add(loginBtn);
		container.add(passWordLable);
		container.add(registBtn);

		// ע������¼�
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				StudentBean student = new StudentBean("��Ů","1013");
				StudentDB db = StudentDB.getInstance();
				db.addStudent(student);
			}
		});
		registBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok >>>ע��>>>>>>>>>>");
				WindwoDemo.this.setVisible(false);
				new ContainerDemo().ininWindow();

			}
		});
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WindwoDemo().intint();
	}

}
