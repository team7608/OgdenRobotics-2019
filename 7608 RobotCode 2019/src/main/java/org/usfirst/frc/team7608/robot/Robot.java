/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;

import org.usfirst.frc.team7608.robot.commands.DriveCommand;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelDownCommand;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelUpCommand;
import org.usfirst.frc.team7608.robot.commands.MoveHatchPannelStopCommand;
import org.usfirst.frc.team7608.robot.commands.HatchMechOpenCommand;
import org.usfirst.frc.team7608.robot.commands.HatchMechCloseCommand;
import org.usfirst.frc.team7608.robot.commands.HatchMechStopCommand;


import org.usfirst.frc.team7608.robot.subsystems.CargoSubsystem;
import org.usfirst.frc.team7608.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team7608.robot.subsystems.HatchPannelSubsystem;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import org.usfirst.frc.team7608.robot.commands.CargoIntakeCommand;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.cscore.VideoSink;





/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in the
 * project.
 */
public class Robot extends TimedRobot {
	public static DriveSubsystem driveSubsystem;
	public static HatchPannelSubsystem hatchSubsystem;
	public static CargoSubsystem cargoSubsystem;

	
	

	public static OI oi;


	Command autonomousCommand;
//	SendableChooser<Command> chooser = new SendableChooser<>();
	Command driveCommand;
	Command moveHatchPannelUpCommand;
	Command moveHatchPannelDownCommand;
	Command moveHatchPannelStopCommand;
	Command CargoIntakeCommand;
	Command HatchMechOpenCommand;
	Command HatchMechCloseCommand;

	public static UsbCamera camera1;
	public static UsbCamera camera2;
	public static VideoSink server;


	/**
	 * This function is run when the robot is first started up and should be
	 * used for any initialization code.
	 */
	
	@Override
	public void robotInit() {
		hatchSubsystem = new HatchPannelSubsystem();
		driveSubsystem = new DriveSubsystem();
		cargoSubsystem = new CargoSubsystem();
		camera1 = CameraServer.getInstance().startAutomaticCapture(0);
		camera2 = CameraServer.getInstance().startAutomaticCapture(1);
		//server = CameraServer.getInstance().getServer();
	
		oi = new OI();

	
		
		driveSubsystem.driveRobot.setSafetyEnabled(false);

	
		
        
	
	//	chooser.addDefault("Default Auto", new DriveCommand());
		// chooser.addObject("My Auto", new MyAutoCommand());
		//SmartDashboard.putData("Auto mode", chooser);
	}


	/**
	 * This function is called once each time the robot enters Disabled mode.
	 * You can use it to reset any subsystem information you want to clear when
	 * the robot is disabled.
	 */
	@Override
	public void disabledInit() {
		if (driveCommand != null)
			driveCommand.cancel();
	}

	@Override
	//60/sec
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This autonomous (along with the chooser code above) shows how to select
	 * between different autonomous modes using the dashboard. The sendable
	 * chooser code works with the Java SmartDashboard. If you prefer the
	 * LabVIEW Dashboard, remove all of the chooser code and uncomment the
	 * getString code to get the auto name from the text box below the Gyro
	 *
	 * <p>You can add additional auto modes by adding additional commands to the
	 * chooser code above (like the commented example) or additional comparisons
	 * to the switch structure below with additional strings & commands.
	 */
	@Override
	public void autonomousInit() {
	//	autonomousCommand = chooser.getSelected();

		/*
		 * String autoSelected = SmartDashboard.getString("Auto Selector",
		 * "Default"); switch(autoSelected) { case "My Auto": autonomousCommand
		 * = new MyAutoCommand(); break; case "Default Auto": default:
		 * autonomousCommand = new ExampleCommand(); break; }
		 */
		driveCommand = new DriveCommand();
		moveHatchPannelUpCommand = new MoveHatchPannelUpCommand();
		moveHatchPannelDownCommand = new MoveHatchPannelDownCommand();
		moveHatchPannelStopCommand = new  MoveHatchPannelStopCommand();
		// schedule the autonomous command (example)
		if (driveCommand != null) {
			driveCommand.start();
		}
		if (moveHatchPannelUpCommand != null) {
			moveHatchPannelUpCommand.start();
		}
		if (moveHatchPannelDownCommand != null) {
			moveHatchPannelDownCommand.start();
		}
		if (moveHatchPannelStopCommand != null) {
			moveHatchPannelStopCommand.start();
		}
	}

	/**
	 * This function is called periodically during autonomous.
	 */
	@Override
	public void autonomousPeriodic() {
		teleopInit();
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		// This makes sure that the autonomous stops running when
		// teleop starts running. If you want the autonomous to
		// continue until interrupted by another command, remove
		// this line or comment it out.
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}

		driveCommand = new DriveCommand();
		if (driveCommand != null) {
			driveCommand.start();
		}
	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {
	}
}
