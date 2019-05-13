// package part3;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.actor.Flower;
import info.gridworld.actor.Actor;

import java.awt.Color;

public class Jumper extends Actor {
	
	public Jumper() {
		setColor(Color.BLUE);
	}

	public Jumper(Color jumperColor) {
		setColor(jumperColor);
	}

	public void act() {
		if(canMove()) {
			jump();
		} else {
			turn();
		}
	}

	public void turn() {
		setDirection(getDirection() + Location.HALF_RIGHT);
	}

	public void jump() {
		Grid<Actor> gr = getGrid();
		if(gr == null) {
			return;
		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location after = next.getAdjacentLocation(getDirection());
		if(gr.isValid(after)) {
			moveTo(after);
		} else {
			removeSelfFromGrid();
		}
	}

	public boolean canMove() {
		Grid<Actor> gr = getGrid();
		if(gr == null) {
			return false;
		}
		Location loc = getLocation();
		Location next = loc.getAdjacentLocation(getDirection());
		Location after = next.getAdjacentLocation(getDirection());
		if(!gr.isValid(after)) {
			return false;
		}
		Actor neighbor = gr.get(after);
		return(neighbor == null) || (neighbor instanceof Flower);
	}

}