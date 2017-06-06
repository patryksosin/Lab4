package lab4;

import java.applet.*;
import java.awt.*;
import java.util.Timer;
import java.util.Date;
public class SpringApplet extends Applet
	{
	
	private SimEngine ob3;
	private SimTask ob4;
	private Timer timer;
	
	public void init(){
		
		Vector2D z = new Vector2D(110,80);
		Vector2D v = new Vector2D(0,0);
		Vector2D xl = new Vector2D(150,50);
		ob3 = new SimEngine(18.0,7.0,3.0,120.0,z,v,xl,9.81);
		ob4 = new SimTask(ob3, this , 0.04);
		timer = new Timer();
		timer.scheduleAtFixedRate(ob4, 0, 5);
	}
	public void paint(Graphics g){
		
		g.clearRect(0,0,getWidth(),getHeight()); // czysci
		setBackground(Color.YELLOW); //rysuje
		
		g.drawLine((int) ob3.getXl().x, (int) ob3.getXl().y,(int) ob3.getZ().x,
				(int) ob3.getZ().y);
		g.drawLine((int) ob3.getXl().x-40, (int) ob3.getXl().y,(int)
				ob3.getXl().x+40, (int) ob3.getXl().y);
	}
}