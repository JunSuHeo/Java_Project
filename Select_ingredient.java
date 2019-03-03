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
import javax.swing.WindowConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JSlider;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Select_ingredient extends JFrame {

	private JPanel contentPane;
	static Select_ingredient frame;
	/**
	 * Launch the application.
	 */
	public static void Select_ingredient_screen(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Select_ingredient(id);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Select_ingredient(String id) {
		CRUD_member sql_member = new CRUD_member();
		CRUD_food sql_food = new CRUD_food();
		String mem_ingredient;

		setTitle("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
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

		JCheckBox lettuce = new JCheckBox("\uC0C1\uCD94");
		lettuce.setBounds(171, 372, 105, 29);
		panel.add(lettuce);

		JCheckBox cabbage = new JCheckBox("\uBC30\uCD94");
		cabbage.setBounds(399, 372, 105, 29);
		panel.add(cabbage);

		JCheckBox perilla_leaf = new JCheckBox("\uAE7B\uC78E");
		perilla_leaf.setBounds(57, 372, 105, 29);
		panel.add(perilla_leaf);

		JCheckBox radish = new JCheckBox("\uBB34");
		radish.setBounds(285, 372, 105, 29);
		panel.add(radish);

		JCheckBox red_pepper = new JCheckBox("\uACE0\uCD94");
		red_pepper.setBounds(399, 300, 105, 29);
		panel.add(red_pepper);

		JCheckBox chives = new JCheckBox("\uBD80\uCD94");
		chives.setBounds(399, 336, 105, 29);
		panel.add(chives);

		JCheckBox pepper = new JCheckBox("\uD53C\uB9DD");
		pepper.setBounds(285, 300, 105, 29);
		panel.add(pepper);

		JCheckBox leek = new JCheckBox("\uB300\uD30C");
		leek.setBounds(57, 336, 105, 29);
		panel.add(leek);

		JCheckBox garlic = new JCheckBox("\uB9C8\uB298");
		garlic.setBounds(171, 300, 105, 29);
		panel.add(garlic);

		JCheckBox mushroom = new JCheckBox("\uBC84\uC12F");
		mushroom.setBounds(171, 336, 105, 29);
		panel.add(mushroom);

		JCheckBox pumpkin = new JCheckBox("\uC560\uD638\uBC15");
		pumpkin.setBounds(285, 336, 105, 29);
		panel.add(pumpkin);

		JCheckBox onion = new JCheckBox("\uC591\uD30C");
		onion.setBounds(171, 264, 105, 29);
		panel.add(onion);

		JCheckBox potato = new JCheckBox("\uAC10\uC790");
		potato.setBounds(285, 264, 105, 29);
		panel.add(potato);

		JCheckBox bean_sprouts = new JCheckBox("\uCF69\uB098\uBB3C");
		bean_sprouts.setBounds(57, 300, 105, 29);
		panel.add(bean_sprouts);

		JCheckBox sweet_potato = new JCheckBox("\uACE0\uAD6C\uB9C8");
		sweet_potato.setBounds(399, 264, 105, 29);
		panel.add(sweet_potato);

		JCheckBox carrot = new JCheckBox("\uB2F9\uADFC");
		carrot.setBounds(57, 264, 105, 29);
		panel.add(carrot);

		JCheckBox duck = new JCheckBox("\uC624\uB9AC\uACE0\uAE30");
		duck.setBounds(399, 181, 105, 29);
		panel.add(duck);

		JCheckBox chicken = new JCheckBox("\uB2ED\uACE0\uAE30");
		chicken.setBounds(285, 181, 105, 29);
		panel.add(chicken);

		JCheckBox beef = new JCheckBox("\uC18C\uACE0\uAE30");
		beef.setBounds(171, 181, 105, 29);
		panel.add(beef);

		JCheckBox pork = new JCheckBox("\uB3FC\uC9C0\uACE0\uAE30");
		pork.setBounds(57, 181, 105, 29);
		panel.add(pork);

		mem_ingredient = sql_member.GetIngredient("meminfo", id, "ingredient_1");
		//System.out.println(mem_ingredient);

		String[] arr = mem_ingredient.split(",");
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				if (arr[i].equals("돼지고기")) pork.setSelected(true);
				if (arr[i].equals("소고기")) beef.setSelected(true);
				if (arr[i].equals("닭고기")) chicken.setSelected(true);
				if (arr[i].equals("오리고기")) duck.setSelected(true);
				if (arr[i].equals("당근")) carrot.setSelected(true);
				if (arr[i].equals("고구마")) sweet_potato.setSelected(true);
				if (arr[i].equals("콩나물")) bean_sprouts.setSelected(true);
				if (arr[i].equals("감자")) potato.setSelected(true);
				if (arr[i].equals("양파")) onion.setSelected(true);
				if (arr[i].equals("애호박")) pumpkin.setSelected(true);
				if (arr[i].equals("버섯")) mushroom.setSelected(true);
				if (arr[i].equals("마늘")) garlic.setSelected(true);
				if (arr[i].equals("대파")) leek.setSelected(true);
				if (arr[i].equals("피망")) pepper.setSelected(true);
				if (arr[i].equals("고추")) red_pepper.setSelected(true);
				if (arr[i].equals("무")) radish.setSelected(true);
				if (arr[i].equals("부추")) chives.setSelected(true);
				if (arr[i].equals("깻잎")) perilla_leaf.setSelected(true);
				if (arr[i].equals("배추")) cabbage.setSelected(true);
				if (arr[i].equals("상추")) lettuce.setSelected(true);
			}
		}

		JButton button = new JButton("\uC120\uD0DD\uC644\uB8CC");
		button.setBackground(Color.ORANGE);
		button.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 23));
		button.setBounds(534, 224, 125, 161);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingredient = "";
				if(pork.isSelected()) ingredient = ingredient + "돼지고기,";
				if(beef.isSelected()) ingredient = ingredient + "소고기,";
				if(chicken.isSelected()) ingredient = ingredient + "닭고기,";
				if(duck.isSelected()) ingredient = ingredient + "오리고기,";
				if(carrot.isSelected()) ingredient = ingredient + "당근,";
				if(sweet_potato.isSelected()) ingredient = ingredient + "고구마,";
				if(bean_sprouts.isSelected()) ingredient = ingredient + "콩나물,";
				if(potato.isSelected()) ingredient = ingredient + "감자,";
				if(onion.isSelected()) ingredient = ingredient + "양파,";
				if(pumpkin.isSelected()) ingredient = ingredient + "애호박,";
				if(mushroom.isSelected()) ingredient = ingredient + "버섯,";
				if(garlic.isSelected()) ingredient = ingredient + "마늘,";
				if(leek.isSelected()) ingredient = ingredient + "대파,";
				if(pepper.isSelected()) ingredient = ingredient + "피망,";
				if(red_pepper.isSelected()) ingredient = ingredient + "고추,";
				if(radish.isSelected()) ingredient = ingredient + "무,";
				if(chives.isSelected()) ingredient = ingredient + "부추,";
				if(perilla_leaf.isSelected()) ingredient = ingredient + "깻잎,";
				if(cabbage.isSelected()) ingredient = ingredient + "배추,";
				if(lettuce.isSelected()) ingredient = ingredient + "상추,";
				
				sql_food.UpdateFood("meminfo", id, ingredient, "ingredient_1");
				frame.setVisible(false);
				Cook_recipe.Select_ingredient2.Select_ingredient2_screen(id);
			}
		});

		JLabel label_3 = new JLabel("\uCC44\uC18C\uB958");
		label_3.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 21));
		label_3.setBounds(67, 224, 78, 29);
		panel.add(label_3);

		JLabel lblNewLabel_2 = new JLabel("\uACE0\uAE30\uB958");
		lblNewLabel_2.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(67, 144, 78, 29);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_1 = new JLabel(" \uC7AC\uB8CC\uB97C \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		lblNewLabel_1.setIcon(new ImageIcon(Select_ingredient.class.getResource("/images/icon-1970474_1280 (2).png")));
		lblNewLabel_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(192, 88, 291, 44);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel = new JLabel("자취생의 권익");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 794, 500);
		lblNewLabel.setIcon(new ImageIcon(First_menu.class.getResource("/images/background.jpg")));
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