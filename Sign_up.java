package Cook_recipe;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Sign_up {

	private JFrame frmSignUp;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void Sign_up_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sign_up window = new Sign_up();
					window.frmSignUp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Sign_up() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmSignUp = new JFrame();
		frmSignUp.setTitle("Sign up");
		frmSignUp.setBounds(100, 100, 725, 545);
		frmSignUp.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		frmSignUp.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 703, 489);
		frmSignUp.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Submit");
		
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			}
		});
		
		JLabel lblBack = new JLabel("Back");
		lblBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cook_recipe.Login.Login_screen();
			}
		});
		lblBack.setBackground(Color.LIGHT_GRAY);
		lblBack.setIcon(new ImageIcon(Sign_up.class.getResource("/images/back.gif")));
		lblBack.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		lblBack.setBounds(52, 42, 78, 27);
		panel.add(lblBack);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("210 맨발의청춘 R", Font.BOLD, 21));
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(267, 379, 170, 40);
		panel.add(btnNewButton);
		
		JComboBox comboBox_2 = new JComboBox();		//일
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"}));
		comboBox_2.setMaximumRowCount(5);
		comboBox_2.setToolTipText("DD");
		comboBox_2.setBounds(462, 307, 52, 27);
		panel.add(comboBox_2);
		
		JComboBox comboBox_1 = new JComboBox();		//월
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		comboBox_1.setMaximumRowCount(5);
		comboBox_1.setToolTipText("MM");
		comboBox_1.setBounds(531, 307, 54, 27);
		panel.add(comboBox_1);
		
		JComboBox comboBox = new JComboBox();		//년도
		comboBox.setMaximumRowCount(5);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980"}));
		comboBox.setToolTipText("YYYY");
		comboBox.setBounds(376, 307, 70, 27);
		panel.add(comboBox);
		
		textField_1 = new JTextField();				//이름
		textField_1.setColumns(10);
		textField_1.setBounds(419, 244, 156, 27);
		panel.add(textField_1);
		
		passwordField = new JPasswordField();		//비번
		passwordField.setBounds(419, 189, 156, 27);
		panel.add(passwordField);
		
		textField = new JTextField();				//id
		textField.setBounds(419, 134, 156, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Arial Narrow", Font.BOLD, 26));
		lblPassword.setBounds(288, 179, 114, 40);
		panel.add(lblPassword);
		
		JLabel lblFullName = new JLabel("Full Name");
		lblFullName.setFont(new Font("Arial Narrow", Font.BOLD, 26));
		lblFullName.setBounds(288, 234, 114, 40);
		panel.add(lblFullName);
		
		JLabel lblBirth = new JLabel("Birth");
		lblBirth.setFont(new Font("Arial Narrow", Font.BOLD, 26));
		lblBirth.setBounds(288, 297, 114, 40);
		panel.add(lblBirth);
		
		JLabel lblName = new JLabel("Username");
		lblName.setFont(new Font("Arial Narrow", Font.BOLD, 26));
		lblName.setBounds(288, 124, 114, 40);
		panel.add(lblName);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String name = textField_1.getText();		//이름,psw,id 받아온다.
				String psw = passwordField.getText();
				String id = textField.getText();
				String birth = comboBox.getSelectedItem().toString() + "-" +
							   comboBox_2.getSelectedItem().toString() + "-" + 
							   comboBox_1.getSelectedItem().toString();
				
				CRUD_member a = new CRUD_member();
				boolean jm = a.JoinMember("meminfo", id, name, birth, psw);
				
				if(jm == true) {
					JOptionPane.showMessageDialog(panel, "회원가입이 완료되었습니다.", "Welcome!", JOptionPane.INFORMATION_MESSAGE);
					frmSignUp.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(panel, "이미 중복된 아이디입니다.", "Fail :(", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		
		JLabel label = new JLabel("");
		label.setToolTipText("");
		label.setBounds(-4, 5, 712, 500);
		label.setIcon(new ImageIcon(Select_ingredient.class.getResource("/images/Signup.PNG")));
		panel.add(label);
	}
}