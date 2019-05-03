package jpu2016.dogfight.view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.dogfight.model.IMobile;
import jpu2016.gameframe.IGraphicsBuilder;

public class GraphicsBuilder implements IGraphicsBuilder {
	private final BufferedImage emptySky;
	private final IDogfightModel dogfightModel;
	
	public GraphicsBuilder ( IDogfightModel dogfightModel) {
		emptySky = new BufferedImage();
		dogfightModel =  new IDogfightModel();
	}
	public void applyModelToGraphic(Graphics graphics, ImageObserver observer) {
		
	}
	@SuppressWarnings("unused")
	private void publicEmptySky() {
		
	}
	private void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer) {
		
	}
	public int getGlobalWidth() {
		return 1;
	}
	public int getGlobalHeight() {
		return 1; 
	}
	public BufferedImage getEmptySky() {
		return emptySky;
	}
	public IDogfightModel getDogfightModel() {
		return dogfightModel;
	}
}
