package Cook_recipe;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JEditorPane;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.Action;

public class Diary_write {

	private JFrame frame;
	private JTextField text_food_name;
	private JTextField text_ingredient;
	private JTextField text_my_recipe;
	private JTextField text_memo;

	/**
	 * Launch the application.
	 */
	public static void Diary_write_screen(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diary_write window = new Diary_write(id);
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
	public Diary_write(String id) {
		initialize(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String id) {
		CRUD_diary sql = new CRUD_diary();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 545);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel label_2 = new JLabel("Back");
		label_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Cook_recipe.First_menu.First_menu_screen(id);
			}
		});
		label_2.setIcon(new ImageIcon(Diary_write.class.getResource("/images/back.gif")));
		label_2.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		label_2.setBackground(Color.LIGHT_GRAY);
		label_2.setBounds(110, 88, 78, 27);
		frame.getContentPane().add(label_2);
		
		JScrollPane Memo_scroll = new JScrollPane();
		Memo_scroll.setBounds(110, 426, 488, 36);
		frame.getContentPane().add(Memo_scroll);
		
		text_memo = new JTextField();
		Memo_scroll.setViewportView(text_memo);
		text_memo.setColumns(10);
		
		JScrollPane Cook_name_scroll = new JScrollPane();
		Cook_name_scroll.setBounds(110, 155, 488, 36);
		frame.getContentPane().add(Cook_name_scroll);
		
		text_food_name = new JTextField();
		Cook_name_scroll.setViewportView(text_food_name);
		text_food_name.setColumns(10);
		
		JLabel Cook_name = new JLabel("\uC694\uB9AC\uC774\uB984\uC740?");
		Cook_name.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
		Cook_name.setBounds(110, 130, 87, 21);
		frame.getContentPane().add(Cook_name);
		
		JScrollPane Cook_recipe_scroll_1 = new JScrollPane();
		Cook_recipe_scroll_1.setBounds(110, 306, 488, 80);
		frame.getContentPane().add(Cook_recipe_scroll_1);
		
		text_my_recipe = new JTextField();
		Cook_recipe_scroll_1.setViewportView(text_my_recipe);
		text_my_recipe.setColumns(10);
		
		JScrollPane Cook_ingredient_scroll = new JScrollPane();
		Cook_ingredient_scroll.setBounds(110, 229, 488, 36);
		frame.getContentPane().add(Cook_ingredient_scroll);
		
		text_ingredient = new JTextField();
		Cook_ingredient_scroll.setViewportView(text_ingredient);
		text_ingredient.setColumns(10);
		
		
		
		JLabel Memo = new JLabel("\uAE30\uD0C0 \uBA54\uBAA8 (\uB9DB\uD3C9\uAC00,\uAC1C\uC120\uD574\uC57C\uD560 \uC810 \uB4F1)");
		Memo.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
		Memo.setBounds(110, 401, 252, 21);
		frame.getContentPane().add(Memo);
		
		JLabel Recipe = new JLabel("\uB098\uB9CC\uC758 \uAC04\uB2E8\uB808\uC2DC\uD53C\uB294?");
		Recipe.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
		Recipe.setBounds(110, 280, 160, 21);
		frame.getContentPane().add(Recipe);
		
		JLabel ingredients = new JLabel("\uC5B4\uB5A4 \uC7AC\uB8CC\uB85C \uB9CC\uB4E4\uC5C8\uB098\uC694?");
		ingredients.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
		ingredients.setBounds(110, 203, 196, 21);
		frame.getContentPane().add(ingredients);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(448, 79, 98, 36);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String txt_food_name = text_food_name.getText();
				String txt_ingredient = text_ingredient.getText();
				String txt_my_recipe = text_my_recipe.getText();
				String txt_memo = text_memo.getText();
				
				sql.WriteDiary("diary", id, txt_food_name, txt_ingredient, txt_my_recipe, txt_memo);
				JOptionPane.showMessageDialog(frame, "저장이 완료되었습니다.", "Success :)", JOptionPane.INFORMATION_MESSAGE);
				frame.setVisible(false);
			}
		});
		
		JLabel label_1 = new JLabel("\uC624\uB298\uC758 \uC694\uB9AC\uC77C\uAE30");
		label_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 25));
		label_1.setBounds(258, 85, 173, 31);
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		label.setFont(new Font("210 맨발의청춘 R", Font.ITALIC, 18));
		label.setIcon(new ImageIcon(Diary_delete.class.getResource("/images/diary_712x500.jpg")));
		label.setBounds(0, 0, 703, 489);
		frame.getContentPane().add(label);
	}
}