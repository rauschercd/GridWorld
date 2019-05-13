import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	
	private int steps;
	private int sideLength;
	private boolean firstTurn = true;
	private boolean stop = false;
	 
	public ZBug(int length) {
		steps = 0;
		sideLength = length;
	}

	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else{
			if(firstTurn) {
				turn();
				turn();
				turn();
				steps = 0;
				firstTurn = false;
			} else if(!stop) {
				turn();
				turn();
				turn();
				turn();
				turn();
				steps = 0;
				stop = true;
			}
		}
	}
}
