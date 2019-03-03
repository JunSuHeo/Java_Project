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

public class Gate_West {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Gate_West_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gate_West window = new Gate_West();
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
	public Gate_West() {
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
		
		JLabel lblNewLabel = new JLabel("\uCDA9\uBD81\uB300\uD559\uAD50 \uC11C\uBB38 \uADFC\uCC98 \uC2DD\uB2F9 List");
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
			String[] values = new String[] {"\t\u25C8\u25C8\u25C8\u25C8\u25C8\uD55C\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uAD50\uB3D9\uCE7C\uAD6D\uC218", "\t\t\uAE40\uBC25\uC740", "\t\t\uB0A8\uD55C\uC0B0\uC131", "\t\t\uB450\uB9C8\uB9AC\uCC1C\uB2ED", "\t\t\uB6B1\uAE00\uC774\uC21C\uB300\uD574\uC7A5\uAD6D", "\t\t\uBBFC\uB4E4\uB808\uBCF4\uB9AC\uBC25", "\t\t\uBBFC\uBE44\uC544\uAD6C\uCC1C&\uD574\uBB3C\uCC1C", "\t\t\uBCF4\uD1B5\uC758\uAD6D\uC218\uC9D1", "\t\t\uC0B0\uC218\uC815\uC308\uBC25", "\t\t\uC548\uB3D9\uAD81\uC911\uCC1C\uB2ED", "\t\t\uD560\uBA38\uB2C8\uBCF4\uB9AC\uBC25", "\t\t\uD604\uACE0\uB4E4\uAE68\uC190\uCE7C\uAD6D\uC218", "\t\t\uCCAD\uBBF8\uC625", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uACE0\uAE30\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uAF2C\uAF2C\uB9E8\uCE58\uD0A8", "\t\t\uB6B1\uB6B1\uC774\uD560\uBA38\uB2C8\uC871\uBC1C\uBCF4\uC308", "\t\t\uBBF8\uC2A4\uD130\uD6C4\uB77C\uC774\uB4DC", "\t\t\uBC15\uAD70\uCE58\uD0A8", "\t\t\uC6F0\uBE59\uC790\uB2F4\uCE58\uD0A8", "\t\t\uC9C0\uCF54\uBC14\uCE58\uD0A8", "\t\t\uCF04\uD130\uBCA0\uB9AC\uCE58\uD0A8", "\t\tBBQ", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uC911\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uD64D\uB4F1", "\t\t\uBE44\uB8E1\uAC01", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uC591\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uBC18\uC62C\uB9BC\uD53C\uC790\uC0F5", "\t\t\uD669\uCCA0\uC218\uD53C\uC790", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uBD84\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uD5C8\uB355\uC2DD\uB9CC\uB450\uCC10\uBE75"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list_1);
		label_1.setIcon(new ImageIcon(Gate_West.class.getResource("/images/back.gif")));
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
