package Cook_recipe;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Show_food {
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Show_food_screen(String food_name) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Show_food window = new Show_food(food_name);
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
	public Show_food(String food_name) {
		initialize(food_name);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String food_name) {
		frame = new JFrame();
		frame.setBounds(100, 100, 680, 780);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 650, 750);
		frame.getContentPane().add(panel);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Select_ingredient.class.getResource("/images/food/" + food_name + ".PNG")));
		panel.add(label);
	}
}
