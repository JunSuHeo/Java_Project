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
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class Select_ingredient2 extends JFrame {

	private JPanel contentPane;
	static Select_ingredient2 frame;
	/**
	 * Launch the application.
	 */
	public static void Select_ingredient2_screen(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Select_ingredient2(id);
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
	public Select_ingredient2(String id) {
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
		
		
		
		JCheckBox oligo = new JCheckBox("\uC62C\uB9AC\uACE0\uB2F9");
		oligo.setBounds(171, 372, 105, 29);
		panel.add(oligo);
		
		JCheckBox curry_powder = new JCheckBox("\uCE74\uB808\uAC00\uB8E8");
		curry_powder.setBounds(399, 372, 105, 29);
		panel.add(curry_powder);
		
		JCheckBox starch_syrup = new JCheckBox("\uBB3C\uC5FF");
		starch_syrup.setBounds(57, 372, 105, 29);
		panel.add(starch_syrup);
		
		JCheckBox ketchup = new JCheckBox("\uCF00\uCCA9");
		ketchup.setBounds(285, 372, 105, 29);
		panel.add(ketchup);
		
		JCheckBox sugar = new JCheckBox("\uC124\uD0D5");
		sugar.setBounds(399, 300, 105, 29);
		panel.add(sugar);
		
		JCheckBox frying_powder = new JCheckBox("\uD280\uAE40\uAC00\uB8E8");
		frying_powder.setBounds(399, 336, 105, 29);
		panel.add(frying_powder);
		
		JCheckBox crushed_garlic = new JCheckBox("\uB2E4\uC9C4\uB9C8\uB298");
		crushed_garlic.setBounds(285, 300, 105, 29);
		panel.add(crushed_garlic);
		
		JCheckBox sesame_oil = new JCheckBox("\uCC38\uAE30\uB984");
		sesame_oil.setBounds(57, 336, 105, 29);
		panel.add(sesame_oil);
		
		JCheckBox ground = new JCheckBox("\uD6C4\uCD94");
		ground.setBounds(171, 300, 105, 29);
		panel.add(ground);
		
		JCheckBox vinegar = new JCheckBox("\uC2DD\uCD08");
		vinegar.setBounds(171, 336, 105, 29);
		panel.add(vinegar);
		
		JCheckBox pancake_powder = new JCheckBox("\uBD80\uCE68\uAC00\uB8E8");
		pancake_powder.setBounds(285, 336, 105, 29);
		panel.add(pancake_powder);
		
		JCheckBox chill_sauce = new JCheckBox("\uACE0\uCD94\uC7A5");
		chill_sauce.setBounds(171, 264, 105, 29);
		panel.add(chill_sauce);
		
		JCheckBox chill_powder = new JCheckBox("\uACE0\uCDA7\uAC00\uB8E8");
		chill_powder.setBounds(285, 264, 105, 29);
		panel.add(chill_powder);
		
		JCheckBox salt = new JCheckBox("\uC18C\uAE08");
		salt.setBounds(57, 300, 105, 29);
		panel.add(salt);
		
		JCheckBox soy_sauce = new JCheckBox("\uAC04\uC7A5");
		soy_sauce.setBounds(399, 264, 105, 29);
		panel.add(soy_sauce);
		
		JCheckBox soybean_paste = new JCheckBox("\uB41C\uC7A5");
		soybean_paste.setBounds(57, 264, 105, 29);
		panel.add(soybean_paste);
		
		JCheckBox laver = new JCheckBox("\uAE40");
		laver.setBounds(399, 181, 105, 29);
		panel.add(laver);
		
		JCheckBox seaweed = new JCheckBox("\uBBF8\uC5ED");
		seaweed.setBounds(285, 181, 105, 29);
		panel.add(seaweed);
		
		JCheckBox mackerel = new JCheckBox("\uACE0\uB4F1\uC5B4");
		mackerel.setBounds(171, 181, 105, 29);
		panel.add(mackerel);
		
		JCheckBox squid = new JCheckBox("\uC624\uC9D5\uC5B4");
		squid.setBounds(57, 181, 105, 29);
		panel.add(squid);
		
		mem_ingredient = sql_member.GetIngredient("meminfo", id, "ingredient_2");
		System.out.println(mem_ingredient);

		String[] arr = mem_ingredient.split(",");
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				if (arr[i].equals("��¡��")) squid.setSelected(true);
				if (arr[i].equals("����")) mackerel.setSelected(true);
				if (arr[i].equals("�̿�")) seaweed.setSelected(true);
				if (arr[i].equals("��")) laver.setSelected(true);
				if (arr[i].equals("����")) soybean_paste.setSelected(true);
				if (arr[i].equals("����")) soy_sauce.setSelected(true);
				if (arr[i].equals("�ұ�")) salt.setSelected(true);
				if (arr[i].equals("���尡��")) chill_powder.setSelected(true);
				if (arr[i].equals("��ħ����")) pancake_powder.setSelected(true);
				if (arr[i].equals("����")) vinegar.setSelected(true);
				if (arr[i].equals("����")) ground.setSelected(true);
				if (arr[i].equals("���⸧")) sesame_oil.setSelected(true);
				if (arr[i].equals("��������")) crushed_garlic.setSelected(true);
				if (arr[i].equals("Ƣ�谡��")) frying_powder.setSelected(true);
				if (arr[i].equals("����")) sugar.setSelected(true);
				if (arr[i].equals("����")) ketchup.setSelected(true);
				if (arr[i].equals("����")) starch_syrup.setSelected(true);
				if (arr[i].equals("ī������")) curry_powder.setSelected(true);
				if (arr[i].equals("�ø����")) oligo.setSelected(true);
				if (arr[i].equals("������")) chill_sauce.setSelected(true);
				
			}
		}
		
		JButton button = new JButton("\uC120\uD0DD\uC644\uB8CC");
		button.setBackground(Color.ORANGE);
		button.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 23));
		button.setBounds(534, 224, 125, 161);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingredient = "";
				if(chill_sauce.isSelected()) ingredient = ingredient + "������,";
				if(oligo.isSelected()) ingredient = ingredient + "�ø����,";
				if(curry_powder.isSelected()) ingredient = ingredient + "ī������,";
				if(starch_syrup.isSelected()) ingredient = ingredient + "����,";
				if(ketchup.isSelected()) ingredient = ingredient + "����,";
				if(sugar.isSelected()) ingredient = ingredient + "����,";
				if(frying_powder.isSelected()) ingredient = ingredient + "Ƣ�谡��,";
				if(crushed_garlic.isSelected()) ingredient = ingredient + "��������";
				if(sesame_oil.isSelected()) ingredient = ingredient + "���⸧,";
				if(ground.isSelected()) ingredient = ingredient + "����,";
				if(vinegar.isSelected()) ingredient = ingredient + "����,";
				if(pancake_powder.isSelected()) ingredient = ingredient + "��ħ����,";
				if(chill_powder.isSelected()) ingredient = ingredient + "���尡��,";
				if(salt.isSelected()) ingredient = ingredient + "�ұ�,";
				if(soy_sauce.isSelected()) ingredient = ingredient + "����,";
				if(soybean_paste.isSelected()) ingredient = ingredient + "����,";
				if(laver.isSelected()) ingredient = ingredient + "��,";
				if(seaweed.isSelected()) ingredient = ingredient + "�̿�,";
				if(mackerel.isSelected()) ingredient = ingredient + "����,";
				if(squid.isSelected()) ingredient = ingredient + "��¡��,";
				
				
				sql_food.UpdateFood("meminfo", id, ingredient, "ingredient_2");
				frame.setVisible(false);
				Cook_recipe.Select_ingredient3.Select_ingredient3_screen(id);
			}
		});
		
		JLabel label_3 = new JLabel("\uC591\uB150\uB958");
		label_3.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 21));
		label_3.setBounds(67, 224, 78, 29);
		panel.add(label_3);
		
		JLabel lblNewLabel_2 = new JLabel("\uD574\uC0B0\uBB3C");
		lblNewLabel_2.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 21));
		lblNewLabel_2.setBounds(67, 144, 78, 29);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel(" \uC7AC\uB8CC\uB97C \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		lblNewLabel_1.setIcon(new ImageIcon(Select_ingredient.class.getResource("/images/icon-1970474_1280 (2).png")));
		lblNewLabel_1.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(192, 88, 291, 44);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("������� ����");
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
		label.setFont(new Font("1�Ƹ��뿬�� R", Font.PLAIN, 18));
		label.setBounds(218, 235, 261, 33);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		label_1.setFont(new Font("210 �ǹ���û�� R", Font.PLAIN, 48));
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
		
//		Musicplaying introMusic = new Musicplaying("INTRO.mp3");
//		introMusic.play();
	}


}