package com.java.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.java.Frame.CarMain;

public class AutoAnswer extends JFrame {
	private JButton BtnBack, Questions1, answer1, Questions2, answer2, Questions3, answer3, Questions4, answer4,Questions5,answer5,Questions6,answer6 ,Questions7, answer7,Questions8, answer8;
	private JPanel contentPane;

	public AutoAnswer(String id) {

		setTitle("�ڵ� ���� �ý���");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Questions1 = new JButton("����� ��� ���� �ǳ���?");
		Questions1.setBounds(10, 10, 400, 30);
		contentPane.add(Questions1);
		answer1 = new JButton("����Ȯ���� �Ϸ�Ǹ� ī�Ż�� ���� ���޵� ��۾�ü�� ������簡 ���� ������ ���� ������� ������ �帳�ϴ�");
		contentPane.add(answer1);
		
		Questions2 = new JButton("ȯ���� �Ұ��� ��쵵 �ֳ���??");
		Questions2.setBounds(10, 80, 400, 30);
		contentPane.add(Questions2);
		answer2 = new JButton("���� �μ� �� �߻��� ���,��������,�ļ�,���˿� �̿�Ǵ� ��� ȯ�� ��󿡼� ���ܵ˴ϴ�");
		contentPane.add(answer2);
		
		Questions3 = new JButton("���Ž� �ʿ��� ������ �����ΰ���??");
		Questions3.setBounds(10, 150, 400, 30);
		contentPane.add(Questions3);
		answer3 = new JButton("���� ������ ���� ������ ������ �ź��� �纻 �� ���������� �ʿ��մϴ�");
		contentPane.add(answer3);
		
		Questions4 = new JButton("��û �� ���� ��۵� �����Ѱ���?");
		Questions4.setBounds(10, 220, 400, 30);
		contentPane.add(Questions4);
		answer4 = new JButton("���� ��� ���Ұ� ���� ���� �Ϸ� �� ��� �غ� �����մϴ�");
		contentPane.add(answer4);

		Questions5 = new JButton("���� ������ ���� �ǳ���?");
		Questions5.setBounds(10, 290, 400, 30);
		contentPane.add(Questions5);
		answer5 = new JButton("���Ż缭�� ȯ���� �������� ���� Ȯ���� �Ϸ�Ǵ� �������� ������ ���������� ����˴ϴ�.");
		contentPane.add(answer5);
		
		Questions6 = new JButton("���Ż� ���񽺴� �����ΰ���?");
		Questions6.setBounds(10, 360, 400, 30);
		contentPane.add(Questions6);
		answer6 = new JButton("���ż� ���� �� ��ϵ� �������� ����� �߰������� �����Ҽ� �ְ� ���񽺸� ������ �帳�ϴ�");
		contentPane.add(answer6);
		
		Questions7 = new JButton("���Ż� ���񽺴� ���� ���� ����� �����Ѱ���?");
		Questions7.setBounds(10, 430, 400, 30);
		contentPane.add(Questions7);
		answer7 = new JButton("�� ���� ���� ��� �����մϴ�. �ٸ� ��ۺ�� �Ÿ��� ���� �����Ǹ� ����� ���Ż� ���� ������ �����ϰ� ���� ���ֽʴϴ� ");
		contentPane.add(answer7);

		Questions8 = new JButton("���� �ȶ� ������ ����?");
		Questions8.setBounds(10, 500, 400, 30);
		contentPane.add(Questions8);
		answer8 = new JButton("1. ���� �������� ���� ���¿��� ������ �޴°��� �����մϴ�,2.�����ݾ��� ��� �ް� ��༭�� �ۼ��ϼ���");
		contentPane.add(answer8);

		
		
		
		BtnBack = new JButton("�ڷ�");
		BtnBack.setBounds(850, 600, 110, 30);
		contentPane.add(BtnBack);

		setVisible(true);

		Questions1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer1.setBounds(450, 10,700, 30);
			}
		});
		
		Questions2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer2.setBounds(450, 80, 700, 30);
			}
		});
		
		Questions3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer3.setBounds(450, 150, 700, 30);
			}
		});
		
		Questions4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer4.setBounds(450, 220, 700, 30);
			}
		});
		
		Questions5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer5.setBounds(450, 290, 700, 30);
			}
		});
		
		Questions6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer6.setBounds(450, 360, 700, 30);
			}
		});
		
		Questions7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer7.setBounds(450, 430, 700, 30);
			}
		});
		
		Questions8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer8.setBounds(450, 500, 700, 30);
			}
		});
		
		
		answer1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer1.setBounds(0, 0, 0, 0);
			}
		});
		answer2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer2.setBounds(0, 0, 0, 0);
			}
		});
		answer3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer3.setBounds(0, 0, 0, 0);
			}
		});
		answer4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer4.setBounds(0, 0, 0, 0);
			}
		});
		answer5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer5.setBounds(0, 0, 0, 0);
			}
		});
		answer6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer6.setBounds(0, 0, 0, 0);
			}
		});
		answer7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer7.setBounds(0, 0, 0, 0);
			}
		});
		answer8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				answer8.setBounds(0, 0, 0, 0);
			}
		});
		
		
		
		
		

		BtnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new CarMain(id);
				dispose();
			}
		});

	}
}