/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot.commands;

import org.usfirst.frc.team7608.robot.OI;
import org.usfirst.frc.team7608.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class MoveHatchPannelDownCommand extends Command {
  
  public MoveHatchPannelDownCommand() {
  requires(Robot.hatchSubsystem);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    //System.out.println("Execute");
   // if (OI.secondJoystick.getRawAxis(1) > (0.1)) 


    
  //else if (OI.secondJoystick.getRawAxis(1) < (-0.1)) {
    Robot.hatchSubsystem.HatchPannelLiftDown();
    
  }
  

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
