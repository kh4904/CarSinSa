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
		
		setTitle("차신사");
		setSize(700, 700);
		setVisible(true);
		setLocationRelativeTo(null);// 가운데

		joinPanel = new JPanel();
		joinPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(joinPanel);
		joinPanel.setLayout(null);

		// 버튼
		BtnNewcar = new JButton("New 자동차 구매");
		BtnNewcar.setBounds(100, 120, 150, 150);
		joinPanel.add(BtnNewcar);

		BtnUsedcar = new JButton("중고 자동차 구매 ");
		BtnUsedcar.setBounds(500, 120, 150, 150);
		joinPanel.add(BtnUsedcar);

		BtnOrder = new JButton("주문 정보 조회");
		BtnOrder.setBounds(100, 400, 150, 150);
		joinPanel.add(BtnOrder);

		BtnCustomer = new JButton("고객문의");
		BtnCustomer.setBounds(500, 400, 150, 150);
		joinPanel.add(BtnCustomer);

		// 새차
		BtnNewcar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new NewCar(id);
				dispose();
			}
		});

		// 중고차
		BtnUsedcar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new UsedCar(id);
				dispose();
			}
		});// 주문정보
		BtnOrder.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Orderjoin(id);
				dispose();
			}
		});

		// 자동응답
		BtnCustomer.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new AutoAnswer(id);
				dispose();
			}
		});

	}
}