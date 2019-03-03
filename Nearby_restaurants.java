package Cook_recipe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Nearby_restaurants {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Nearby_restaurants_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Nearby_restaurants window = new Nearby_restaurants();
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
	public Nearby_restaurants() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 545);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("Search");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Nearby_restaurants2.Nearby_restaurants2_screen();
				frame.setVisible(false);
			}
		});
		
		JLabel label_1 = new JLabel("Back");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				//Cook_recipe.First_menu.First_menu_screen();
			}
		});
		label_1.setIcon(new ImageIcon(Nearby_restaurants.class.getResource("/images/back.gif")));
		label_1.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 18));
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(17, 15, 78, 27);
		frame.getContentPane().add(label_1);
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(85, 107, 47));
		btnNewButton.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.BOLD, 24));
		btnNewButton.setBounds(289, 179, 139, 44);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("\uCDA9\uBD81\uB300\uD559\uAD50 \uADFC\uCC98 \uB9DB\uC9D1 ");
		lblNewLabel.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 40));
		lblNewLabel.setBounds(184, 111, 357, 71);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Nearby_restaurants.class.getResource("/images/∏¿¡˝.jpg")));
		label.setBounds(0, 0, 703, 489);
		frame.getContentPane().add(label);
	}
}
