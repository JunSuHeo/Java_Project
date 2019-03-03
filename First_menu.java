package Cook_recipe;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;
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
import java.io.File;

import javax.swing.JSlider;

public class First_menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void First_menu_screen(String id) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					First_menu frame = new First_menu(id);
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
	public static File Audiofile=new File("./bin/music/Song.wav");
    public static void playSound(float vol, boolean repeat){
        try{
                final Clip clip = (Clip)AudioSystem.getLine(new Line.Info(Clip.class));
                clip.open(AudioSystem.getAudioInputStream(Audiofile));
                clip.addLineListener(new LineListener() {
                        @Override
                        public void update(LineEvent event) {
                                // TODO Auto-generated method stub
                                if(event.getType()==LineEvent.Type.STOP){
                                        //이 부분이 없으면 효과음이 메모리에 점점 쌓여서 언젠가 크래시된다
                                        clip.close();
                                }
                        }
                });
                FloatControl volume = (FloatControl)clip.getControl(FloatControl.Type.MASTER_GAIN);
                volume.setValue(vol);
                clip.start();
                if(repeat)
                        clip.loop(Clip.LOOP_CONTINUOUSLY);
        }catch(Exception e){
                e.printStackTrace();
        }
}
	
	public First_menu(String id) {
		playSound(6, true);
		setTitle("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		
		JLabel lblProgrammedBy = new JLabel("Programmed by \uD5C8\uC900\uC218,\uC774\uC644\uC11D,\uAE40\uC544\uB78C");
		lblProgrammedBy.setFont(new Font("고도 M", Font.PLAIN, 15));
		lblProgrammedBy.setBounds(218, 235, 261, 33);
		panel.add(lblProgrammedBy);
		
		JLabel lblNewLabel_1 = new JLabel("\uC790\uCDE8\uC0DD\uC758 \uAD8C\uC775");
		lblNewLabel_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 48));
		lblNewLabel_1.setBounds(208, 187, 276, 60);
		panel.add(lblNewLabel_1);
		
		JMenuBar menuBar_2 = new JMenuBar();
		menuBar_2.setBackground(new Color(255, 255, 255));
		menuBar_2.setBounds(0, 0, 800, 46);
		panel.add(menuBar_2);
		
		JMenu mnNewMenu_3 = new JMenu("Menu");
		mnNewMenu_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		mnNewMenu_3.setForeground(Color.BLACK);
		mnNewMenu_3.setFont(new Font("210 맨발의청춘 R", Font.BOLD, 20));
		mnNewMenu_3.setBackground(Color.GRAY);
		mnNewMenu_3.setIcon(new ImageIcon("C:\\Users\\\uAE40\uC544\uB78C\\Desktop\\\uC544\uC774\uCF58\\menu_.gif"));
		menuBar_2.add(mnNewMenu_3);
		
		JMenu menu = new JMenu("\uC790\uCDE8\uC694\uB9AC");
		menu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		menu.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 20));
		menu.setBackground(new Color(0, 0, 0));
		menu.setForeground(Color.RED);
		menuBar_2.add(menu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\uC7AC\uB8CC \uC120\uD0DD\uD558\uAE30");

		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cook_recipe.Select_ingredient.Select_ingredient_screen(id);
				
			}
		});
		mntmNewMenuItem.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		menu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\uB808\uC2DC\uD53C \uBCF4\uAE30");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Show_recipes.Show_recipes_screen();
			}
		});
		mntmNewMenuItem_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		menu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("\uBCA0\uC2A4\uD2B8 \uCD94\uCC9C\uC694\uB9AC ");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Best_recipes.Best_recipes_screen(id);
			}
		});
		mntmNewMenuItem_2.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		menu.add(mntmNewMenuItem_2);
		
		JMenu mnNewMenu = new JMenu("\uC694\uB9AC\uC77C\uAE30");
		mnNewMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Diary_read.Diary_read_screen(id);
			}
		});
		mnNewMenu.setForeground(new Color(255, 165, 0));
		mnNewMenu.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 20));
		menuBar_2.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_3 = new JMenuItem("\uC791\uC131\uD558\uAE30");
		mntmNewMenuItem_3.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		mntmNewMenuItem_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Diary_write.Diary_write_screen(id);
			}
		});
		mnNewMenu.add(mntmNewMenuItem_3);
		
		JMenuItem mntmNewMenuItem_5 = new JMenuItem("\uBD88\uB7EC\uC624\uAE30");
		mntmNewMenuItem_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Diary_read.Diary_read_screen(id);
			}
		});
		mntmNewMenuItem_5.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_5);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("\uC218\uC815\uD558\uAE30");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Diary_edit.Diary_edit_screen(id);
			}
		});
		mntmNewMenuItem_7.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("\uC0AD\uC81C\uD558\uAE30");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Diary_delete.Diary_delete_screen(id);
			}
		});
		mntmNewMenuItem_8.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		mnNewMenu.add(mntmNewMenuItem_8);
		
		JMenu mnNewMenu_1 = new JMenu("\uC9C0\uB3C4\uAC80\uC0C9");
		mnNewMenu_1.setForeground(new Color(0, 128, 0));
		mnNewMenu_1.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 20));
		menuBar_2.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("Google Map");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Show_map();
				//Show_map b = new Show_map();
				//b.Show_browser("GS편의점");
			}
		});
		mntmNewMenuItem_6.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		mnNewMenu_1.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_2 = new JMenu("\uADFC\uCC98\uB9DB\uC9D1");
		mnNewMenu_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		mnNewMenu_2.setForeground(new Color(0, 0, 255));
		mnNewMenu_2.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 20));
		menuBar_2.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_4 = new JMenuItem("\uBCF4\uB7EC\uAC00\uAE30");
		mntmNewMenuItem_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cook_recipe.Nearby_restaurants.Nearby_restaurants_screen();
			}
		});
		mntmNewMenuItem_4.setFont(new Font("210 맨발의청춘 R", Font.PLAIN, 18));
		mnNewMenu_2.add(mntmNewMenuItem_4);
		
		JLabel lblNewLabel = new JLabel("자취생의 권익");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setBounds(0, 0, 794, 500);
		lblNewLabel.setIcon(new ImageIcon(First_menu.class.getResource("/images/180515_egg01.jpg")));
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