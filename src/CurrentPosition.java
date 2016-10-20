
public class CurrentPosition {
	private int x;
	private int y;
	private char heading;
	private int sizeX;
	private int sizeY;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setSizeX(int x) {
		this.sizeX = x;
	}
	public void setSizeY(int y) {
		this.sizeY = y;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public char getHeading() {
		return heading;
	}
	public void setHeading(char heading) {
		this.heading = heading;
	}
	
	public CurrentPosition(int x, int y, char heading) {
		this.x = x;
		this.y = y;
		this.heading = heading;
	}
	
	public CurrentPosition() {
		this.x = 0;
		this.y = 0;
		this.heading = 'N';
	}
	
	public String toString() {
		return "" + x + "," + y + "," + heading;
	}
	
	public void moveNorth(){
		y++;
	}
	
	public void moveSouth(){
		y--;
	}
	
	public void moveWest(){
		x--;
	}
	
	public void moveEast(){
		x++;
	}
	
	public boolean isOnTheEdgeBeforeMove(char movement) {
		if(heading == 'W' && movement =='f' && x == 0) {
			return true;
		}
		if(heading == 'E' && movement =='f' && x == sizeX-1) {
			return true;
		}
		if(heading == 'N' && movement =='f' && x == sizeY-1) {
			return true;
		}
		if(heading == 'S' && movement =='f' && x == 0) {
			return true;
		}
		return false;
	}
}
