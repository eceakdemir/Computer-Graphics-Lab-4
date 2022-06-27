package lab_4_exercises;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Point2D;

import lab_4_exercises.Enclosing.MyFinishWindow;
import lab_4_exercises.ToTheCenter.EasyRect;

public class Triangles extends Frame {
	public class EasyTriangle {
		private int x1;
		private int y1;
		private int x2;
		private int y2;
		private int x3;
		private int y3;
		EasyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
			this.x1 = x1;
			this.y1 = y1;
			this.x2 = x2;
			this.y2 = y2;
			this.x3 = x3;
			this.y3 = y3;
		}
		EasyTriangle midPoints() {
			
			//Point2D.Float point_0 = new Point2D.Float((x1 + x2)/2.0f, (y1 + y2)/2.0f);
			//Point2D.Float point_1 = new Point2D.Float((x2 + x3)/2.0f, (y2 + y3)/2.0f);
			//Point2D.Float point_2 = new Point2D.Float((x1 + x3)/2.0f, (y1 + y3)/2.0f);
			//Point2D.Float[] points = {point_0, point_1, point_2};
			//return points;
			return new EasyTriangle(x1, y1, x2, y2, x3, y3);
		}
		
		public void draw(Graphics2D g2d) {
			int[] x = {x1, x2, x3};
			int[] y = {y1, y2, y3};
			g2d.drawPolygon(x, y, 3);
			
			//poly.addPoint(x1, y1);
		}
		}
		public Triangles() {
			
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
			
			
		}
		
		public static void main(String[] argv)
		{
			Triangles f = new Triangles();
			//f.setTitle("The first Java 2D program");
			f.setTitle("Triangles");
			f.setSize(400, 400);
			f.setVisible(true);
			
		}			
		
		
		
		
		
		
}
	


