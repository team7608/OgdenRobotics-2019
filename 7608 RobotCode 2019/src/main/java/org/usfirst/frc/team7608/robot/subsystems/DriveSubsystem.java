package org.usfirst.frc.team7608.robot.subsystems;

import org.usfirst.frc.team7608.robot.OI;
import org.usfirst.frc.team7608.robot.RobotMap;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSubsystem extends Subsystem{
	
	public WPI_VictorSPX leftFrontMotor = new WPI_VictorSPX(RobotMap.leftFrontMotorPort);
	//public WPI_VictorSPX leftMidMotor = new WPI_VictorSPX(RobotMap.leftMidMotorPort);
	public WPI_VictorSPX leftRearMotor = new WPI_VictorSPX(RobotMap.leftRearMotorPort);
	
	public WPI_VictorSPX rightFrontMotor = new WPI_VictorSPX(RobotMap.rightFrontMotorPort);
	//public WPI_VictorSPX rightMidMotor = new WPI_VictorSPX(RobotMap.rightMidMotorPort);
	public WPI_VictorSPX rightRearMotor = new WPI_VictorSPX(RobotMap.rightRearMotorPort);
	
	

	public SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftFrontMotor,  leftRearMotor);
	public SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightFrontMotor, rightRearMotor);
		
	public DifferentialDrive driveRobot = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
	
	
	public void arcadeDrive() {
		//driveRobot.tankDrive(OI.getRawAxis., OI.getRawAxis(5));
		driveRobot.arcadeDrive(-OI.mainJoystick.getY(), OI.mainJoystick.getZ());
	
	}

	
	@Override
	protected void initDefaultCommand() {		
	}

}
