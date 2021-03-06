/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	

	
	public static int leftFrontMotorPort = 1;
	public static int leftRearMotorPort = 2;
	public static int rightFrontMotorPort = 3;
	public static int rightRearMotorPort = 4;

	public static int hatchPannelMotor = 5;
	public static int cargoMechanismIntakeMotor = 6;
	
	public static int servo1 = 0;
	//public static int servo2 = 1;
	//public static int hatchlimitswitch = ;
	public static int servoA = 2;
	public static int servoB = 3;
	public static int servoC = 4;


	public static int mainStick = 0;
	public static int secondStick = 1;
	
	
}

