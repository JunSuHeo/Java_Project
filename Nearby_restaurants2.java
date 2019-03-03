package Cook_recipe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import java.awt.Canvas;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Nearby_restaurants2 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Nearby_restaurants2_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nearby_restaurants2 window = new Nearby_restaurants2();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Nearby_restaurants2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 545);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("Back");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Cook_recipe.Nearby_restaurants.Nearby_restaurants_screen();
				
			}
		});
		
		JButton button = new JButton("\uD6C4\uBB38");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Cook_recipe.Gate_Rear.Gate_Rear_screen();
			}
		});
		button.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 21));
		button.setBackground(Color.PINK);
		button.setBounds(358, 259, 165, 80);
		frame.getContentPane().add(button);
		label_1.setIcon(new ImageIcon(Nearby_restaurants2.class.getResource("/images/back.gif")));
		label_1.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 18));
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(17, 15, 78, 27);
		frame.getContentPane().add(label_1);
		
		JButton btnBar = new JButton("\uC11C\uBB38");
		btnBar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Cook_recipe.Gate_West.Gate_West_screen();
			}
		});
		btnBar.setBackground(Color.PINK);
		btnBar.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 21));
		btnBar.setBounds(176, 259, 165, 80);
		frame.getContentPane().add(btnBar);
		
		JButton btnNewButton_1 = new JButton("\uC911\uBB38");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				Cook_recipe.Gate_Middle.Gate_Middle_screen();
			}
		});
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 21));
		btnNewButton_1.setBounds(358, 145, 165, 80);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\uC815\uBB38");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.setVisible(false);
				Cook_recipe.Gate_Front.Gate_Front_screen();
			}
		});
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 21));
		btnNewButton.setBounds(176, 145, 165, 80);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 710, 489);
		label.setIcon(new ImageIcon(Nearby_restaurants.class.getResource("/images/∏¿¡˝.jpg")));
		frame.getContentPane().add(label);
	}
}
