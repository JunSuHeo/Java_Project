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

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Login {

	private JFrame frmLogin;
	private JTextField textField;
	private JPasswordField passwordField;
	JPanel panel = new JPanel();
	/**
	 * Launch the application.
	 */
	public static void Login_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmLogin.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
				);
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frmLogin = new JFrame();
		frmLogin.setTitle("Login");
		frmLogin.setBounds(100, 100, 725, 545);
		frmLogin.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frmLogin.getContentPane().setLayout(null);
		frmLogin.setLocationRelativeTo(null);
		
		panel.setBounds(0, 0, 703, 489);
		frmLogin.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Sign up");	//회원가입부분
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Sign_up.Sign_up_screen();
			}
		});
		
		JLabel label_1 = new JLabel("Back");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cook_recipe.Main.main(null);
			}
		});
		label_1.setIcon(new ImageIcon(Login.class.getResource("/images/back.gif")));
		label_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(56, 41, 78, 27);
		panel.add(label_1);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 13));
		btnNewButton_1.setBounds(369, 406, 93, 29);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("\uACC4\uC815\uC774 \uC5C6\uC73C\uC2E0\uAC00\uC694?");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		lblNewLabel.setBounds(191, 409, 170, 21);
		panel.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Login");
		
		btnNewButton.setFont(new Font("210 맨발의청춘 R", Font.BOLD, 18));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(441, 291, 125, 55);
		panel.add(btnNewButton);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(256, 332, 156, 27);
		panel.add(passwordField);
		
		textField = new JTextField();
		textField.setForeground(Color.BLACK);
		textField.setBounds(256, 278, 156, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblPassWord = new JLabel("Password");
		lblPassWord.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 22));
		lblPassWord.setBounds(112, 330, 127, 37);
		panel.add(lblPassWord);
		
		JLabel lblUserName = new JLabel("Username");
		lblUserName.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 22));
		lblUserName.setBounds(112, 276, 127, 37);
		panel.add(lblUserName);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String id = textField.getText();
				String psw = passwordField.getText();
				
				CRUD_member a = new CRUD_member();
				boolean cmp = a.LogIn("meminfo", id, psw);
				
				if(cmp) {
					a.UpdateLog("meminfo", id);
					System.out.println("complete");
					frmLogin.setVisible(false);
					Main b = new Main();
					b.Close_First_screen();
					Cook_recipe.First_menu.First_menu_screen(id);
				}
				else
					JOptionPane.showMessageDialog(panel, "일치하는 id,password가 없습니다.", "Fail :(", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		
		JLabel label = new JLabel("");
		label.setBounds(-4, 5, 712, 500);
		label.setIcon(new ImageIcon(Select_ingredient.class.getResource("/images/Login_.PNG")));
		panel.add(label);
	}
}