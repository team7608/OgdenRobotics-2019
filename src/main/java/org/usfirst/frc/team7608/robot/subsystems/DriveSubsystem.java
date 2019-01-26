package org.usfirst.frc.team7608.robot.subsystems;

import org.usfirst.frc.team7608.robot.OI;
import org.usfirst.frc.team7608.robot.RobotMap;

import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class DriveSubsystem extends Subsystem{
	
	public PWMVictorSPX leftFrontMotor = new PWMVictorSPX(RobotMap.leftFrontMotorPort);
	//public PWMVictorSPX leftMidMotor = new PWMVictorSPX(RobotMap.leftMidMotorPort);
	public PWMVictorSPX leftRearMotor = new PWMVictorSPX(RobotMap.leftRearMotorPort);
	
	public PWMVictorSPX rightFrontMotor = new PWMVictorSPX(RobotMap.rightFrontMotorPort);
	//public PWMVictorSPX rightMidMotor = new PWMVictorSPX(RobotMap.rightMidMotorPort);
	public PWMVictorSPX rightRearMotor = new PWMVictorSPX(RobotMap.rightRearMotorPort);
	
	

	public SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftFrontMotor,  leftRearMotor);
	public SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightFrontMotor, rightRearMotor);
		
	public DifferentialDrive driveRobot = new DifferentialDrive(leftMotorGroup, rightMotorGroup);
	
	
	public void arcadeDrive() {
		driveRobot.arcadeDrive(-OI.mainJoystick.getY(), OI.mainJoystick.getZ());
	
	}

	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		
	}

}
