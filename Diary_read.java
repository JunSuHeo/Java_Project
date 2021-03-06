package Cook_recipe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.WindowConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Diary_read {

	private JFrame frame;
	private JTextField textField;
	private JTextField text_food_name;
	private JTextField text_ingredient;
	private JTextField text_my_recipe;
	private JTextField text_memo;

	/**
	 * Launch the application.
	 */
	public static void Diary_read_screen(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diary_read window = new Diary_read(id);
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
	public Diary_read(String id) {
		initialize(id);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String id) {
		CRUD_diary sql = new CRUD_diary();
		List<String> time = sql.ReadTime("diary", id);
		List<String> food = sql.ReadFoodName("diary", id);
		String[] arr = new String[time.size() + 1];
		arr[0] = "����";
		
		for(int i = 0; i < time.size(); i++)	//��� ������ �о�´�.
		{
			arr[i + 1] = time.get(i) + "     " + food.get(i);
		}
		
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 545);
		frame.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JLabel label_1 = new JLabel("Back");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Cook_recipe.First_menu.First_menu_screen(id);
			}
		});
		
		JLabel label_5 = new JLabel("\uC5B4\uB5A4 \uC7AC\uB8CC\uB85C \uB9CC\uB4E4\uC5C8\uB098\uC694?");
		label_5.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 17));
		label_5.setBounds(108, 198, 196, 21);
		frame.getContentPane().add(label_5);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(108, 301, 488, 80);
		frame.getContentPane().add(scrollPane_2);
		
		text_my_recipe = new JTextField();
		scrollPane_2.setViewportView(text_my_recipe);
		text_my_recipe.setColumns(10);
		
		JLabel label_4 = new JLabel("\uB098\uB9CC\uC758 \uAC04\uB2E8\uB808\uC2DC\uD53C\uB294?");
		label_4.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 17));
		label_4.setBounds(108, 275, 160, 21);
		frame.getContentPane().add(label_4);
		
		JLabel label_2 = new JLabel("\uC694\uB9AC\uC774\uB984\uC740?");
		label_2.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 17));
		label_2.setBounds(108, 125, 87, 21);
		frame.getContentPane().add(label_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(108, 150, 488, 36);
		frame.getContentPane().add(scrollPane_1);
		
		text_food_name = new JTextField();
		scrollPane_1.setViewportView(text_food_name);
		text_food_name.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(108, 421, 488, 36);
		frame.getContentPane().add(scrollPane);
		
		text_memo = new JTextField();
		scrollPane.setViewportView(text_memo);
		text_memo.setColumns(10);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(108, 224, 488, 36);
		frame.getContentPane().add(scrollPane_3);
		
		text_ingredient = new JTextField();
		scrollPane_3.setViewportView(text_ingredient);
		text_ingredient.setColumns(10);
		
		JLabel label_3 = new JLabel("\uAE30\uD0C0 \uBA54\uBAA8 (\uB9DB\uD3C9\uAC00,\uAC1C\uC120\uD574\uC57C\uD560 \uC810 \uB4F1)");
		label_3.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 17));
		label_3.setBounds(108, 396, 252, 21);
		frame.getContentPane().add(label_3);
		
		JButton btnNewButton = new JButton("Import");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 13));
		btnNewButton.setBounds(494, 75, 87, 29);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(arr));
		comboBox.setMaximumRowCount(5);
		comboBox.setFont(new Font("��������", Font.PLAIN, 17));
		comboBox.setBounds(203, 75, 285, 29);
		frame.getContentPane().add(comboBox);
		label_1.setIcon(new ImageIcon(Diary_read.class.getResource("/images/back.gif")));
		label_1.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 18));
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(108, 89, 78, 27);
		frame.getContentPane().add(label_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			String select = "����";
			public void actionPerformed(ActionEvent e) {
				try {
				select = comboBox.getSelectedItem().toString().substring(0, 19);
				String food_name = sql.ReadDiary("diary", id, select, "food_name");
				String ingredient = sql.ReadDiary("diary", id, select, "ingredient");
				String my_recipe = sql.ReadDiary("diary", id, select, "my_recipe");
				String memo = sql.ReadDiary("diary", id, select, "memo");
				
				text_food_name.setText(food_name);
				text_ingredient.setText(ingredient);
				text_my_recipe.setText(my_recipe);
				text_memo.setText(memo);
				}catch(StringIndexOutOfBoundsException ie) {
					
				}
			}
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Diary_delete.class.getResource("/images/diary_712x500.jpg")));
		label.setBounds(0, 0, 703, 489);
		frame.getContentPane().add(label);
	}
}