package cz.nemecek.clickergame;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Panel;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GameFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame window = new GameFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GameFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel mainFramePanel = new Panel();
		mainFramePanel.setBounds(10, 10, 412, 235);
		frame.getContentPane().add(mainFramePanel);
		mainFramePanel.setLayout(null);
		
		final TextField textField = new TextField();
		textField.setBounds(165, 62, 79, 24);
		mainFramePanel.add(textField);
		
		Button changeTextButt = new Button("Change Text");
		changeTextButt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("Domograf");
			}
		});
		changeTextButt.setBounds(165, 103, 79, 24);
		mainFramePanel.add(changeTextButt);
	}
}
