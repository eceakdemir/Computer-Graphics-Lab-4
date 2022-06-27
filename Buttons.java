package lab_4_exercises;
// Solution to Exercises 4.1

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.event.*; 

public class Buttons extends Frame implements ActionListener, MouseListener
{
	static final int windowWidth = 800;
	static final int windowHeight = 800;
	Buttons()
	{
		//clicked = false;
		setTitle("Buttons");
			//https://way2java.com/awt-components/java-awt-menu-%E2%80%93-multiple-pull-down-lists/
		MenuBar menu_bar = new MenuBar();
			
		Menu def = new Menu("File");
		def.add(new MenuItem("Set Default"));
		def.addActionListener(this);
		menu_bar.add(def);
		setMenuBar(menu_bar);
		
		//https://www.javatpoint.com/java-awt-panel
        Panel panel=new Panel();  
        panel.setBounds(0,40,windowWidth,40);  
		
        //https://beginnersbook.com/2015/06/java-awt-tutorial/
		Button button_s = new Button();
		button_s.setLabel("Button 1");
		button_s.addActionListener(this);
		Button button_b = new Button();
		button_b.addActionListener(this);
		button_b.setLabel("Button 2");
		
		panel.add(button_s);
		panel.add(button_b);
		
		panel.setBackground(Color.black); 
		add(panel);
		setLayout(null);
		addWindowListener(new MyFinishWindow());
		addMouseListener(this);
		//setBackground(Color.red);
		
	}
	public class MyFinishWindow extends WindowAdapter
	   {
	     public void windowClosing(WindowEvent e)
	     {
	       System.exit(0);
	     }
	   }
	public void paint(Graphics g)
	{
		Graphics2D g2d = (Graphics2D) g;

		System.out.println("Paint called.");	
			
		
	}
	public static void main(String[] argv)
	{
		Buttons f = new Buttons();
		//f.setTitle("The first Java 2D program");
		
		f.setSize(windowWidth, windowHeight);
		f.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String str = arg0.getActionCommand();
		//System.out.println(str);
		if(str.equals("Set Default")) {
			System.out.println("Defaults.");	
		}
		else if(str.equals("Button 1")) {
			System.out.println("Button 1 clicked.");	
			// set scale
			//
		}
		else if(str.equals("Button 2")) {

			System.out.println("Button 2 clicked.");	
		}
		
		
	}
	//https://docs.oracle.com/javase/tutorial/uiswing/events/mouselistener.html
	public void mouseClicked(MouseEvent arg0) {
		//clicked =  true;
		//x = arg0.getX();
		//y = arg0.getY();
		int x = arg0.getX();
		int y = arg0.getY();
		repaint();
		// TODO Auto-generated method stub
		
	}
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
