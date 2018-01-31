    import javax.swing.JOptionPane;

    public class VotingBooth {
	public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("How old are you?");
    int age = Integer.parseInt(input);
    if(age<18)
    {
	System.out.println("Nobody cares what you think");
    }
    if(age>=18)
    System.out.println("Who do you want to be the next President?");
	}
}