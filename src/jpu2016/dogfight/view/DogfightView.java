package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.model.IDogfightModel;
import jpu2016.gameframe.GameFrame;
	
	public class DogfightView implements IViewSystem, Runnable {
	private final GraphicsBuilder graphicsBuilder;
	private final EventPerformer eventPerformer;
	private final GameFrame gameFrame;

		public DogfightView(IOrderPerformer orderPeformer, IDogfightModel dogfightModel, Observable IDogfightModel) {
			graphicsBuilder = new GraphicsBuilder(dogfightModel);
			eventPerformer = new EventPerformer(orderPeformer);
			gameFrame = new GameFrame(null, null, graphicsBuilder, IDogfightModel);

		}

	public GraphicsBuilder getGraphicsBuilder() {
		return graphicsBuilder;
	}

	public EventPerformer getEventPerformer() {
		return eventPerformer;
	}

	public GameFrame getGameFrame() {
		return gameFrame;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void closeAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}


}
