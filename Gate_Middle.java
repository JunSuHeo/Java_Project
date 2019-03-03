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

public class Gate_Middle {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void Gate_Middle_screen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gate_Middle window = new Gate_Middle();
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
	public Gate_Middle() {
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
		
		JLabel lblNewLabel = new JLabel("\uCDA9\uBD81\uB300\uD559\uAD50 \uC911\uBB38 \uADFC\uCC98 \uC2DD\uB2F9 List");
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
			String[] values = new String[] {"\t\u25C8\u25C8\u25C8\u25C8\u25C8\uD55C\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uB3C8\uC564\uBC25", "\t\t\uB610\uB610\uC640", "\t\t\uB6B1\uC774\uB3C8\uAE4C\uC2A4", "\t\t\uB9C8\uCD08\uBD88\uACE0\uAE30", "\t\t\uBABD\uD0A4\uB9CC\uB450", "\t\t\uBC25\uD1B5\uB839\uB3FC\uC9C0\uCC0C\uAC1C", "\t\t\uBC31\uBC18\uC758\uC815\uC11D", "\t\t\uBC30\uB9C8\uB8E8\uAC08\uBE44\uD0D5", "\t\t\uBD80\uB300\uD1B5\uB839\uB69D\uBC30\uAE30", "\t\t\uBD80\uC0B0\uD560\uB9E4\uC218\uC721\uAD6D\uBC25", "\t\t\uBD80\uC57C\uC2A4\uACF1\uCC3D", "\t\t\uC0BC\uC774\uBF08\uB2E4\uADC0\uAC10\uC790\uD0D5", "\t\t\uC11C\uB2F9\uACE8\uD55C\uC815\uC2DD", "\t\t\uC2DD\uB04C\uBC85\uB04C\uBD84\uC2DD", "\t\t\uC694\uB9AC\uC870\uB9AC\uCFE1\uCFE1", "\t\t\uC724\uCE58\uB9AC\uB124\uAE40\uCE58\uCC0C\uAC1C", "\t\t\uC721\uC308\uB0C9\uBA74", "\t\t\uC740\uD654\uC218\uC2DD\uB2F9", "\t\t\uC774\uB8E8\uB2E4\uB099\uACF1\uC0C8", "\t\t\uC774\uC6B0\uB2F9", "\t\t\uC790\uB2F4\uB3C8", "\t\t\uC7A5\uBC14\uC6B0", "\t\t\uC870\uB9C8\uB8E8\uAC10\uC790\uD0D5", "\t\t\uC9F1\uC774\uB124\uB3C8\uAE4C\uC2A4&\uCE61\uB0C9\uBA74", "\t\t\uCE60\uB3FC\uC9C0\uB9C9\uCC3D&\uC21C\uB300", "\t\t\uD30C\uD30C\uB3C8", "\t\t\uD55C\uB07C", "\t\t\uD55C\uC1A5", "\t\t\uD587\uC0B4\uC655\uB9CC\uB450", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uACE0\uAE30\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\tmiss\uC871\uBE14\uB9AC", "\t\t\uB300\uBC15\uC9D1", "\t\t\uB3C4\uB204\uAC00\uADF8\uB9B4", "\t\t\uB3C4\uB2C8\uC2A4\uD1A0\uB9AC", "\t\t\uC0BC\uCD98\uB124\uC0BC\uACB9\uC0B4", "\t\t\uC0C8\uB9C8\uC744\uC2DD\uB2F9", "\t\t\uC11C\uB798\uAC08\uB9E4\uAE30", "\t\t\uC18C\uC8FC\uC2E0\uB791\uBCF4\uC308\uBD80\uC778", "\t\t\uC1A1\uD559\uC22F\uBD88\uAC08\uBE44\uCD0C", "\t\t\uC6B0\uB9AC\uC9D1\uC22F\uBD88\uACE0\uAE30", "\t\t\uB69D\uC11D\uC0BC\uACB9\uC0B4", "\t\t\uC911\uC6D0\uC591\uAF2C\uCE58", "\t\t\uD1B5\uD070\uAD6C\uC774", "\t\t\uD30C\uC0BC672", "\t\t\uD55C\uB9C8\uC74C\uC815\uC721\uC2DD\uB2F9", "\t\t\uD64D's\uC871\uBC1C", "\t\t\uD654\uC591\uC591\uAF2C\uCE58", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uCE58\uD0A8\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uAF2C\uAF2C\uC544\uCC0C", "\t\t\uAF2C\uBD88\uAF2C\uBD88", "\t\t\uB204\uB098\uD640\uB2ED", "\t\t\uB9DB\uC874\uB9E4\uCF64\uB2ED\uBD88\uACE0\uAE30", "\t\t\uBAAC\uC250\uD504\uAC00\uB5B3\uB2ED", "\t\t\uBD09\uCD94\uCC1C\uB2ED", "\t\t\uB0B4\uCC1C\uB2ED", "\t\t\uBD80\uC5B4\uCE58\uD0A8", "\t\t\uBD81\uACBD\uAE50\uD48D\uAE30", "\t\t\uC0BC\uBBF8\uD30C\uC804\uB2ED\uAC08\uBE44", "\t\t\uC0C8\uBE68\uAC04\uC8E0\uC2A4\uCC1C\uB2ED", "\t\t\uC22F\uBD88\uB2ED\uBC1C", "\t\t\uC544\uC6C3\uB2ED", "\t\t\uC655\uCC9C\uD30C\uB2ED", "\t\t\uC6B0\uB9AC\uC9D1\uB2ED\uAC15\uC815", "\t\t\uC774\uB2ED\uD3EC\uCC28", "\t\t\uC77C\uBBF8\uB2ED\uAC08\uBE44", "\t\t\uCCAD\uCD98\uB2ED\uBC1C", "\t\t\uD3C9\uBBFC\uB2ED\uBC1C", "\t\u25C8\u25C8\u25C8\u25C8\uC544\uC2DC\uC544\uC694\uB9AC\u25C8\u25C8\u25C8\u25C8", "\t\t\uC6B0\uC988\uBC31\uC784", "\t\t\uC778\uB3C4\uB124\uD314\uC74C\uC2DD\uC810", "\t\t\uD0C0\uC9C0\uB9C8\uD560", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uC591\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uBAAC\uC2A4\uD130\uD53C\uC790", "\t\t\uAFB8\uB2C8\uAD7F", "\t\t\uB3C4\uBBF8\uB178\uD53C\uC790", "\t\t\uB86F\uB370\uB9AC\uC544", "\t\t\uB9D8\uC2A4\uD130\uCE58", "\t\t\uBAA8\uD241\uC774\uD30C\uC2A4\uD0C0", "\t\t\uBBF8\uC2A4\uD130\uB9AC\uCFE1", "\t\t\uBC84\uAC70\uD0B9", "\t\t\uBD09\uB300\uBC15\uCC1C\uB2ED", "\t\t\uBD09\uB300\uBC15\uC2A4\uD30C\uAC8C\uD2F0", "\t\t\uBE0C\uB77C\uB354's", "\t\t\uC11C\uBE0C\uC6E8\uC774", "\t\t\uC528\uBA58\uD2B8", "\t\t\uD30C\uBE0C\uB9AC\uCE74", "\t\t\uD53C\uC790\uD5DB", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uC77C\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uB9C8\uB8E8", "\t\t\uC2A4\uC2DC\uC544\uB9C8\uC774", "\t\t\uC790\uB77C\uCFE0\uB77C\uBA58", "\t\t\uC6B0\uBA54\uB2E4", "\t\t\uC9DA\uC2E0\uC2A4\uC2DC&\uB864", "\t\t\uCD08\uBC25\uD55C\uC870\uAC01", "\t\t\uCFE1\uBA54\uC2DC\uC57C", "\t\t\uCD5C\uBD80\uC9F1", "\t\t\uB3C8\uBD80\uB9AC", "\t\u25C8\u25C8\u25C8\u25C8\u25C8\uC911\uC2DD\u25C8\u25C8\u25C8\u25C8\u25C8", "\t\t\uB77C\uCFF5\uD478 \uB9C8\uB77C\uD0D5", "\t\t\uBD81\uACBD\uD0D5\uC218\uC721", "\t\t\uD64D\uCF69\uBC18\uC810", "\t\t\uD669\uAD81\uC7C1\uBC18\uC9DC\uC7A5"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list_1);
		label_1.setIcon(new ImageIcon(Gate_Middle.class.getResource("/images/back.gif")));
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
