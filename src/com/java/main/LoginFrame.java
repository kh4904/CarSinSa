package com.java.main;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.java.Frame.CarMain;
import com.java.db.MemberDAO;
import com.java.db.MemberDTO;

public class LoginFrame extends JFrame {

   private JPanel contentPane;
   private JTextField tfUsername, tfPassword;
   private JButton loginBtn, joinBtn;

    
   /**
    * Launch the application.
    */
   public static void main(String[] args) {

      EventQueue.invokeLater(new Runnable() {
         public void run() {
            try {
               LoginFrame frame = new LoginFrame();

            } catch (Exception e) {
               e.printStackTrace();
            }
         }
      });

   }

   /**
    * Create the frame.
    */
   public LoginFrame() {

      setTitle("차신사");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(400, 300);
      setLocationRelativeTo(null);
      contentPane = new JPanel();
      contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
      setContentPane(contentPane);
      contentPane.setLayout(null);

      JLabel lblLogin = new JLabel("username");
      lblLogin.setBounds(41, 52, 69, 35);// x축,y축,가로,세로 -
      contentPane.add(lblLogin);

      JLabel lblPassword = new JLabel("Password");
      lblPassword.setBounds(41, 103, 69, 35);
      contentPane.add(lblPassword);

      tfUsername = new JTextField();
      tfUsername.setBounds(157, 52, 176, 35);
      contentPane.add(tfUsername);
      tfUsername.setColumns(10);

      tfPassword = new JTextField();
      tfPassword.setColumns(10);
      tfPassword.setBounds(157, 103, 176, 35);
      contentPane.add(tfPassword);

      joinBtn = new JButton("회원가입");
      joinBtn.setBounds(229, 154, 104, 29);
      contentPane.add(joinBtn);

      loginBtn = new JButton("로그인");
      loginBtn.setBounds(108, 154, 106, 29);
      contentPane.add(loginBtn);

      setVisible(true);
   
 
      
      loginBtn.addActionListener(new ActionListener() {  

         @Override
         public void actionPerformed(ActionEvent e) {
        	 MemberDAO dao = new MemberDAO();
        	 String id =  tfUsername.getText();
        	 String password =  tfPassword.getText();
        	 dao.mSelect(id,password);
        	 
        	 
        	 dispose();
         }
      });

      joinBtn.addActionListener(new ActionListener() {
         public void actionPerformed(ActionEvent e) {
            new join();
            

         }
      });

   }

}