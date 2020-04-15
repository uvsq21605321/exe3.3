package uvsq.m1.gl;

public class Position {

	private int x;
	private int y;
	
	public Position(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	protected void deplaceX(int nbCase) {
		this.x=this.x+nbCase;
	}
	
	protected void deplaceY(int nbCase) {
		this.y=this.y+nbCase;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}

}
