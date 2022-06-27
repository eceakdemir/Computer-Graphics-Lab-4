package lab_4_exercises;
//Solution to Exercises 4.2

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class ToTheCenter extends Frame {
	public class EasyRect {
		private int x;
		private int y;
		private int width;
		private int height;
		EasyRect(int x, int y, int width, int height) {
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
		public void draw(Graphics2D g2d) {
			g2d.drawRect(x - width/2, y - height/2, width, height);
			
		}
		
		public void reshape(int axis) {
			if(axis == 0) {
				width = width/3;
			}
			else if(axis == 1) {
				height = height/3;
			}
			
			
		}
	}
	private EasyRect rect;
	
	public ToTheCenter() {
		
		addWindowListener(new MyFinishWindow());
		// TODO Auto-generated constructor stub
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
			int width = (int) (this.getWidth()*0.66);
			int height = (int) (this.getHeight()*0.66);

			rect = new EasyRect(this.getWidth()/2, this.getWidth()/2, width, height);

			
			int n_iters = 5;
			int axis = 1;
			for(int i = 0; i < n_iters; i++) {
				rect.reshape(axis);
				rect.draw(g2d);
				//g2d.drawRect(100, 100, 100, 100);
				axis = 1 - axis;
			}	
			
			
		
	}	
	public static void main(String[] argv)
	{
		ToTheCenter f = new ToTheCenter();
		//f.setTitle("The first Java 2D program");
		f.setTitle("To The Center");
		f.setSize(400, 400);
		f.setVisible(true);
		
	}	
		
		
		
		
		
		
		
}


	
	


