package com.Ludo.game;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.*;

public class DesignLudo extends JFrame {
	DesignLudo() {
		this.add(new Decorate());
	}

	public static void main(String[] args) {
		DesignLudo frame = new DesignLudo();
		frame.setTitle("Dice Roller");
		frame.setSize(550,573);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

	}
	class Decorate extends JPanel {
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			fourBody(g);
			fourWhiteInnerBody(g);
			GotiBox(g);
			GotiLadder(g);
			oneTwoLadder(g);
			twoThreeLadder(g);
			threeFourLadder(g);
			fourOneLadder(g);
			mediator(g);
		}
		
		public void mediator(Graphics g) {
			g.setColor(Color.YELLOW);
			g.fillRect(200, 200, 133, 133);
			g.setColor(Color.BLUE);
			g.fillOval(218, 218, 100, 100);
			g.setColor(Color.GREEN);
			g.setFont(new Font("Serif", Font.BOLD, 20));
			g.drawString("HOME", 240, 275);
		}
		
		public void oneTwoLadder(Graphics g) {
			for(int i=1; i<3; i++) {
				int j = 44;
				g.drawLine((200 + j * i), 0, (200 + j * i), 200);
			}
			for(int i=1; i<6; i++) {
				int j = 33;
				g.drawLine(200, (0 + j * i), 333, (0 + j * i));
			}
		}
		
		public void twoThreeLadder(Graphics g) {
			for(int i=1; i<3; i++) {
				int j = 44;
				g.drawLine(333, (200 + j * i), 533,(200 + j * i));
			}
			
			for(int i=1; i<6; i++) {
				int j = 33;
				g.drawLine((333 + j * i), 200, (333 + j * i), 333);
			}
			
		}
		
		public void threeFourLadder(Graphics g) {
			for(int i=1; i<3; i++) {
				int j = 44;
				g.drawLine((200 + j * i), 333, (200 + j * i), 533);
			}
			for(int i=1; i<6; i++) {
				int j = 33;
				g.drawLine(200, (333 + j * i), 333, (333 + j * i));
			}
		}
		
		public void fourOneLadder(Graphics g) {
			for(int i=1; i<3; i++) {
				int j = 44;
				g.drawLine(0, (200 + j * i), 200,(200 + j * i));
			}
			
			for(int i=1; i<6; i++) {
				int j = 33;
				g.drawLine((0 + j * i), 200, (0 + j * i), 333);
			}
		}
		
		public void GotiLadder(Graphics g) {
			g.setColor(Color.BLUE);
			g.drawRect(200, 0, 133, 200); // one-two
			g.drawRect(333, 200, 200, 133); // two-three
			g.drawRect(200, 333, 133, 200); // three-four
			g.drawRect(0, 200, 200, 133); // four-one
			
		}
		
		public void fourBody(Graphics g) {
			//outer box four body at corner
			g.setColor(Color.RED);
			g.fillRect(0, 0, 200, 200);
			g.setColor(Color.BLUE);
			g.fillRect(333, 0, 200, 200);
			g.setColor(Color.GREEN);
			g.fillRect(0, 333, 200, 200);
			g.setColor(Color.YELLOW);
			g.fillRect(333, 333, 200, 200);
		}
		
		public void fourWhiteInnerBody(Graphics g) {
			//second layer or inner layer of fourbody, difference of 30 in addition with fourBody
			g.setColor(Color.WHITE);
			g.fillRect(30, 30, 135, 135);
			g.fillRect(363, 30, 135, 135);
			g.fillRect(30, 363, 135, 135);
			g.fillRect(363, 363, 135, 135);
		}
		public void GotiBox(Graphics g) {
			//this is a method of gotiBox which is combination of four box where we keep the goti
			//third layer inner first goti box
			g.setColor(Color.RED);
			g.drawRect(63, 63, 20, 20);
			g.setColor(Color.BLUE);
			g.drawRect(396, 63, 20, 20);
			g.setColor(Color.GREEN);
			g.drawRect(63, 393, 20, 20);
			g.setColor(Color.YELLOW);
			g.drawRect(393, 393, 20, 20);
			//third layer inner second goti box
			g.setColor(Color.RED);
			g.drawRect(113, 63, 20, 20);
			g.setColor(Color.BLUE);
			g.drawRect(443, 63, 20, 20);
			g.setColor(Color.GREEN);
			g.drawRect(113, 393, 20, 20);
			g.setColor(Color.YELLOW);
			g.drawRect(443, 393, 20, 20);
			//third layer inner third goti box
			g.setColor(Color.RED);
			g.drawRect(63, 113, 20, 20);
			g.setColor(Color.BLUE);
			g.drawRect(396, 113, 20, 20);
			g.setColor(Color.GREEN);
			g.drawRect(63, 443, 20, 20);
			g.setColor(Color.YELLOW);
			g.drawRect(393, 443, 20, 20);
			//third layer inner fourth goti box
			g.setColor(Color.RED);
			g.drawRect(113, 113, 20, 20);
			g.setColor(Color.BLUE);
			g.drawRect(446, 113, 20, 20);
			g.setColor(Color.GREEN);
			g.drawRect(113, 443, 20, 20);
			g.setColor(Color.YELLOW);
			g.drawRect(443, 443, 20, 20);
		}
	}
}
