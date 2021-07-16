package com.java.menu;

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
import javax.swing.table.DefaultTableModel;

import com.java.Frame.CarMain;
import com.java.db.MemberDAO;
import com.java.db.MemberDTO;
import com.java.db.UsedCarDAO;
import com.java.db.UsedCarDTO;

public class AddUsedCar extends JFrame {
	private JPanel joinPanel;
	private JTextField CarNameTextField, CarBrandTextField, CarPriceTextField,CarOillTextField,CarFuelTextField, AccidentTextField, CarDriveTextField;
	private JButton Btnback, BtnOk;
	UsedCar me;
	public AddUsedCar(String id) {
		
		setTitle("중고차 등록");
		setSize(800, 700);
		setVisible(true);
		setLocationRelativeTo(null);// 가운데

		joinPanel = new JPanel();
		joinPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(joinPanel);
		joinPanel.setLayout(null);

		// 레이블
		JLabel lbljoin = new JLabel("자동차 이름");
		lbljoin.setBounds(70, 0, 100, 100);// x축,y축,가로,세로 -
		joinPanel.add(lbljoin);

		JLabel lblid = new JLabel("자동차브랜드");
		lblid.setBounds(70, 70, 100, 100);// x축,y축,가로,세로 -
		joinPanel.add(lblid);

		JLabel lblpassword = new JLabel("가격");
		lblpassword.setBounds(70, 140, 100, 100);// x축,y축,가로,세로 -
		joinPanel.add(lblpassword);

		JLabel lblname = new JLabel("연비");
		lblname.setBounds(70, 210, 100, 100);// x축,y축,가로,세로 -
		joinPanel.add(lblname);

		JLabel lblyear = new JLabel("기름");
		lblyear.setBounds(70, 280, 100, 100);// x축,y축,가로,세로 -
		joinPanel.add(lblyear);

		JLabel lblemail = new JLabel("사고유무");
		lblemail.setBounds(70, 350, 100, 100);// x축,y축,가로,세로 -
		joinPanel.add(lblemail);

		JLabel lbltel = new JLabel("주행거리");
		lbltel.setBounds(70, 420, 100, 100);// x축,y축,가로,세로 -
		joinPanel.add(lbltel);


		// 텍스트필드

		CarNameTextField = new JTextField();
		CarNameTextField.setBounds(140,30, 176, 35);
		joinPanel.add(CarNameTextField);
		CarNameTextField.setColumns(10);

		CarBrandTextField = new JTextField();
		CarBrandTextField.setBounds(140,100, 176, 35);
		joinPanel.add(CarBrandTextField);
		CarBrandTextField.setColumns(10);

		CarPriceTextField = new JTextField();
		CarPriceTextField.setBounds(140,170, 176, 35);
		joinPanel.add(CarPriceTextField);
		CarPriceTextField.setColumns(10);

		CarOillTextField = new JTextField();
		CarOillTextField.setBounds(140, 240, 176, 35);
		joinPanel.add(CarOillTextField);
		CarOillTextField.setColumns(10);

		CarFuelTextField = new JTextField();
		CarFuelTextField.setBounds(140, 310, 176, 35);
		joinPanel.add(CarFuelTextField);
		CarFuelTextField.setColumns(10);

		AccidentTextField = new JTextField();
		AccidentTextField.setBounds(140, 380, 176, 35);
		joinPanel.add(AccidentTextField);
		AccidentTextField.setColumns(10);

		CarDriveTextField = new JTextField();
		CarDriveTextField.setBounds(140, 450, 176, 35);
		joinPanel.add(CarDriveTextField);
		CarDriveTextField.setColumns(10);

		// 버튼
		BtnOk = new JButton("확인");
		BtnOk.setBounds(680, 520, 104, 100);
		joinPanel.add(BtnOk);

		Btnback = new JButton("뒤로");
		Btnback.setBounds(570, 520, 104, 100);
		joinPanel.add(Btnback);

		// 뒤로
		Btnback.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			    new UsedCar(id);
				dispose();
			}
		});
		// 확인

		BtnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				UsedCarDAO dao = UsedCarDAO.getInstance();
				UsedCarDTO dto = new UsedCarDTO();
				
				if(AccidentTextField.getText().equals(0)||AccidentTextField.getText().equals("0회")||AccidentTextField.getText().equals("무사고")) {
				dto.setCarName(CarNameTextField.getText());
				dto.setCarBrand(CarBrandTextField.getText());
				dto.setCarPrice(CarPriceTextField.getText());
				dto.setCarOill(CarOillTextField.getText());
				dto.setCarFuel(CarFuelTextField.getText());
				dto.setAccident(AccidentTextField.getText());
				dto.setCarDrive(CarDriveTextField.getText());
				 dao.UseCarmInsert(dto);
			     dispose();
				}
				else
					JOptionPane.showMessageDialog(null, "사고차량은 등록할수 없습니다");
				dispose();
			}
		});
		
		
		
	
	}
}
