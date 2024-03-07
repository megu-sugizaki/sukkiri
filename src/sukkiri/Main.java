package sukkiri;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main{
	public static void main (String[] args) throws Exception{
		JFrame frame = new JFrame("はじめてのGUI");
		JLabel label = new JLabel("Hello World!");
		JButton button = new JButton("押してね");
		frame.getContentPane().setLayout(new_FlowLayout());
		frame.getContentPane().add(label);
		frame.getContentPane().add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}