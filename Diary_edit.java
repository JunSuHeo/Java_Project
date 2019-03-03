package Cook_recipe;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

public class Diary_edit {

	private JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTextField text_food_name;
	private JTextField text_ingredient;
	private JTextField text_my_recipe;
	private JTextField text_memo;

	/**
	 * Launch the application.
	 */
	public static void Diary_edit_screen(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diary_edit window = new Diary_edit(id);
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
	public Diary_edit(String id) {
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
		arr[0] = "선택";
		
		for(int i = 0; i < time.size(); i++)	//모든 음식을 읽어온다.
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
		
		JButton finish_button = new JButton("\uC218\uC815\uC644\uB8CC\u221A");
		finish_button.setBackground(Color.ORANGE);
		finish_button.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		finish_button.setBounds(457, 106, 125, 36);
		frame.getContentPane().add(finish_button);
		
		JLabel label_5 = new JLabel("\uC5B4\uB5A4 \uC7AC\uB8CC\uB85C \uB9CC\uB4E4\uC5C8\uB098\uC694?");
		label_5.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
		label_5.setBounds(108, 198, 196, 21);
		frame.getContentPane().add(label_5);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(108, 301, 488, 80);
		frame.getContentPane().add(scrollPane_2);
		
		text_my_recipe = new JTextField();
		scrollPane_2.setViewportView(text_my_recipe);
		text_my_recipe.setColumns(10);
		
		JLabel label_4 = new JLabel("\uB098\uB9CC\uC758 \uAC04\uB2E8\uB808\uC2DC\uD53C\uB294?");
		label_4.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
		label_4.setBounds(108, 275, 160, 21);
		frame.getContentPane().add(label_4);
		
		JLabel label_2 = new JLabel("\uC694\uB9AC\uC774\uB984\uC740?");
		label_2.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
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
		label_3.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 17));
		label_3.setBounds(108, 396, 252, 21);
		frame.getContentPane().add(label_3);
		
		JButton import_button = new JButton("Import");
		import_button.setForeground(Color.WHITE);
		import_button.setBackground(Color.DARK_GRAY);
		import_button.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 13));
		import_button.setBounds(495, 73, 87, 29);
		frame.getContentPane().add(import_button);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(arr));
		comboBox.setMaximumRowCount(5);
		comboBox.setFont(new Font("나눔고딕", Font.PLAIN, 17));
		comboBox.setBounds(203, 73, 286, 27);
		frame.getContentPane().add(comboBox);
		label_1.setIcon(new ImageIcon(Diary_edit.class.getResource("/images/back.gif")));
		label_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(108, 89, 78, 27);
		frame.getContentPane().add(label_1);
		
		DefaultTableModel modelo = new DefaultTableModel();
		
		
		
		import_button.addActionListener(new ActionListener() {
			String select = "선택";
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
		
		finish_button.addActionListener(new ActionListener() {
			String select = "선택";
			public void actionPerformed(ActionEvent e) {
				try {
					select = comboBox.getSelectedItem().toString().substring(0, 19);
					String txt_food_name = text_food_name.getText();
					String txt_ingredient = text_ingredient.getText();
					String txt_my_recipe = text_my_recipe.getText();
					String txt_memo = text_memo.getText();
					Date d = new Date();
					SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				    String datetime = form.format(d).toString();
					
					if (!select.equals("선택")) {
						
			               sql.UpdateDiary("diary", id, select, txt_food_name, "food_name");
			               sql.UpdateDiary("diary", id, select, txt_ingredient, "ingredient");
			               sql.UpdateDiary("diary", id, select, txt_my_recipe, "my_recipe");
			               sql.UpdateDiary("diary", id, select, txt_memo, "memo");
			               sql.UpdateDiary("diary", id, select, datetime, "last_time");
			               frame.setVisible(false);
			            }
			            else
			               JOptionPane.showMessageDialog(frame, "시간을 선택해주세요", "Fail :(", JOptionPane.INFORMATION_MESSAGE);
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
