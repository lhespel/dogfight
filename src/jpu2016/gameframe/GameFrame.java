package jpu2016.gameframe;
import java.awt.List;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Observable;

import javax.swing.JFrame;
public class GameFrame extends JFrame implements KeyListener {


	private static final long serialVersionUID = -7150794414347269476L;
	private List<IEventPerformer> eventPerformer = new ArrayList<IEventPerformer>();
	public GameFrame (String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		
	}
	public void keyPressed (KeyEvent keyEvent) {
		
	}
	public void keyReleased (KeyEvent keyEvent) {
		
	}
	public void keyTyped (KeyEvent keyEvent) {
		
	}
	public List<IEventPerformer> getEventPerformer() {
		return eventPerformer;
	}
	public void setEventPerformer(List<IEventPerformer> eventPerformer) {
		this.eventPerformer = eventPerformer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
