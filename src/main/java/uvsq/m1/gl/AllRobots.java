package uvsq.m1.gl;

import java.util.ArrayList;

public class AllRobots {
	
private ArrayList<RobotStatique> allRobots;
	
	public AllRobots() {
		allRobots = new ArrayList<RobotStatique>();
	}
	
	public void addRobot(RobotStatique R) {
		this.allRobots.add(R);
	}
	
	public void avancerTous()  {
		if(!allRobots.isEmpty()) {
			for(RobotStatique R: allRobots) {
				R.avance();
			}
		}
	}

}
