package lab4;

import java.util.TimerTask;
public class SimTask extends TimerTask {
	
	private SimEngine ob1;
	private SpringApplet ob2;
	private double dt;
	
	public SimTask(SimEngine ob1, SpringApplet ob2, double dt){
		this.ob1 =ob1;
		this.ob2 =ob2;
		this.dt=dt;
	}
	public void run(){
		ob1.Przebieg(dt);
		ob2.repaint();
	}
}