
public class Planet {
	private int x;
	private int y;
	private int [][] grid;
	
	public Planet(int x, int y) {
		this.x = x;
		this.y = y;
		grid = new int[x][y];
	}

	public int[][] getGrid() {
		return grid;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
