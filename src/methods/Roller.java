package methods;

import javax.swing.JOptionPane;

public class Roller {
public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("What's your height?");
	int height = Integer.parseInt(input);
	if(height<48) 
	{
	System.out.println("Come back when you've grown.");
	}
	if(height>=48)
	{
    System.out.println("You're tall enough to ride!");
	}
	
}
}
