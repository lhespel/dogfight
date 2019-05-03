package jpu2016.dogfight.view;

import java.awt.List;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.controller.UserOrder;

public class EventPerformer {
	
	private List<IOrderPerformer> orderPerformer = new ArrayList<IOrderPerformer>();
	
	public EventPerformer (IOrderPerformer orderPerformer) {
		
	}
	
	
	
	public void eventPerform (KeyEvent keyCode) {
		
	}
	
	
	private UserOrder keyCodeToUserOrder (int keyCode) {
		return UserOrder;
	}



	public List<IOrderPerformer> getOrderPerformer() {
		return orderPerformer;
	}



	public void setOrderPerformer(List<IOrderPerformer> orderPerformer) {
		this.orderPerformer = orderPerformer;
	}
}
