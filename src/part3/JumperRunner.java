import info.gridworld.actor.ActorWorld;
// import info.gridworld.actor.Jumper;
import info.gridworld.grid.Location;

import java.awt.Color;


public class JumperRunner {
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper jumper1 = new Jumper();
		world.add(jumper1);
		world.show();
	}
}