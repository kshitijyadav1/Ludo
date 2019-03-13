package com.Ludo.game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
public class DiceRoller extends JFrame {
	String[] imgFile = {
			"C:/Users/samsung/EclipseWorkSplash/Ludo_v0.1_R190311/src/com/data/Graphics/one.gif",
			"C:/Users/samsung/EclipseWorkSplash/Ludo_v0.1_R190311/src/com/data/Graphics/two.gif",
			"C:/Users/samsung/EclipseWorkSplash/Ludo_v0.1_R190311/src/com/data/Graphics/three.gif",
			"C:/Users/samsung/EclipseWorkSplash/Ludo_v0.1_R190311/src/com/data/Graphics/four.gif",
			"C:/Users/samsung/EclipseWorkSplash/Ludo_v0.1_R190311/src/com/data/Graphics/five.gif",
			"C:/Users/samsung/EclipseWorkSplash/Ludo_v0.1_R190311/src/com/data/Graphics/six.gif",
	};
	protected Timer timer;
	protected int i = 0;
	protected int ranm = 0;
	protected Button button = new Button("Click Me");
	protected JLabel lbl = new JLabel(new ImageIcon(imgFile[0]));
	protected JLabel lbl2 = new JLabel("");
	DiceRoller() {
		this.add(lbl, BorderLayout.CENTER);
		this.add(button, BorderLayout.SOUTH);
		this.add(lbl2, BorderLayout.NORTH);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ranm = (int)(5 + Math.random() * 30); 
				// connect to the random number which roll the dice of random times.
				lbl2.setText("");
				if(i <= ranm) {
				timer = new Timer(100, new TimerListener());
				timer.start();
				}
			}
		});
		lbl.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ranm = (int)(Math.random() * 30); 
				//same here as above
				lbl2.setText("");
				if(i <= ranm) {
				timer = new Timer(100, new TimerListener());
				timer.start();
				}
			}
		});

		
	}
	
	public static void main(String[] args) {
		
		///design frame
		DiceRoller frame = new DiceRoller();
		frame.setTitle("Dice Roller");
		frame.setSize(400,400);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	
	
	class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			//animate frame
					int rand = (int)(0 + Math.random() * 6);
					lbl.setIcon(new ImageIcon(imgFile[rand]));
					
					System.out.println("+++++++++++++++++++++++++++++++++++" + i);
					i += 1;
					if(i == ranm) {
			        timer.stop();
			        lbl2.setText("You got " + (rand + 1));
			        i = 0;
					}
		}
	}

}
