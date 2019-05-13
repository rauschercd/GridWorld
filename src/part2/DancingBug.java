import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
	
	private int steps;
	private int sideLength;

	double random;
	 
	public DancingBug() {
		
	}

	public void act() {
		random = Math.random() * 5;
		random = (int) random;
		for(int i = 0; i < random; i++) {
			turn();
		}
		if(canMove()) {
			move();
		} else{
			turn();
		}
	}
}
