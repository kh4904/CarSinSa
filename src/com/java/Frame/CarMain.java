package com.java.Frame;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import com.java.main.LoginFrame;
import com.java.menu.*;

public class CarMain extends JFrame {
	private JPanel joinPanel;
	private JButton BtnNewcar, BtnUsedcar, BtnOrder, BtnCustomer;

	public CarMain(String id) {
		
		setTitle("���Ż�");
		setSize(700, 700);
		setVisible(true);
		setLocationRelativeTo(null);// ���

		joinPanel = new JPanel();
		joinPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(joinPanel);
		joinPanel.setLayout(null);

		// ��ư
		BtnNewcar = new JButton("New �ڵ��� ����");
		BtnNewcar.setBounds(100, 120, 150, 150);
		joinPanel.add(BtnNewcar);

		BtnUsedcar = new JButton("�߰� �ڵ��� ���� ");
		BtnUsedcar.setBounds(500, 120, 150, 150);
		joinPanel.add(BtnUsedcar);

		BtnOrder = new JButton("�ֹ� ���� ��ȸ");
		BtnOrder.setBounds(100, 400, 150, 150);
		joinPanel.add(BtnOrder);

		BtnCustomer = new JButton("������");
		BtnCustomer.setBounds(500, 400, 150, 150);
		joinPanel.add(BtnCustomer);

		// ����
		BtnNewcar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NewCar(id);
				dispose();
			}
		});

		// �߰���
		BtnUsedcar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UsedCar(id);
				dispose();
			}
		});// �ֹ�����
		BtnOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Orderjoin(id);
				dispose();
			}
		});

		// �ڵ�����
		BtnCustomer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AutoAnswer(id);
				dispose();
			}
		});

	}
}