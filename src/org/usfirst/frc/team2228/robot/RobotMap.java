package org.usfirst.frc.team2228.robot;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class RobotMap
{
	//Joysticks
	public static int driveJoy = 0;
	public static int controlJoy = 1;
	
	//ToteElevator
	public static int mTote = 15;
	public static int limit1 = 0;
	public static int limit2 = 1;
	public static int limit3 = 2;
	public static int limit4 = 3;
	public static int limit5 = 4;
	
	//CanElevator
	public static int mElevator = 20;
	
	//Drivebase
	/**
	 * CAN id for the FR wheel's jaguar
	 */
	public static int canID_FR  = 13;

	/**
	 * CAN id for the FL wheel's jaguar
	 */	
	public static int canID_FL  = 11;
	
	/**
	 * CAN id for the BR wheel's jaguar
	 */
	public static int canID_BR  = 10;
	
	/**
	 * CAN id for the BL wheel's jaguar
	 */
	public static int canID_BL  = 14;

	/**
	 * port that goes to the gyroscope
	 */
	public static int gyroPort = 0;
	
	public RobotMap()
	{
		
	}
	
	
	//--------------------------------------------------------------------------------
	
	//button mappings---------------------------------------------------------------------------------
	
		/**
		 *	The button index to use for putting the robot into rotational sensitivity mode one
		 *{@link} rMode_limit_one 
		 */
		public static int button_setRotation_one = 7;
		
		
		/**
		 * The button index to use for putting the robot into rotational sensitivity mode two
		 * {@link} rMode_limit_two
		 */
		public static int button_setRotation_two = 8;
		
		/**
		 * The button index to use for putting the robot into rotational sensitivity mode three
		 * {@link} rMode_limit_three
		 */
		public static int button_setRotation_three = 10;
		
		/**
		 * The button index to use for putting the robot into rotational sensitivity mode four
		 * {@link} rMode_limit_four
		 */
		public static int button_setRotation_four = 12;
		
		/**
		 * The button index to use for inverting the drive direction
		 */
		public static int button_invertDrive = 11;
		
		//Advanced Joystick-------------------------------------------------------------------------------
		
		/**
		 * The maximum factor of rotation to use when the robot is in "rotational sensitivity mode one."
		 * In other words, this is the amount (out of one) that the robot will spin when you twist the joystick all the way
		 * Range: [0 - 1] 
		 */
		public static double rMode_limit_one = 0;
		
		/**
		 * The maximum factor of rotation to use when the robot is in "rotational sensitivity mode two."
		 * In other words, this is the amount (out of one) that the robot will spin when you twist the joystick all the way
		 * Range: [0 - 1] 
		 */
		public static double rMode_limit_two= 0;
		
		/**
		 * The maximum factor of rotation to use when the robot is in "rotational sensitivity mode three."
		 * In other words, this is the amount (out of one) that the robot will spin when you twist the joystick all the way
		 * Range: [0 - 1]
		 */
		public static double rMode_limit_three = 0;
		
		/**
		 * The maximum factor of rotation to use when the robot is in "rotational sensitivity mode four."
		 * In other words, this is the amount (out of one) that the robot will spin when you twist the joystick all the way
		 * Range: [0 - 1]
		 */
		public static double rMode_limit_four = 0;
		
		/**
		 * This is the amount that you must twist the joystick in order for getTwist() to return the current sensitivity mode's limit
		 * Range: [0 - 1] Must be greater than rMode_min
		 */
		public static double rMode_max = 1; 
		
		/**
		 * This is the minimum amount you must twist the joystick before the robot will turn (motors are engaged)
		 * Any twist before this value will be treated as if the joystick is not being twisted at all
		 * Range: [0 - 1) Must be less than rMode_max
		 */
		public static double rMode_min = .3;
		
		/**
		 * This is the curve constant for the input to output function which AdvancedJoystick uses to get rotational magnitude values
		 * This value will cause small amounts of rotation to be less sensitive than greater amounts
		 * A value of one will create a perfect curve, were-as a value of 0 will make it linear
		 * Set this to a middle value and fine tune for smoother driving
		 * Range: [0 - 1]
		 */
		public static double rMode_curvature = .8;
		
		/**
		 * Inverts rotational controls
		 * If this is true, twisting the joystick clockwise will rotate the robot counter-clockwise
		 */
		public static boolean rMode_invert = false;
		
		/**
		 * This is the amount that you must move the joystick in order for getMagnitude() to return the current throttle axis' limit
		 * Range: [0 - 1] Must be greater than lMode_min
		 */
		public static double lMode_max = .95;
		
		/**
		 * This is the minimum amount you must pull/push you must put on the joystick before the robot will move (motors are engaged)
		 * Any magnitude before this value will be treated as if the joystick is not being moved at all
		 * Range: [0 - 1) Must be less than lMode_max
		 */
		public static double lMode_min = .1;
		
		/**
		 * This is the cap for the robots speed when the throttle is all the way up
		 * speed cap (limit) is interpolated linearly between max and min throttle values
		 * Range: [0 - 1] Must be less than lMode_min
		 */
		public static double lMode_maxLimit = 1;
		
		/**
		 * This is the cap for the robots speed when the throttle is all the way down
		 * speed cap (limit) is interpolated linearly between max and min throttle values
		 * Range: [0 - 1] Must be less than rMode_max
		 */
		public static double lMode_minLimit = .2;
		
		/**
		 * This is the curve constant for the input to output function which AdvancedJoystick uses to get linear magnitude values
		 * This value will cause linear joystick movement to be less sensitive in small amounts than greater amounts
		 * A value of one will create a perfect curve, were-as a value of 0 will make it linear
		 * Set this to a middle value and fine tune for smoother driving
		 * Range: [0 - 1]
		 */
		public static double lMode_curvature = .2;
		
		/**
		 * Set this to true to invert the joysticks linear control 
		 * @deprecated use initialDirection in drive base instead 
		 */
		public static boolean lMode_invert = false;
		
		//DriveBase----------------------------------------------------------------------------------------------
		
		/**
		 * This is the initial orientation of the drive base
		 * To make the front of the robot forward for the joystick set this to Math.PI
		 * To make the back of the robot forward for the joystick set this to 0
		 */
		public static double initialDirection = Math.PI;
		
		/**
		 * This is the counts per revolution of the drivebases encoders
		 */
		public static int COUNTS_PER_REV = 256;
		
		/**
		 * Time constant for motor ramping (Increment/Second)
		 * This is the factor of motor speed (percent out of one) to increment the motor speeds per second
		 * ex) a value of 1 will move a motor for 0 to 100 percent in one second 
		 */
		public static double ramp = 8; 		//will move motors from 0 to 100 percent over the course of 1/8th of a second
		
		/**
		 * Any in instance of the jaguars outputting more than this current will be logged
		 * A debug value 
		 */
		public static double maxCurrent = 1000000;
		
		/**
		 * Proportional gain (P in PID) for positional control
		 */
		public static double P = 1000;
		
		/**
		 * Integral gain (I in PID) for positional control
		 */
		public static double I = .1;
		
		/**
		 * Derivative gain (D in PID) for positional control
		 */
		public static double D = 0;
		
		/**
		 * If this is set to true, gyroscope will be used for compensation in tele-op,
		 * will keep robot from rotating when the drivers aren't trying to turn
		 */
		public static boolean useGyro_flg = true;
		
		
		//logger---------------------------------------------------------------------------------------
		
		/**
		 * The file location to put log files
		 * If using a flash drive this should be somewhere under /U/
		 */
		public static String logLocation = "/U/Data";


		/**
		 * this will push some config values to the smart-dashboard
		 */
		public static void smartdashboard_set(){
			SmartDashboard.putNumber("ramp", ramp);
			
			SmartDashboard.putNumber("rotation max", rMode_max);
			SmartDashboard.putNumber("rotation min", rMode_min);
			SmartDashboard.putNumber("rotation curvature", rMode_curvature);
			SmartDashboard.putNumber("rotation limit 1", rMode_limit_one);
			SmartDashboard.putNumber("rotation limit 2", rMode_limit_two);
			SmartDashboard.putNumber("rotation limit 3", rMode_limit_three);
			SmartDashboard.putNumber("rotation limit 4", rMode_limit_four);
			SmartDashboard.putBoolean("rotation invert", rMode_invert);
			
			SmartDashboard.putNumber("linear max", lMode_max);
			SmartDashboard.putNumber("linear min", lMode_min);
			SmartDashboard.putNumber("linear curvature", lMode_curvature);
			SmartDashboard.putNumber("linear max limit", lMode_maxLimit);
			SmartDashboard.putNumber("linear min limit", lMode_minLimit);
		}
		
		/**
		 * this will pull values from the smart-dashboard
		 * and set the config variables to the new user specified values
		 * remember, these new values will be erased on robot reset
		 */
		public static void smartdashboard_get(){
			SmartDashboard.putNumber("ramp", ramp);
			
			rMode_max = SmartDashboard.getNumber("rotation max");
			rMode_min = SmartDashboard.getNumber("rotation min", rMode_min);
			rMode_curvature = SmartDashboard.getNumber("rotation curvature", rMode_curvature);
			rMode_limit_one = SmartDashboard.getNumber("rotation limit 1", rMode_limit_one);
			rMode_limit_two = SmartDashboard.getNumber("rotation limit 2", rMode_limit_two);
			rMode_limit_three = SmartDashboard.getNumber("rotation limit 3", rMode_limit_three);
			rMode_limit_four = SmartDashboard.getNumber("rotation limit 4", rMode_limit_four);
			rMode_invert = SmartDashboard.getBoolean("rotation invert", rMode_invert);
			
			lMode_max = SmartDashboard.getNumber("linear max");
			lMode_min = SmartDashboard.getNumber("linear min");
			lMode_curvature = SmartDashboard.getNumber("linear curvature");
			lMode_maxLimit = SmartDashboard.getNumber("linear max limit");
			lMode_minLimit = SmartDashboard.getNumber("linear min limit");
			
			smartdashboard_set();
		}
}
