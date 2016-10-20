
public class CurrentPosition {
	private int x;
	private int y;
	private char heading;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
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
}
