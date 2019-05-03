import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.view.DogfightView;

public class main {
	final DogfightModel dogfightModel = new DogfightModel();
	final DogfightController dogfightController = new DogfightController(dogfightModel);
	final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel,
	dogfightModel);
	dogfightController.setViewSystem(dogfightView);
	dogfightController.play(); 

}
