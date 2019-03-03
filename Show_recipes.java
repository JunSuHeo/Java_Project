package Cook_recipe;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class Show_recipes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Show_recipes_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Show_recipes window = new Show_recipes();
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
	public Show_recipes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CRUD_food food = new CRUD_food();
		List<String> food_name = food.ReadFood("food");
		String[] food_arr = new String[food_name.size() + 1];
		food_arr[0] = "선택";
		
		for(int i = 1; i < food_arr.length; i++)
		{
			food_arr[i] = food_name.get(i - 1);
		}
		
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 545);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JButton btnNewButton = new JButton("보기");
		btnNewButton.setBounds(260, 350, 125, 29);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setMaximumRowCount(5);
		comboBox.setModel(new DefaultComboBoxModel(food_arr));
		comboBox.setBounds(176, 109, 322, 27);
		frame.getContentPane().add(comboBox);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Diary_delete.class.getResource("/images/background.jpg")));
		label.setBounds(0, 0, 703, 489);
		frame.getContentPane().add(label);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String food_name = comboBox.getSelectedItem().toString();
				
				Cook_recipe.Show_food.Show_food_screen(food_name);
			}
		});
		
	}
	
	

}