package jpu2016.dogfight.model;

public class Missile extends Mobile {
	
	private int SPEED = 4;
	private int WIDTH = 30;
	private int HEIGHT = 10;
	private int MAX_DISTANCE_TRAVELED = 1400;
	private String IMAGE ="missile";
	private int distance_traveled = 0;
	
	public Missile(Direction direction, Dimension dimension) {
		
	}
	
	public int getWidthWithADirection(Direction direction) {
		return WIDTH;
	}
	
	public int getHeightWithADirection(Direction direction) {
		return HEIGHT;
	}
	
	public void move() {
		
	}
	
	public boolean isWeapon() {		
	}
	

}
