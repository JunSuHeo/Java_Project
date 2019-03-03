package Cook_recipe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import javax.swing.JButton;

public class Main extends JFrame {

	private JPanel contentPane;
	public static Main frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			} 
		});
	}
	
	public void Close_First_screen()
	{
		frame.setVisible(false);
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setTitle("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 725, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 713, 500);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnL = new JButton("Login");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Login.Login_screen();
			}
		});
		btnL.setBackground(Color.DARK_GRAY);
		btnL.setFont(new Font("210 맨발의청춘 R", Font.BOLD, 19));
		btnL.setForeground(Color.WHITE);
		btnL.setBounds(216, 268, 276, 41);
		panel.add(btnL);
		
		JLabel lblProgrammedBy = new JLabel("\u25B6\u25B6\uB85C\uADF8\uC778\uC744 \uD558\uC2DC\uBA74 \uC774\uC6A9\uC774 \uAC00\uB2A5\uD569\uB2C8\uB2E4\u25C0\u25C0");
		lblProgrammedBy.setForeground(Color.RED);
		lblProgrammedBy.setFont(new Font("고도 M", Font.PLAIN, 17));
		lblProgrammedBy.setBounds(199, 233, 334, 33);
		panel.add(lblProgrammedBy);
		
		JLabel lblNewLabel_1 = new JLabel("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		lblNewLabel_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 48));
		lblNewLabel_1.setBounds(216, 177, 276, 60);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("자취생의 권익");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("210 맨발의청춘 R", Font.BOLD, 19));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 794, 500);
		lblNewLabel.setIcon(new ImageIcon(Main.class.getResource("/images/180515_egg01.jpg")));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(0, 0, 713, 500);
		contentPane.add(panel_1);
		
		JLabel label = new JLabel("Programmed by \uD5C8\uC900\uC218,\uC774\uC644\uC11D,\uAE40\uC544\uB78C");
		label.setFont(new Font("1훈막대연필 R", Font.PLAIN, 18));
		label.setBounds(218, 235, 261, 33);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		label_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 48));
		label_1.setBounds(208, 187, 276, 60);
		panel_1.add(label_1);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.WHITE);
		menuBar.setBounds(0, 0, 380, 35);
		panel_1.add(menuBar);
		
		JLabel label_2 = new JLabel("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(0, 0, 794, 500);
		panel_1.add(label_2);
	}
}