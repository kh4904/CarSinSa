package com.java.menu;

import java.awt.Point;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.java.Frame.CarMain;
import com.java.db.NewCarDAO;
import com.java.db.NewCarDTO;
import com.java.db.UsedCarDAO;
import com.java.db.MemberDAO;
import com.java.db.MemberDTO;

import java.sql.*;
import com.java.Frame.*;

public class NewCar extends JFrame {

	private JPanel contentPane, contentPane2;
	private JButton BtnBack, BtnCar1, BtnCar2, BtnCar3, BtnCar4, BtnCar5;
	String[] header = { "제품명", "브랜드", "가격", "연비", "연료" };
	DefaultTableModel dtm ;
    
	public boolean isCellEdittable(int i, int c) {
		return false;
	};
	NewCarDAO dao =NewCarDAO.getInstance();
	 
	public NewCar(String id) {
			
		
		

		setTitle("자동차 구매");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(700, 500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		BtnBack = new JButton("뒤로");
		BtnBack.setBounds(400, 420, 110, 30);
		contentPane.add(BtnBack);
		
		

	
		dtm = new DefaultTableModel(header, 0) {
			@Override // 수정 금지
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		};

		JTable table = new JTable(dtm);
		table.getTableHeader().setReorderingAllowed(false);// 열 위치 수정불가

		JScrollPane scroll = new JScrollPane(table);
		// dtm.addRow(car);
		scroll.setBounds(40, 10, 600, 200);
        
		contentPane.add(scroll);

		

		setVisible(true);
         
        cartable();	    
		
		// table 더블 클릭 이벤트
		table.getTableHeader().setReorderingAllowed(false);
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				if (e.getClickCount() == 2) {
					int row = table.getSelectedRow();
					int col = table.getSelectedColumn();
					Object value0 = table.getValueAt(row, 0);
					Object value1 = table.getValueAt(row, 1);
					Object value2 = table.getValueAt(row, 2);
					Object value3 = table.getValueAt(row, 3);
					Object value4 = table.getValueAt(row, 4);

					int result2 = JOptionPane.showConfirmDialog(null, value0+"상품을 구매하시겠습니까?.", "구매", JOptionPane.YES_NO_OPTION);
					if (result2 == JOptionPane.CLOSED_OPTION) {
						return;
					} else if (result2 == JOptionPane.YES_OPTION) {
						NewCarDAO cardao = NewCarDAO.getInstance();
						NewCarDTO cardto = new NewCarDTO();
						cardto.setCarName((String) value0);
						cardto.setCarBrand((String) value1);
						cardto.setCarPrice((String) value2);
						cardto.setCarOill((String) value3);
						cardto.setCarFuel((String) value4);
						
						 cardao.carInselt(cardto,id);
						 cardao.deleteCar(cardto);

					}
				}
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});

		// 뒤로 버튼 이벤트
		BtnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				dispose();
				new CarMain(id);
			}
		});
		
		

	}
	public void cartable() {
         
		NewCarDAO dao =NewCarDAO.getInstance();
	    
		dao.carSelect();
		try {
			while (dao.rs.next()) {
				Object[] data = { dao.rs.getString("CarName"), dao.rs.getString("CarBrand"),
						dao.rs.getString("CarPrice"), dao.rs.getString("CarOill"), dao.rs.getString("CarFuel") };
				dtm.addRow(data);
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		
		
	}
	
}