package jpu2016.dogfight.model;

import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel implements IDogfightModel {
	
	public DogfightModel() {
		
	}
	
	public IArea getArea() {
		return Area;
	}
	
	public void buildArea(Dimension dimension) {
		
	}
	
	public void addMobile(IMobile Mobile) {
		
	}
	
	public void removeMobile(IMobile Mobile) {
		
	}
	
	public ArrayList<IMobile> getMobile(){
		return Mobile;
	}
	
	public IMobile GetMobileByPlayer(int player) {
		return Mobile;
	}
	
	public void setMobileHavesMoved() {
		
	}

}
