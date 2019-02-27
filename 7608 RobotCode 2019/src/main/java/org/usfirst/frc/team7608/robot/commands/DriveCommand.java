package org.usfirst.frc.team7608.robot.commands;


import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team7608.robot.Robot;

public class DriveCommand extends Command {
	
//	public DriveSubsystem driveSubsystem = new DriveSubsystem();

	public DriveCommand() {
		requires (Robot.driveSubsystem);

	}
	
	 @Override
	   protected void initialize() {
		 
	    
	   }
	   // Called repeatedly when this Command is scheduled to run
	   @Override
	   protected void execute() {
		  Robot.driveSubsystem.arcadeDrive();
		   //Subsystems.driveSubsystem.moveForward(1, 1);
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
	     end();
	   }


}
