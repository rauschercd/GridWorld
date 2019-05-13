
/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 * @author Cay Horstmann
 */

// package part4;

import info.gridworld.actor.Actor;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;

import java.util.ArrayList;
import java.awt.Color;

/**
 * A <code>ChameleonCritter</code> takes on the color of neighboring actors as
 * it moves through the grid. <br />
 * The implementation of this class is testable on the AP CS A and AB exams.
 */
public class ChameleonKid extends ChameleonCritter {
	
	/**
	 * Randomly selects a neighbor and changes this critter's color to be the
	 * same as that neighbor's. If there are no neighbors, no action is taken.
	 */
	public void processActors(ArrayList<Actor> actors) {
		int n = actors.size();
		if (n == 0) {
			Color color = getColor();
			int red = (int) (color.getRed() * 0.97);
			int green = (int) (color.getGreen() * 0.97);
			int blue = (int) (color.getBlue() * 0.97);
			setColor(new Color(red, green, blue));
			return;
		}
		int r = (int) (Math.random() * n);

		Actor other = actors.get(r);
		setColor(other.getColor());
	}

	/**
	 * Turns towards the new location as it moves.
	 */
	public void makeMove(Location loc) {
		setDirection(getLocation().getDirectionToward(loc));
		super.makeMove(loc);
	}

	public ArrayList<Actor> getActors() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		int[] directions = {Location.AHEAD, Location.HALF_CIRCLE};
		for(Location loc : getLocationsInDirections(directions)) {
			Actor actor = getGrid().get(loc);
			if(actor != null) {
				actors.add(actor);
			}
			return actors;
		}
	}

	public ArrayList<Location> getLocationsInDirections(int[] directions) {
		ArrayList<Location> locations = new ArrayList<Location>();
		Grid grid = getGrid();
		Location location = getLocation();

		for(int direction : directions) {
			Location location2 = location.getAdjacentLocation(getDirection() + direction);
			if(grid.isValid(location2)) {
				locations.add(location2);
			} 
		}
		return locations;
	}

}
