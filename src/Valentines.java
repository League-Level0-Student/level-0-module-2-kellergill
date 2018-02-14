import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Valentines {
public static void main(String[] args) {
	Robot JakPal=new Robot();
	JakPal.setSpeed(1500);
	JakPal.setPenColor(Color.blue);
	JakPal.penDown();
	JakPal.setWindowImage("DROIVEAHEAD.jpeg");
	JakPal.setPenWidth(150000);
	for(int i=0; i<180 ;i++) {
		JakPal.move(1);
		JakPal.turn(360/360);
	}
	JakPal.turn(42);
	JakPal.move(175);
	JakPal.turn(90);
	JakPal.move(175);
	JakPal.setAngle(0);
	for(int i=0; i<180 ;i++) {
		JakPal.move(1);
		JakPal.turn(360/360);
	}
	JakPal.moveTo(500, 500);
}
}
