package com.scxh.java.ex031.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * 1.����->����->����->��� 
 * 2.�¼�->����->ע���¼�����
 * 
 * @author viktor
 * 
 */
public class WindwoEvenDemo extends JFrame {
	Container container; // ����
	JButton loginBtn; // ��¼��ť
	JButton registBtn; // ע�ᰴť
	JLabel userNameLable; // ��ʾ�û����ı�ǩ
	JLabel passWordLable; // ��ʾ�����ǩ
	JTextField userNameTxt;//�û����ı������
	JTextField passWordTxt;//�����ı������
	JPanel userJPanel,pwJPanel,userPwJPanel; 
	
	public WindwoEvenDemo() {
		super("��һ�����ڳ���");
		this.setBounds(500, 100, 300, 300);
		container = this.getContentPane();
		container.setLayout(new FlowLayout());
//		container.setBackground(Color.white);
//		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void intint() {
		// �����ؼ�
		loginBtn = new JButton("��¼");
		registBtn = new JButton("ע��");
		userNameLable = new JLabel("�û���:");
		passWordLable = new JLabel("����:");
		userNameTxt = new JTextField(10);
		passWordTxt= new JTextField(10);
		userJPanel = new JPanel();
		pwJPanel = new JPanel();
		userPwJPanel = new JPanel();
		
		userJPanel.setLayout(new FlowLayout());
		pwJPanel.setLayout(new FlowLayout());
		userPwJPanel.setLayout(new FlowLayout());
		
		// ��ӿؼ�������
		userJPanel.add(userNameLable);
		userJPanel.add(userNameTxt);
		
		pwJPanel.add(passWordLable);
		pwJPanel.add(passWordTxt);
		
		userPwJPanel.add(loginBtn);
		userPwJPanel.add(registBtn);

		container.add(userJPanel);
		container.add(pwJPanel);
		container.add(userPwJPanel);
		
		
		// ע������¼�
		loginBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String txt = userNameTxt.getText();
				System.out.println(txt);
				
				if(txt.equals("")){
					JOptionPane.showMessageDialog(null, "��¼�������벻��Ϊ�գ�");
				}
			}
		});
		registBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				WindwoEvenDemo.this.setVisible(false);
				new ContainerDemo().ininWindow();

			}
		});
	
		
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new WindwoEvenDemo().intint();
	}

}
