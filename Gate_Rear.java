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

public class Gate_Rear {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Gate_Rear_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gate_Rear window = new Gate_Rear();
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
	public Gate_Rear() {
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
		
		JLabel lblNewLabel = new JLabel("\uCDA9\uBD81\uB300\uD559\uAD50 \uD6C4\uBB38 \uADFC\uCC98 \uC2DD\uB2F9 List");
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
			String[] values = new String[] {"   \u25C8\u25C8\u25C8\u25C8\u25C8\uD55C\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t25\uC2DC\uD574\uC7A5\uAD6D", "\t\t\uC774\uBAA8\uB124\uAE40\uBC25", "\t\t\uAE40\uBC25\uB098\uB77C ", "   \u25C8\u25C8\u25C8\u25C8\u25C8\uACE0\uAE30\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uAD6C\uC6CC\uBA39\uB294\uB2ED\uAC08\uBE44", "\t\uD48D\uB144\uAC08\uB9E4\uAE30\uB791\uBAA9\uC0B4\uC18C\uAE08\uAD6C\uC774", "\t\t\uAF2C\uAF2C&\uAFC0\uAFC0", "\t\t\uCD08\uC815\uD55C\uC6B0", "   \u25C8\u25C8\u25C8\u25C8\u25C8\uC77C\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uAE40\uC6B0\uB3D9", "\t\t\uAD6D\uC218\uB098\uBB34", "\t\t\uBA74\uC138\uC0C1", "   \u25C8\u25C8\u25C8\u25C8\u25C8\uC591\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\tSazio"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list_1);
		label_1.setIcon(new ImageIcon(Gate_Rear.class.getResource("/images/back.gif")));
		label_1.setFont(new Font("210 ∏«πﬂ¿«√ª√· R", Font.PLAIN, 18));
		label_1.setBackground(Color.LIGHT_GRAY);
		label_1.setBounds(17, 15, 78, 27);
		frame.getContentPane().add(label_1);
		
		JLabel lblDdd = new JLabel("");
		lblDdd.setBackground(new Color(204, 255, 204));
		lblDdd.setBounds(0, 0, 710, 489);
		lblDdd.setIcon(new ImageIcon(Nearby_restaurants.class.getResource("/images/∏¿¡˝.jpg")));
		frame.getContentPane().add(lblDdd);
	}
}
