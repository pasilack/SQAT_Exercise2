
// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID:
// Finish time:

public class PlanetExplorer {
	private int x;
	private int y;
	private String obstacles;
	private CurrentPosition cp = new CurrentPosition();
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public PlanetExplorer(int x, int y, String obstacles){
		this.x = x;
		this.y = y;
		this.obstacles = obstacles;
		cp.setSizeX(x);
		cp.setSizeY(y);
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
	}
	
	//to make testing easier
	public void setCurrentPosition(int x, int y, char heading) {
		cp.setX(x);
		cp.setY(y);
		cp.setHeading(heading);
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		if(command.equals("")) {
			return cp.toString();
		}
		
		for(char c: command.toCharArray()) {
			switch (c) {
			case 'l' :
				if(cp.getHeading() == 'N') {
					cp.setHeading('W');
				}
				else if(cp.getHeading() == 'W') {
					cp.setHeading('S');
				}
				else if(cp.getHeading() == 'S') {
					cp.setHeading('E');
				}
				else if(cp.getHeading() == 'E') {
					cp.setHeading('N');
				}
				break;
			
			case 'r' :
				if(cp.getHeading() == 'N') {
					cp.setHeading('E');
				}
				else if(cp.getHeading() == 'E') {
					cp.setHeading('S');
				}
				else if(cp.getHeading() == 'S') {
					cp.setHeading('W');
				}
				else if(cp.getHeading() == 'W') {
					cp.setHeading('N');
				}
				break;
			case 'f' :
				if(cp.getHeading() == 'N') {
					if(cp.getY() + 1 > y-1) {
						cp.setY(0);
					}
					else
						cp.moveNorth();
				}
				if(cp.getHeading() == 'W') {
					if(cp.isOnTheEdgeBeforeMove('f')) {
						cp.setX(x-1);
					}
					else 
						cp.moveWest();
				}
				if(cp.getHeading() == 'S') {
					cp.moveSouth();
				}
				if(cp.getHeading() == 'E') {
					if(cp.isOnTheEdgeBeforeMove('f')) {
						cp.setX(0);
					}
					else
						cp.moveEast();
				}
				break;
			case 'b' : 
				if(cp.getHeading() == 'N') {
					if(cp.getY() - 1 < 0) {
						cp.setY(y-1);
					}
					else
						cp.moveSouth();
				}
				if(cp.getHeading() == 'W') {
					cp.moveEast();
				}
				if(cp.getHeading() == 'S') {
					cp.moveNorth();
				}
				if(cp.getHeading() == 'E') {
					if(cp.getX() - 1 < 0) {
						cp.setX(x-1);
					}
					else
						cp.moveWest();
				}
				break;
				
			}
		}
				
		return cp.toString();
	}
}
