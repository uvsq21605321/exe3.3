package uvsq.m1.gl;

public class RobotStatique {

	protected Position position;
	protected Direction direction;
	
	public RobotStatique(Position position, Direction direction) {
		this.position = position;
		this.direction = direction;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public void avance() {
		// TODO Auto-generated method stub
		
	}
}

