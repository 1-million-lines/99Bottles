import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Beer extends JFrame {
	private int numberOfBottles;
	private JTextArea text;

	public static void main(final String... args) {
		new Beer().setVisible(true);
	}

	public Beer() {
		numberOfBottles = 99;

		JButton take = new JButton("Take one down, pass it around");
		take.addActionListener(this::onTakeClick);

		text = new JTextArea(4, 30);
		text.setText(numberOfBottles + " bottles of beer on the wall\n" + 
			numberOfBottles + " bottles of beer");
		text.setEditable(false);

		setLayout(new BorderLayout());
		add(text, BorderLayout.CENTER);
		add(take, BorderLayout.PAGE_END);
		pack();
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void onTakeClick(ActionEvent event) {
		JOptionPane.showMessageDialog(null, --numberOfBottles + " bottles of beer on the wall");
		text.setText(numberOfBottles + " bottles of beer on the wall\n" + 
			numberOfBottles + " bottles of beer");
		if (numberOfBottles == 0) dispose();
	}
}
