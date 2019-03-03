package Cook_recipe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JSeparator;
import javax.swing.JSplitPane;
import java.awt.Canvas;
import java.awt.Button;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JScrollPane;
import javax.swing.border.MatteBorder;
import javax.swing.ListSelectionModel;

public class Gate_Front {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Gate_Front_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gate_Front window = new Gate_Front();
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
	public Gate_Front() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 725, 545);
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		JLabel label_1 = new JLabel("Back");
		label_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Cook_recipe.Nearby_restaurants2.Nearby_restaurants2_screen();
				
			}
		});
		
		JLabel lblNewLabel = new JLabel("\uCDA9\uBD81\uB300\uD559\uAD50 \uC815\uBB38 \uADFC\uCC98 \uC2DD\uB2F9 List");
		lblNewLabel.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 25));
		lblNewLabel.setBounds(185, 57, 338, 45);
		frame.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(168, 107, 368, 336);
		frame.getContentPane().add(scrollPane);
		
		
		
		

		
		
		JList list_1 = new JList();
		DefaultListCellRenderer renderer =  (DefaultListCellRenderer)list_1.getCellRenderer();  
		renderer.setHorizontalAlignment(JLabel.CENTER);
		list_1.setValueIsAdjusting(true);
		list_1.setBorder(null);
		list_1.setBackground(new Color(204, 255, 204));
		list_1.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 20));
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] {"\t\u25C8\u25C8\u25C8\u25C8\u25C8\uD55C\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uB9DB\uC88B\uC740\uC9D1", "\t\t\uD669\uAE08\uB0C4\uBE44", "\t\t\uC6F0\uBE59\uD558\uC6B0\uC2A4", "\t\t\uC9F1\uB3C8\uAE4C\uC2A4", "\t\t\uD765\uBD80\uB124\uC655\uB3C8\uAE4C\uC2A4", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uACE0\uAE30\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uD1A0\uC2DC\uB798", "\t\t\uC77C\uBBF8\uB2ED\uAC08\uBE44", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uBD84\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uC2E0\uC804\uB5A1\uBCF6\uC774", "\t\t\uC2E0\uD638\uD0D5\uB5A1\uBCF6\uC774", "\t\t\uAE40\uBC25\uB9C8\uD2B8\t", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uC77C\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uC0BC\uCD0C\uC2DD\uB2F9"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list_1);
		label_1.setIcon(new ImageIcon(Gate_Front.class.getResource("/images/back.gif")));
		label_1.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 18));
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(17, 15, 78, 27);
		frame.getContentPane().add(label_1);
		
		JLabel label = new JLabel("");
		label.setBackground(new Color(204, 255, 204));
		label.setBounds(0, 0, 710, 489);
		label.setIcon(new ImageIcon(Nearby_restaurants.class.getResource("/images/∏¿¡˝.jpg")));
		frame.getContentPane().add(label);
	}
}
