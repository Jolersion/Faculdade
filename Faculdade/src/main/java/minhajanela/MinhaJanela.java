package minhajanela;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MinhaJanela extends JFrame {
	public MinhaJanela() throws HeadlessException {
		super("Apenas um teste");
		setLayout(new BorderLayout());
		setBounds(10, 10, 300, 200);
		JPanel jp = new JPanel(new FlowLayout());
		jp.add(new Button("OK"));
		jp.add(new Button("Cancela"));
		add(jp, "South");
	}

	public static void main(String[] args) {
		new MinhaJanela().setVisible(true);
	}
}
