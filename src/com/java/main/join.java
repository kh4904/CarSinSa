package com.java.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.java.db.MemberDAO;
import com.java.db.MemberDTO;

public class join extends JFrame {
	private JPanel joinPanel;
	private JTextField idTextField, passwordTextField, nameTextField, yearTextField, emailTextField, telTextField,
			homeTextField;
	private JButton Btnback, BtnOk;
    
	public join() {
		setTitle("ȸ������");
		setSize(800, 700);
		setVisible(true);
		setLocationRelativeTo(null);// ���

		joinPanel = new JPanel();
		joinPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(joinPanel);
		joinPanel.setLayout(null);

		// ���̺�
		JLabel lbljoin = new JLabel("ȸ������");
		lbljoin.setBounds(70, 0, 100, 100);// x��,y��,����,���� -
		joinPanel.add(lbljoin);

		JLabel lblid = new JLabel("���̵�");
		lblid.setBounds(70, 30, 100, 100);// x��,y��,����,���� -
		joinPanel.add(lblid);

		JLabel lblpassword = new JLabel("��й�ȣ");
		lblpassword.setBounds(70, 100, 100, 100);// x��,y��,����,���� -
		joinPanel.add(lblpassword);

		JLabel lblname = new JLabel("�̸�");
		lblname.setBounds(70, 170, 100, 100);// x��,y��,����,���� -
		joinPanel.add(lblname);

		JLabel lblyear = new JLabel("�������");
		lblyear.setBounds(70, 240, 100, 100);// x��,y��,����,���� -
		joinPanel.add(lblyear);

		JLabel lblemail = new JLabel("�̸���");
		lblemail.setBounds(70, 310, 100, 100);// x��,y��,����,���� -
		joinPanel.add(lblemail);

		JLabel lbltel = new JLabel("����ȣ");
		lbltel.setBounds(70, 380, 100, 100);// x��,y��,����,���� -
		joinPanel.add(lbltel);

		JLabel lblhome = new JLabel("�ּ�");
		lblhome.setBounds(70, 450, 100, 100);// x��,y��,����,���� -
		joinPanel.add(lblhome);

		// �ؽ�Ʈ�ʵ�

		idTextField = new JTextField();
		idTextField.setBounds(140, 70, 176, 35);
		joinPanel.add(idTextField);
		idTextField.setColumns(10);

		passwordTextField = new JTextField();
		passwordTextField.setBounds(140, 140, 176, 35);
		joinPanel.add(passwordTextField);
		passwordTextField.setColumns(10);

		nameTextField = new JTextField();
		nameTextField.setBounds(140, 210, 176, 35);
		joinPanel.add(nameTextField);
		nameTextField.setColumns(10);

		yearTextField = new JTextField();
		yearTextField.setBounds(140, 280, 176, 35);
		joinPanel.add(yearTextField);
		yearTextField.setColumns(10);

		emailTextField = new JTextField();
		emailTextField.setBounds(140, 350, 176, 35);
		joinPanel.add(emailTextField);
		emailTextField.setColumns(10);

		telTextField = new JTextField();
		telTextField.setBounds(140, 420, 176, 35);
		joinPanel.add(telTextField);
		telTextField.setColumns(10);

		homeTextField = new JTextField();
		homeTextField.setBounds(140, 490, 176, 35);
		joinPanel.add(homeTextField);
		homeTextField.setColumns(10);

		// ��ư
		BtnOk = new JButton("Ȯ��");
		BtnOk.setBounds(680, 520, 104, 100);
		joinPanel.add(BtnOk);

		Btnback = new JButton("�ڷ�");
		Btnback.setBounds(570, 520, 104, 100);
		joinPanel.add(Btnback);

		// �ڷ�
		Btnback.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				LoginFrame frame = new LoginFrame();
				dispose();
			}
		});
		// Ȯ��

		BtnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				MemberDAO dao = MemberDAO.getInstance();
				MemberDTO dto = new MemberDTO();

				dto.setId(idTextField.getText());
				dto.setPassword(passwordTextField.getText());
				dto.setName(nameTextField.getText());
				dto.setYear(yearTextField.getText());
				dto.setEmail(emailTextField.getText());
				dto.setTel(telTextField.getText());
				dto.setHome(homeTextField.getText());
				
				
				int r = dao.mInsert(dto);
				if(1==r) {
				
					dispose();
				}
				
			

			}
		});
	}
}
