package org.usfirst.frc.team9999.robot.commands;

import org.usfirst.frc.team9999.robot.Robot;
import org.usfirst.frc.team9999.robot.RobotMap;
import org.usfirst.frc.team9999.robot.subsystems.Chassis;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.FollowerType;

public class DriveForward extends Command{
	public DriveForward() {
		requires(Robot.chassis);
	}
	
	public void initialize() {
	}
	
	public void execute() {
		Robot.chassis.driveForward();
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
