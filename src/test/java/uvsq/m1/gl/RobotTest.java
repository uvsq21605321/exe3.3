package uvsq.m1.gl;

import static org.junit.Assert.*;

import org.junit.Test;

public class RobotTest {

	@Test
	public void tourneTest() {
		Position pos=new Position(10,23);
		Direction dir=Direction.NORD;
		Robot R=new Robot(pos,dir);
		Direction expected=Direction.EST;
		R.tourne();
		assertEquals(expected,R.getDirection());
	}
	


}
