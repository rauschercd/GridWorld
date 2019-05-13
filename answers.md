Part 1
1) Yes, the bug always moves to a new location unless it is blocked by rocks, then it turns.
2) The bug always moves straight.
3) If it does not move, it turns.
4) It leaves a flower.
5) When it reaches the edge of the grid, the bug turns twice so it can move again and then goes straight.
6) If there is a rock, the bug turns.
7) Flowers do not move.
8) Flowers are the same color as the bug, and when they are first placed they are brightly colored and slowly dim as they get older.
9) No rocks only block bugs.
10) No only one actor can be in the same location at the same time.

Exercises
-------------------
1)
Degrees   Direction
0           North
45          North East
90          East
135         South East
180         South
225         South West
270         West
315         North West
360         North

2) With the moveTo method you can move actors anywhere on the grid in any direction. If you move the actor outside the grid it gives you an error.

3) To change colors I used the setColor method.

4) The bug disappeared when I moved a rock onto it.

------------------------------------------------------------------------------------------------------------------------------------------
Part 2
1) Sidelength tells the bug how many steps to go before turning or doing another action.
2) Steps counts how many times the bug has moved in one direction, and when it hits sidelength the bug turns and steps resets.
3) The bug turns twice because each turn turns the bug 45 degrees and to draw a square the bug needs to turn 90 degrees.
4) BoxBug can call move() because it extends the Bug class.
5) The size of it's square pattern will always be the same unless you change the number of steps when you call a new bug in the runner or something blocks the bug.
6) No the path cannot change unless the bug hits a wall.
7) Steps will be zero right after the bug turns to go on a new line.

------------------------------------------------------------------------------------------------------------------------------------------
Part 3
1) To access the row value for loc1 you would use the getRow() function.
2) The value of b would be false because they are not the same location.
3) loc3 = (3, 3)
4) dir = 135
5) You tell it a location with NORTH, SOUTH, EAST, or WEST

1) To obtain a count of the objects in the grid you would find the length of ArrayList<Location> getOccupiedLocations().
2) To check if (10,10) is in the grid you could use the isValid(Location loc) function and check if it returns true or false.
3) It gets them from the gridworld.jar file that runs with it.
4) No I think it is better to have it return in an ArrayList because since you can add and remove in an ArrayList and it is more difficult to in an array, adding and removing actors is much easier.

1) Three properties of every actor are Color, Direction, and Location.
2) When an actor is created their direction is 0, and their color is clear to show the original sprite image.
3) It is created as a class instead of an interface because then it can have children which are the bug, rock, and flower.
4) An actor cannot put itself onto the same location twice or remove itself from a grid twice. It can put itself onto a spot, remove itself, and then have another one set in the same location.
5) An actor can turn 90 degrees to the right by using turn() twice or by using setDirection().

1) The gr.isValid(next) statement that returns true or false ensures the bug wont move out of the grid.
2) The same statement returns true or false and allows the bug to know if it can move or not, and if there is a rock it will not move.
3) isValid tells it if it can move or overwrite something in a location on the grid.
4) getAdjacentLocation
5) getGrid, getLocation, and getDirection are inherited from the Actor class
6) It disappears
7) Yes because it needs to know it's location
8) The flower color is set to the same color as the bug is when it is created and dropped.
9) No
10) flower.putSelfInGrid(gr, loc). Loc is the bug location.
11) 4 Times

Group Activity
1) 
    a) It would have to turn because it cant move onto a rock.
    b) It would have to turn because it cant move off the grid.
    c) It would have to turn because it cant move off the grid.
    d) It would turn or it could overwrite it and move into that square.
    e) It would turn or it could overwrite it and move into that square.
    f) No because even if something is in front of it, it can still jump over it.
2)
    a) It should extend actor since it is a type of actor.
    b) The bug class is kind of like it but it would need to be changed in order to work with jumper.
    c) Color, direction, and location would all need to be used with the jumper.
    d) Any movement, and also the actor method.
    e) The movement methods.
    f) Place it down and test every single thing, such as moving off the grid and moving into different objects.
------------------------------------------------------------------------------------------------------------------------------------------
Part 4
1) act, makeMove, getActors, processActors, getMoveLocations, and selectMoveLocation.
2) Everything above except act
3) Yes critters should override anything that is specific to their class
4) It could get the locations of all the other critters
5) First getMoveLocations, then selectMoveLocation, and then makeMove. 
getMoveLocations checks where the critter can move, selectMoveLocation chooses where the critter should go, and makeMove moves the critter.
6) Critter extends actor

1) Act controls everything the critters do, and so if chamelon overrides any method, not just act, it will function differently.
2) It uses the super Critter class for makeMove instead of writing it all again into ChameleonCritter.
3) Get the critter's current location, and then if the critter moves, leave a flower in that old location that was just saved.
4) The chameleon doesnt change the actors in the grid and so it doesnt need to overwrite the getActors method since it can just use the basic critter method oto see where the other actors are.
5) Actor
6) getGrid()

1) It doesn't need to change the normal processActors method already in critter.
2) It checks its front, and the two spaces next to it and if there is a rock there, it eats it.
3) The crab uses getLocationsInDirections in order to figure out which objects it can eat.
4) (2, 5), (3, 5), and (4, 5);
5) They both move without needing to turn to the square, they just choose a square and move to it. However, crabs only move left/right, while critters move to any adjacent location. 
6) If it chooses it's own location and uses makeMove, it turns.
7) The crabs only eat rocks.