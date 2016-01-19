import javax.swing.JFrame;


public class main {

	public static void main(String[] args) {
		gui calInterface = new gui();
		calInterface.setSize(250, 300);
		calInterface.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		calInterface.setVisible(true);
		calInterface.setResizable(false);
	}

}
