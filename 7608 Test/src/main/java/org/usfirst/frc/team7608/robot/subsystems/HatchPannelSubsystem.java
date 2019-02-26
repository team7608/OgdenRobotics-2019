 /*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import org.usfirst.frc.team7608.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 */
public class HatchPannelSubsystem extends Subsystem {
  public WPI_VictorSPX hatchPannelMotor = new WPI_VictorSPX(RobotMap.hatchPannelMotor);
 // private double up = (OI.secondJoystick.getRawAxis(-4));

public void HatchPannelLiftUp () {
  hatchPannelMotor.set(0.5);
  //(OI.secondJoystick.getRawsAxis(-4) , OI.secondJoystick.getRawAxis(4));
}


public void HatchPannelLiftDown () {
  hatchPannelMotor.set(-0.5);
//(ControlMode.PercentOutput, 
}



  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
