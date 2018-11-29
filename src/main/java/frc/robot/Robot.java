/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.TimedRobot;

public class Robot extends TimedRobot {
	DriveTrain dt;
	Xbox driver;

	@Override
	public void robotInit() {
		dt = new DriveTrain();
		driver = new Xbox(0);
	}

	@Override
	public void robotPeriodic() {
		dt.accelDrive(driver.getY(GenericHID.Hand.kLeft), driver.getX(GenericHID.Hand.kLeft));
	}


	@Override
	public void autonomousInit() {

	}

	@Override
	public void autonomousPeriodic() {

	}

	/**
	 * This function is called periodically during operator control.
	 */
	@Override
	public void teleopPeriodic() {
	}

	/**
	 * This function is called periodically during test mode.
	 */
	@Override
	public void testPeriodic() {

	}
}
