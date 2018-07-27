package org.usfirst.frc.team9999.robot.commands;

import org.usfirst.frc.team9999.robot.Robot;
import org.usfirst.frc.team9999.robot.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

public class DriveByTime extends Command{
	long startime = System.currentTimeMillis();
    long endtime;
	
	public DriveByTime(int timeInMs) {
		requires(Robot.chassis);
	}
	
	public void initialize() {
	}
	
	public void execute() {
		Robot.chassis.driveByTime();
		endtime = System.currentTimeMillis();
	}
	
	public boolean isFinished() {
		if(endtime-startime == 2000) {
		return true;
		}
		else {
			return false;
		}
	}
	
	public void end() {
		Robot.chassis.stop();
    }
	
	public void interrupted() {
		end();
	}

}
