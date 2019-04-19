/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team7608.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import org.usfirst.frc.team7608.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team7608.robot.Robot;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Servo;


/**
 */
public class HatchPannelSubsystem extends Subsystem {
  public WPI_VictorSPX hatchPannelMotor = new WPI_VictorSPX(RobotMap.hatchPannelMotor);
  //public DigitalInput hatchlimitswitch = new DigitalInput(RobotMap.hatchlimitswitch);
  public Servo servoA = new Servo(RobotMap.servoA);
  public Servo servoB = new Servo(RobotMap.servoB);
  public Servo servoC = new Servo(RobotMap.servoC);



  public void HatchPannelLiftUp() {
    hatchPannelMotor.set(ControlMode.PercentOutput, 0.1);
  }
  public void HatchPannelLiftDown () {
    hatchPannelMotor.set(ControlMode.PercentOutput, -0.09);

  }
  public void HatchPannelLiftStop (){
    hatchPannelMotor.set(ControlMode.PercentOutput, 0);
  }




  public void HatchMechOpen(){
    servoA.setPosition(0.6);
    servoB.setPosition(0.6);
    servoC.setPosition(0.6);
  }

  public void HatchMechClosed(){
    servoA.setPosition(0);
    servoB.setPosition(0);
    servoC.setPosition(0);


  }
  public void HatchMechStop(){
    servoA.setPosition(0);
    servoB.setPosition(0);
    servoC.setPosition(0);

    
  }

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
