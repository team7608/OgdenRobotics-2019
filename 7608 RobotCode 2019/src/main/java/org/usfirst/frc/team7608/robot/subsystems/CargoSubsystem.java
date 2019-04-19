/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot.subsystems;

import org.usfirst.frc.team7608.robot.Robot;
import org.usfirst.frc.team7608.robot.RobotMap;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.ctre.phoenix.motorcontrol.ControlMode;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.PWM;


/**
 * Add your docs here.
 */
public class CargoSubsystem extends Subsystem {
  
  public WPI_VictorSPX CargoIntakeMotor = new WPI_VictorSPX(RobotMap.cargoMechanismIntakeMotor);
  public Servo servo1 = new Servo(RobotMap.servo1);
 

  


  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public void CargoIntakeStart() {
    CargoIntakeMotor.set(ControlMode.PercentOutput, -1);
  }

  public void CargoStop(){
CargoIntakeMotor.set(ControlMode.PercentOutput, 0);
  }
public void CargoReverse(){
  CargoIntakeMotor.set(ControlMode.PercentOutput, 1);
}
public void ServoDropCommand(){
  servo1.setAngle(90);
  double servo1position = servo1.getAngle();
  System.out.println(servo1position);
}
public void ServoStopCommand(){
  //servo1.setAngle(0);
  servo1.setAngle(180);
  //255 instead of 360
}


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
