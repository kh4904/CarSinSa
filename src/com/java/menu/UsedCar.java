package com.java.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import com.java.Frame.CarMain;
import com.java.db.NewCarDAO;
import com.java.db.UsedCarDAO;
import com.java.db.UsedCarDTO;


public class UsedCar extends JFrame {

	private JPanel contentPane, contentPane2;
	private JButton BtnAdd, BtnBack, BtnCar1, BtnCar2, BtnCar3, BtnCar4, BtnCar5;
	String[] header = { "제품명", "브랜드", "가격", "연비", "연료", "사고유무", "주행거리" };
	DefaultTableModel dtm;

	public boolean isCellEdittable(int i, int c) {
		return false;
	};

	UsedCarDAO dao = UsedCarDAO.getInstance();

	public UsedCar(String id) {

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

		BtnAdd = new JButton("중고차 등록");
		BtnAdd.setBounds(550, 420, 110, 30);
		contentPane.add(BtnAdd);

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
		scroll.setBounds(100, 10, 500, 300);

		contentPane.add(scroll);

		setVisible(true);

		cartable2();

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
					Object value5 = table.getValueAt(row, 5);
					Object value6 = table.getValueAt(row, 6);

					int result2 = JOptionPane.showConfirmDialog(null, value0 + "상품을 구매하시겠습니까?.", "구매",
							JOptionPane.YES_NO_OPTION);
					if (result2 == JOptionPane.CLOSED_OPTION) {
						return;
					} else if (result2 == JOptionPane.YES_OPTION) {
					
						UsedCarDAO cardao = UsedCarDAO.getInstance();
						UsedCarDTO cardto = new UsedCarDTO();
						cardto.setCarName((String) value0);
						cardto.setCarBrand((String) value1);
						cardto.setCarPrice((String) value2);
						cardto.setCarOill((String) value3);
						cardto.setCarFuel((String) value4);
						cardto.setAccident((String) value5);
						cardto.setCarDrive((String) value6);

						cardao.carInselt(cardto, id);
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

		BtnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				new AddUsedCar(id);

			}
		});

	}

	public void cartable2() {
		UsedCarDAO dao =UsedCarDAO.getInstance();
		
		dao.carSelect2();
		try {
			while (dao.rs.next()) {
				Object[] data = { dao.rs.getString("CarName"), dao.rs.getString("CarBrand"),
						dao.rs.getString("CarPrice"), dao.rs.getString("CarOill"), dao.rs.getString("CarFuel"),
						dao.rs.getString("Accident"), dao.rs.getString("CarDrive") };
				dtm.addRow(data);
			}
		} catch (Exception e2) {
			e2.printStackTrace();
		}

	

	}

}