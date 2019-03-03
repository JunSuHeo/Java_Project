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

public class Select_ingredient3 extends JFrame {

	private JPanel contentPane;
	static Select_ingredient3 frame;
	/**
	 * Launch the application.
	 */
	public static void Select_ingredient3_screen(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new Select_ingredient3(id);
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
	public Select_ingredient3(String id) {
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
		
		JCheckBox dumpling = new JCheckBox("\uB9CC\uB450");
		dumpling.setBounds(400, 260, 105, 29);
		panel.add(dumpling);
		
		JCheckBox toast = new JCheckBox("\uC2DD\uBE75");
		toast.setBounds(400, 296, 105, 29);
		panel.add(toast);
		
		JCheckBox ramyun = new JCheckBox("\uB77C\uBA74");
		ramyun.setBounds(286, 260, 105, 29);
		panel.add(ramyun);
		
		JCheckBox cheese = new JCheckBox("\uCE58\uC988");
		cheese.setBounds(58, 296, 105, 29);
		panel.add(cheese);
		
		JCheckBox tuna = new JCheckBox("\uCC38\uCE58\uCE94");
		tuna.setBounds(172, 260, 105, 29);
		panel.add(tuna);
		
		JCheckBox kimchi = new JCheckBox("\uAE40\uCE58");
		kimchi.setBounds(172, 296, 105, 29);
		panel.add(kimchi);
		
		JCheckBox spam = new JCheckBox("\uC2A4\uD338");
		spam.setBounds(286, 296, 105, 29);
		panel.add(spam);
		
		JCheckBox sausage = new JCheckBox("\uC18C\uC2DC\uC9C0");
		sausage.setBounds(172, 224, 105, 29);
		panel.add(sausage);
		
		JCheckBox tobu = new JCheckBox("\uB450\uBD80");
		tobu.setBounds(286, 224, 105, 29);
		panel.add(tobu);
		
		JCheckBox fishcake = new JCheckBox("\uC5B4\uBB35");
		fishcake.setBounds(58, 260, 105, 29);
		panel.add(fishcake);
		
		JCheckBox ricecake = new JCheckBox("\uB5A1");
		ricecake.setBounds(400, 224, 105, 29);
		panel.add(ricecake);
		
		JCheckBox egg = new JCheckBox("\uB2EC\uAC40");
		egg.setBounds(58, 224, 105, 29);
		panel.add(egg);
		
		mem_ingredient = sql_member.GetIngredient("meminfo", id, "ingredient_3");
		System.out.println(mem_ingredient);
		
		String[] arr = mem_ingredient.split(",");
		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
				if (arr[i].equals("°è¶õ")) egg.setSelected(true);
				if (arr[i].equals("¶±")) ricecake.setSelected(true);
				if (arr[i].equals("¾î¹¬")) fishcake.setSelected(true);
				if (arr[i].equals("µÎºÎ")) tobu.setSelected(true);
				if (arr[i].equals("¼Ò¼¼Áö")) sausage.setSelected(true);
				if (arr[i].equals("½ºÆÔ")) spam.setSelected(true);
				if (arr[i].equals("±èÄ¡")) kimchi.setSelected(true);
				if (arr[i].equals("ÂüÄ¡Äµ")) tuna.setSelected(true);
				if (arr[i].equals("Ä¡Áî")) cheese.setSelected(true);
				if (arr[i].equals("¶ó¸é")) ramyun.setSelected(true);
				if (arr[i].equals("½Ä»§")) toast.setSelected(true);
				if (arr[i].equals("¸¸µÎ")) dumpling.setSelected(true);
				
			}
		}
		
		
		JButton button = new JButton("\uC120\uD0DD\uC644\uB8CC");
		button.setBackground(Color.ORANGE);
		button.setFont(new Font("210 ¸Ç¹ßÀÇÃ»Ãá R", Font.PLAIN, 23));
		button.setBounds(534, 224, 125, 161);
		panel.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ingredient = "";
				if(dumpling.isSelected()) ingredient = ingredient + "¸¸µÎ,";
				if(toast.isSelected()) ingredient = ingredient + "½Ä»§,";
				if(ramyun.isSelected()) ingredient = ingredient + "¶ó¸é,";
				if(cheese.isSelected()) ingredient = ingredient + "Ä¡Áî,";
				if(tuna.isSelected()) ingredient = ingredient + "ÂüÄ¡Äµ,";
				if(kimchi.isSelected()) ingredient = ingredient + "±èÄ¡,";
				if(spam.isSelected()) ingredient = ingredient + "½ºÆÔ,";
				if(sausage.isSelected()) ingredient = ingredient + "¼Ò¼¼Áö,";
				if(tobu.isSelected()) ingredient = ingredient + "µÎºÎ,";
				if(fishcake.isSelected()) ingredient = ingredient + "¾î¹¬,";
				if(ricecake.isSelected()) ingredient = ingredient + "¶±,";
				if(egg.isSelected()) ingredient = ingredient + "°è¶õ,";
				
				sql_food.UpdateFood("meminfo", id, ingredient, "ingredient_3");
				frame.setVisible(false);
			}
		});
		
		JLabel label_3 = new JLabel("\uAE30\uD0C0\uC7AC\uB8CC");
		label_3.setFont(new Font("210 ¸Ç¹ßÀÇÃ»Ãá R", Font.PLAIN, 21));
		label_3.setBounds(58, 182, 78, 29);
		panel.add(label_3);
		
		JLabel lblNewLabel_1 = new JLabel(" \uC7AC\uB8CC\uB97C \uC120\uD0DD\uD574\uC8FC\uC138\uC694");
		lblNewLabel_1.setIcon(new ImageIcon(Select_ingredient.class.getResource("/images/icon-1970474_1280 (2).png")));
		lblNewLabel_1.setFont(new Font("210 ¸Ç¹ßÀÇÃ»Ãá R", Font.PLAIN, 28));
		lblNewLabel_1.setBounds(192, 88, 291, 44);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("ÀÚÃë»ýÀÇ ±ÇÀÍ");
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
		label.setFont(new Font("1ÈÆ¸·´ë¿¬ÇÊ R", Font.PLAIN, 18));
		label.setBounds(218, 235, 261, 33);
		panel_1.add(label);
		
		JLabel label_1 = new JLabel("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		label_1.setFont(new Font("210 ¸Ç¹ßÀÇÃ»Ãá R", Font.PLAIN, 48));
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