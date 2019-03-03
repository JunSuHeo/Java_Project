package Cook_recipe;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Show_map extends JFrame{
   
   private Browser browser;
   private BrowserView view;
   private JTextField textField = new JTextField(30);
   private JPanel panel = new JPanel();
   
   public class Event implements MouseListener{

      @Override
      public void mouseClicked(MouseEvent arg0) {
         setURL(textField.getText());
      }

      @Override
      public void mouseEntered(MouseEvent arg0) {
         
      }

      @Override
      public void mouseExited(MouseEvent arg0) {
         
      }

      @Override
      public void mousePressed(MouseEvent arg0) {
         
      }

      @Override
      public void mouseReleased(MouseEvent arg0) {
         
      }
      
   }
   public void setURL(String URL){
      browser.loadURL(URL);
   }
   
   public Show_map()
   {
	   
	   String search = JOptionPane.showInputDialog(null, "구글 지도에 검색할 내용을 적으세요.");
	   if(search != null)  Show_browser(search);
   }
   
   public void Show_browser(String search_name)
   {
      Browser browser = new Browser();
      view = new BrowserView(browser);
      
      setLayout(new BorderLayout());
      setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
      //setSize(1280, 720);
      setVisible(true);
      setBounds(100, 100, 1280, 720);
      
      add(panel, BorderLayout.NORTH);
      add(view, BorderLayout.CENTER);
      
      browser.loadURL("https://www.google.co.kr/maps/search/" + search_name + "/@36.6265346,127.4484562,15z/data=!3m1!4b1");
      String url = browser.getURL();
      System.out.println(url);
   }
}