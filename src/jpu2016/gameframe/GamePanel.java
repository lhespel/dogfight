package jpu2016.gameframe;

import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer {
	private Observable observer;
	private List<IGraphicsBuilder> graphicsBuilder = new ArrayList<IGraphicsBuilder>();
	private static final long serialVersionUID = -1768571467213407698L;
	public GamePanel (IGraphicsBuilder graphicBuilder) {
		
	}
	public void update (Observable observable) {
		
	}
	public void painComponent (Graphics graphic) {
		
	}
	public Observable getObserver() {
		return observer;
	}
	public void setObserver(Observable observer) {
		this.observer = observer;
	}
	public List<IGraphicsBuilder> getGraphicsBuilder() {
		return graphicsBuilder;
	}
	public void setGraphicsBuilder(List<IGraphicsBuilder> graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
