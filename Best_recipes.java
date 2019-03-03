package Cook_recipe;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.JToolBar;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

public class Best_recipes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Best_recipes_screen(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Best_recipes window = new Best_recipes(id);
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
	public Best_recipes(String id) {
		initialize(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String id) {
		CRUD_member sql_member = new CRUD_member();
		CRUD_food sql_food = new CRUD_food();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 545);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		String mem_ingredient = sql_member.GetIngredient("meminfo", id, "ingredient_1") + 
								sql_member.GetIngredient("meminfo", id, "ingredient_2") +
								sql_member.GetIngredient("meminfo", id, "ingredient_3");
		
		List<String> food_name = sql_food.ReadFood("food");
		String[] food_arr = new String[food_name.size()];	//모든 음식이름
		int[] score = new int[food_name.size()];
		for(int i = 0; i < food_arr.length; i++)	//모든 음식을 읽어온다.
		{
			food_arr[i] = food_name.get(i);
		}
		
		for(int i = 0; i < food_arr.length; i++) {	//음식의 갯수만큼 재료 들고온다.
			String food_ingredient = sql_food.Readingredient("food", food_arr[i]);
			score[i] = CountIngredient(food_ingredient, mem_ingredient);
		}
		
		int fir,sec,thir;
		fir = 0;
		sec = 0;
		thir = 0;
		
		for(int i = 1; i < food_arr.length; i++)
		{
			
			if(score[i] > score[fir]) fir = i;
			else continue;
		}
		
		for(int i = 1; i < food_arr.length; i++)
		{
			
			if(score[i] > score[sec] && fir != i) sec = i;
			else continue;
		}
		
		for(int i = 1; i < food_arr.length; i++)
		{
			
			if(score[i] > score[thir] && sec != i && fir != i) thir = i;
			else continue;
		}
		final int first = fir;
		final int second = sec;
		final int third = thir;
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 224));
		panel.setBounds(242, 98, 269, 47);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel_2 = new JLabel("\u2605\uBCA0\uC2A4\uD2B8 \uCD94\uCC9C\uC694\uB9AC\u2605");
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.RED);
		lblNewLabel_2.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 29));
		
		JButton third_button = new JButton("\uBCF4\uB7EC\uAC00\uAE30");
		third_button.setBounds(290, 402, 125, 29);
		frame.getContentPane().add(third_button);
		
		JLabel lblNewLabel_1 = new JLabel("\uCD94\uCC9C\uC694\uB9AC3 : " + food_arr[third]);
		lblNewLabel_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 23));
		lblNewLabel_1.setBounds(207, 354, 304, 33);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton second_button = new JButton("\uBCF4\uB7EC\uAC00\uAE30");
		second_button.setBounds(290, 307, 125, 29);
		frame.getContentPane().add(second_button);
		
		JLabel lblNewLabel = new JLabel("\uCD94\uCC9C\uC694\uB9AC2 : " + food_arr[second]);
		lblNewLabel.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 23));
		lblNewLabel.setBounds(207, 255, 317, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton first_button = new JButton("\uBCF4\uB7EC\uAC00\uAE30");
		first_button.setBounds(290, 211, 125, 29);
		frame.getContentPane().add(first_button);
		
		JLabel lblNull = new JLabel("\uCD94\uCC9C\uC694\uB9AC1 : " + food_arr[first]);
		lblNull.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 23));
		lblNull.setBounds(207, 160, 317, 36);
		frame.getContentPane().add(lblNull);
		
		/*System.out.println(food_arr[fir]);
		System.out.println(food_arr[sec]);
		System.out.println(food_arr[thir]);*/
		first_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cook_recipe.Show_food.Show_food_screen(food_arr[first]);
			}
		});
		second_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cook_recipe.Show_food.Show_food_screen(food_arr[second]);
			}
		});
		third_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Cook_recipe.Show_food.Show_food_screen(food_arr[third]);
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Diary_delete.class.getResource("/images/diary_712x500.jpg")));
		label.setBounds(0, 0, 703, 489);
		frame.getContentPane().add(label);
	}
	
	public int CountIngredient(String food_ingredient, String mem_ingredient)
	{
		String[] food_arr = food_ingredient.split(",");
		String[] mem_arr = mem_ingredient.split(",");
		int count = 0;
		
		for(int i = 0; i < food_arr.length; i++)	//일치하는게 몇개인지 count
		{
			for(int j = 0; j < mem_arr.length; j++)
			{
				if(food_arr[i].equals(mem_arr[j])) {
					count++;
					break;
				}
			}
		}
		//총 재료 52개
		int score = (52 - food_arr.length) + count;
		
		return score;
	}
}
