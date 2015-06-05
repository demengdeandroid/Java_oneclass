package com.scxh.java.ex031.gui.login;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.scxh.java.ex015.mangesystem_db.StudentDB;
import com.scxh.java.ex031.gui.table.TabelDemo;

public class LoginDemo extends JFrame implements ActionListener, ItemListener {
	JPanel p1 = null;
	JPanel p2 = null;
	JPanel p3 = null;
	JLabel userName;
	JTextField txtUser;
	JLabel password;
	JPasswordField txtPwd;
	JLabel role;
	JComboBox cbrole;
	JButton btnLogin;
	JButton btncz;
	JLabel imageLabel;

	Icon image;
	int qxian = 0;
	
	TearchDB db = TearchDB.getInstance();
	
	public LoginDemo() {
		super("��¼����");
		this.setLayout(new FlowLayout());
		this.setBounds(500, 100, 290, 390);
	}

	public void init() {
		userName = new JLabel("��  ��:", JLabel.CENTER);
		txtUser = new JTextField(10);
		password = new JLabel("��  ��:", JLabel.CENTER);
		txtPwd = new JPasswordField(10);
		role = new JLabel("��  ɫ:", JLabel.CENTER);
		cbrole = new JComboBox();
		btnLogin = new JButton("��¼");
		btncz = new JButton("����");

		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();

		cbrole.addItem("����Ա");
		cbrole.addItem("ѧ��");

		image = new ImageIcon("pic\\xslogin.png");
		imageLabel = new JLabel(image);
		p1.add(imageLabel);

		p2.setLayout(new GridLayout(4, 2));
		p2.add(userName);
		p2.add(txtUser);
		p2.add(password);
		p2.add(txtPwd);
		p2.add(role);
		p2.add(cbrole);

		p3.add(btnLogin);
		p3.add(btncz);

		this.add(p1);
		this.add(p2);
		this.add(p3);

		this.setResizable(false);// ���ڴ�С�Ƿ���Ըı�
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �رմ����˳�����
		this.setVisible(true);

		// ����¼�����
		btnLogin.addActionListener(this);
		cbrole.addItemListener(this);
		btncz.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		String un = "scxh";
		String pw = "123456";

		//==== ����====
		if (source == btncz) { 
			txtUser.setText("");
			txtPwd.setText("");
			return;
		}

		//=====��¼====
		if (source == btnLogin) {
			String userName = txtUser.getText();
			String pwd = txtPwd.getText();
			
			if (userName.equals("") || pwd.equals("")) {// �ж��Ƿ��������û���������
				JOptionPane.showMessageDialog(null, "��¼�������벻��Ϊ�գ�");
				return;
			}
			
			boolean flag = db.findTearchByUserNameAndPWD(userName, pwd);
			if (flag) {
				this.setVisible(false);
				new TabelDemo().init();
			} else {
				JOptionPane.showMessageDialog(null, "��¼�����������");
				txtUser.setText("");
				txtPwd.setText("");
			}
		}

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
			JComboBox jcb = (JComboBox) e.getSource();
			qxian = jcb.getSelectedIndex();
		}
	}

	public static void main(String[] args) {
		new LoginDemo().init();
	}
}
