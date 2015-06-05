package com.scxh.java.ex031.gui;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

public class JTableDemo extends JFrame {
	Container container;
	public JTableDemo(){
		super("���ؼ�");
		this.setBounds(500, 100, 300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container = this.getContentPane();
	}
	
	public void init() {
		TableModel dataModel = new AbstractTableModel() {
			//���ر������
			public int getColumnCount() {
				return 10;
			}
			//����
			public int getRowCount() {
				return 2;
			}
			//��Ԫ��ֵ
			public Object getValueAt(int row, int col) {
				return 5;
			}
		};
		
		JTable table = new JTable(dataModel);
		
		
		container.add(table);
		
		this.setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new JTableDemo().init();

	}

}
