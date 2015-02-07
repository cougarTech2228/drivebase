package org.usfirst.frc.team2228.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/*
 * Drive Base Omni-Directional
 */

public class DriveBase{
    //AdvancedJoystick joy;
    Joystick joy;
	
    Wheel wheelBL;
    Wheel wheelBR;
	Wheel wheelFL;
    Wheel wheelFR;
    PowerDistributionPanel panel;
	
	int COUNTS_PER_REV;
	
    public DriveBase(int joyPort, int bR, int bL, int fL, int fR){
    	joy = new Joystick(joyPort);
    	//joy = new AdvancedJoystick(joyPort);
    	//joy.defaultMode();
		//joy.setBypass(true);
		
		panel = new PowerDistributionPanel();
		
        wheelFR = new Wheel(fR, COUNTS_PER_REV, "front right");
        wheelFL = new Wheel(fL, COUNTS_PER_REV, "front left");        
        wheelBR = new Wheel(bR, COUNTS_PER_REV, "back right");        
		wheelBL = new Wheel(bL, COUNTS_PER_REV, "back left");
		
		wheelFL.setInvert(true);
		wheelBL.setInvert(true);
    }
   
    public void mecanumDrive(double time){    	
    	double lMag;//linear magnitude (-1 to 1)
    	double dir;//direction (in radians)
    	double rotate;//rotational magnitude (-1 to 1)
    	double v1,v2,v3,v4;
    	    	
    	//get mag. dir. and rot. from the joystick
    	lMag = joy.getMagnitude();
    	dir = -joy.getDirectionRadians();
    	rotate = joy.getTwist();
    	
    	SmartDashboard.putNumber("angle", Math.toDegrees(dir));
    	SmartDashboard.putNumber("rotate", rotate);
    	SmartDashboard.putNumber("magnitude", lMag);

    	//set each motors percent speed based on the direction, magnetude and velocity
    	v1 = lMag*Math.sin(dir + (Math.PI/4)) + rotate;
    	v2 = lMag*Math.cos(dir + (Math.PI/4)) - rotate;
    	v3 = lMag*Math.cos(dir + (Math.PI/4)) + rotate;
    	v4 = lMag*Math.sin(dir + (Math.PI/4)) - rotate;
    	
    	//push new motor speed to the Jaguars
    	
    	wheelFR.setVoltage(v1);
		wheelFL.setVoltage(v2);
		wheelBR.setVoltage(v3);
		wheelBL.setVoltage(v4);
		
		wheelFL.update(time);
		wheelFL.update(time);
		wheelBR.update(time);
		wheelBL.update(time);
    }
}
