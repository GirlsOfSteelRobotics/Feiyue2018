package org.usfirst.frc.team9999.robot.commands;

import org.usfirst.frc.team9999.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class DriveBackward extends Command{
	public DriveBackward() {
		requires(Robot.chassis);
	}
	
	public void initialize() {
	}
	
	public void execute() {
		Robot.chassis.driveBackward();
	}
	
	public boolean isFinished() {
		return false;
	}
	
	public void end() {
		Robot.chassis.stop();
    }
	
	public void interrupted() {
		end();
	}

}
