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

		setTitle("자동 응답 시스템");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1200,700);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		Questions1 = new JButton("배송은 어떻게 진행 되나요?");
		Questions1.setBounds(10, 10, 400, 30);
		contentPane.add(Questions1);
		answer1 = new JButton("구매확정이 완료되면 카신사와 정식 제휴된 배송업체의 전문기사가 직접 차량을 몰고 배송지로 가져다 드립니다");
		contentPane.add(answer1);
		
		Questions2 = new JButton("환불이 불가한 경우도 있나요??");
		Questions2.setBounds(10, 80, 400, 30);
		contentPane.add(Questions2);
		answer2 = new JButton("차량 인수 후 발생한 사고,고의적인,파손,범죄에 이용되는 경우 환불 대상에서 제외됩니다");
		contentPane.add(answer2);
		
		Questions3 = new JButton("구매시 필요한 서류는 무엇인가요??");
		Questions3.setBounds(10, 150, 400, 30);
		contentPane.add(Questions3);
		answer3 = new JButton("명의 이전을 위해 구매자 본인의 신분증 사본 및 인적사항이 필요합니다");
		contentPane.add(answer3);
		
		Questions4 = new JButton("신청 후 당일 배송도 가능한가요?");
		Questions4.setBounds(10, 220, 400, 30);
		contentPane.add(Questions4);
		answer4 = new JButton("차량 대금 지불과 보험 가입 완료 후 출고 준비가 가능합니다");
		contentPane.add(answer4);

		Questions5 = new JButton("차량 이전은 언제 되나요?");
		Questions5.setBounds(10, 290, 400, 30);
		contentPane.add(Questions5);
		answer5 = new JButton("차신사서비스 환불제 적용으로 구매 확정이 완료되는 시점부터 소유자 이전절차가 진행됩니다.");
		contentPane.add(answer5);
		
		Questions6 = new JButton("차신사 서비스는 무엇인가요?");
		Questions6.setBounds(10, 360, 400, 30);
		contentPane.add(Questions6);
		answer6 = new JButton("차신서 서비스 에 등록된 신형차와 무사고 중고차량을 구매할수 있게 서비스를 제공해 드립니다");
		contentPane.add(answer6);
		
		Questions7 = new JButton("차신사 서비스는 전국 어디든 배송이 가능한가요?");
		Questions7.setBounds(10, 430, 400, 30);
		contentPane.add(Questions7);
		answer7 = new JButton("네 전국 어디든 배송 가능합니다. 다만 배송비는 거리에 따라 측정되며 배송은 차신사 전용 기사님이 안전하게 진행 해주십니다 ");
		contentPane.add(answer7);

		Questions8 = new JButton("차를 팔때 주의할 점은?");
		Questions8.setBounds(10, 500, 400, 30);
		contentPane.add(Questions8);
		answer8 = new JButton("1. 차를 보여주지 않은 상태에서 계약금을 받는것은 위험합니다,2.차량금액을 모두 받고 계약서를 작성하세요");
		contentPane.add(answer8);

		
		
		
		BtnBack = new JButton("뒤로");
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