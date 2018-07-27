package org.usfirst.frc.team9999.robot.subsystems;

import org.usfirst.frc.team9999.robot.Robot;
import org.usfirst.frc.team9999.robot.RobotMap;
import org.usfirst.frc.team9999.robot.commands.DriveByJoystick;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.FollowerType;


public class Chassis extends Subsystem {
	private WPI_TalonSRX masterLeft;
	private WPI_TalonSRX slaveLeft_A;
	private WPI_TalonSRX slaveLeft_B;

	private WPI_TalonSRX masterRight;
	private WPI_TalonSRX slaveRight_A;
	private WPI_TalonSRX slaveRight_B;

	private DifferentialDrive drive;
	
	public Chassis() {
		masterLeft.setNeutralMode(NeutralMode.Brake);
		slaveLeft_A.setNeutralMode(NeutralMode.Brake);
		slaveLeft_B.setNeutralMode(NeutralMode.Brake);

		masterRight.setNeutralMode(NeutralMode.Brake);
		slaveRight_A.setNeutralMode(NeutralMode.Brake);
		slaveRight_B.setNeutralMode(NeutralMode.Brake);
		
		drive = new DifferentialDrive(masterLeft, masterRight);
		drive.setSafetyEnabled(true);
		drive.setExpiration(0.1);
		drive.setMaxOutput(1.0);
		
	}
	
	public void initDefaultCommand() {
		setDefaultCommand(new DriveByJoystick());
	}

	public void driveByJoystick(double yDir, double xDir){
		SmartDashboard.putString("driveByJoystick?", yDir + "," + xDir);
		drive.arcadeDrive(yDir,xDir);
	}
	public void stop() {
		drive.stopMotor();
	}

	public void driveForward() {
		masterLeft.set(0.2);
		masterRight.set(0.2);
	}
	public void driveBackward() {
		masterLeft.set(-0.2);
		masterRight.set(-0.2);
	}
	 public void driveByTime() {
		 masterLeft.set(0.4);
		 masterRight.set(0.4);
	 }


}
