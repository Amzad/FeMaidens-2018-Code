package org.usfirst.frc.team2265.robot;

//RobotMap.java
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

	// Joystick Ports
	public static int driveJoyPort = 1;
	// public static int atkJoyPort = 1;

	// Talon Ports
	/*public static int rearLeftPort = 1;
	public static int frontLeftPort = 2;

	public static int rearRightPort = 3;
	public static int frontRightPort = 4; */
	
	//drive talon ports
	public static int rearLeftPort = 3; //3
	public static int frontLeftPort = 4; //4
	public static int rearRightPort = 1; //1
	public static int frontRightPort = 2; //2
	
	//acquirer talon ports
	public static int acqLeftPort = 5;
	public static int acqRightPort = 5;
	public static int pivLeftPort = 5;
	public static int pivRightPort = 5;
	
	//climber talon ports
	public static int climberPort1 = 5;
	public static int climberPort2 = 6;
	
	
	public static int ladderPort1 = 6;
	public static int ladderPort2 = 7;
	public static int basePort1 = 4; 
	public static int basePort2 = 5; 
	
	//temp talon ports
	public static int casLPort1 = 1;
	public static int casLPort2 = 1;
	public static int casRPort1 = 1;
	public static int casRPort2 = 1;

	// Encoder Ports
	/*public static int encPort1 = 5;
	public static int encPort2 = 6;
	public static int encPort3 = 7;
	public static int encPort4 = 8;*/
	
	//drive encoder ports 
	public static int encPort1 = 4;
	public static int encPort2 = 5;
	public static int encPort3 = 6;
	public static int encPort4 = 7;
	
	public static int encPivPort1 = 5;
	public static int encPivPort2 = 5;
	public static int encPivPort3 = 5;
	public static int encPivPort4 = 5;
	
	public static int casencLPort1 = 1;
	public static int casencLPort2 = 1;
	public static int casencRPort1 = 1;
	public static int casencRPort2 = 1;
	
	//limit switch ports
	public static int caslimitswitchPort = 3;
	//Gyro port
	public static int gyroPort = 1;
	



	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}