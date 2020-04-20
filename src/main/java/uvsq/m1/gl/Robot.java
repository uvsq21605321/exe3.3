package uvsq.m1.gl;

public class Robot extends RobotStatique{

	public Robot(Position position, Direction direction) {
		super(position, direction);
		
	}
	public void tourne() {
		if(direction.equals(Direction.NORD)) {
			this.direction=Direction.EST;
		}
		else if(direction.equals(Direction.EST)) {
			this.direction=Direction.SUD;
		}
		else if(direction.equals(Direction.SUD)) {
			this.direction=Direction.OUEST;
		}
		else {
			this.direction=Direction.NORD;
		}
	}
	
	@Override
	public void avance(){
		if(direction.equals(Direction.NORD)) {
			this.position.deplaceY(1);
		}
		else if(direction.equals(Direction.EST)) {
			this.position.deplaceX(1);
		}
		else if(direction.equals(Direction.SUD)) {
			this.position.deplaceY(-1);
		}
		else {
			this.position.deplaceX(-1);
		}
	}

	
	
}
