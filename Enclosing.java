package lab_4_exercises;
//Solution to Exercises 4.3

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import lab_4_exercises.ToTheCenter.EasyRect;
import lab_4_exercises.ToTheCenter.MyFinishWindow;

public class Enclosing extends Frame {
	public class EasySquare {
		private int x; // Center x
		private int y; // Center y
		private int width;
		EasySquare(int x, int y, int width) {
			this.x = x;
			this.y = y;
			this.width = width;
		}
		public void draw(Graphics2D g2d) {
			g2d.drawRect(x - width/2, y - width/2, width, width);
			
		}
		public EasyCircle enclosingCircle() {
			int r = (int) (Math.sqrt(2) * (width/2));
			System.out.println("Width: " + width);
			System.out.println(r);
			return new EasyCircle(x, y, r);
		}
		
		
	}
	public class EasyCircle {
		private int r;
		private int x;
		private int y;
		EasyCircle(int x, int y, int r) {
			this.x = x;
			this.y = y;
			this.r = r;
		}
		public void draw(Graphics2D g2d) {
			g2d.drawOval(x - r, y - r, 2*r, 2*r);
			
		}
		public EasySquare enclosingSquare() {
			return new EasySquare(x, y, 2*r);
		}
		
		
	}
	
	public Enclosing() {
		
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
			EasySquare squ;
			EasyCircle circ;
			final int n_iterations = 5;
			int frame_width = this.getWidth();
			int frame_height = this.getHeight();
			int width = this.getWidth()/10;
			squ = new EasySquare(frame_width/2, frame_height/2, width );
			circ = new EasyCircle(0, 0, 1);
			for(int i = 0; i < n_iterations; i++) {
				if(i % 2 == 0) {
					squ.draw(g2d);
					circ = squ.enclosingCircle();
				}
				else {
					circ.draw(g2d);
					squ = circ.enclosingSquare();
				}
				
			}
			
				
			
		
	}	
	
	
	public static void main(String[] argv)
	{
		Enclosing f = new Enclosing();
		//f.setTitle("The first Java 2D program");
		f.setTitle("Enclosing");
		f.setSize(400, 400);
		f.setVisible(true);
		
	}	
		
	

	

}
