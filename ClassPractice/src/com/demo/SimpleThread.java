package com.demo;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/*
 <applet code="com.demo.SimpleThread" width="900" height="900"> 
 </applet>
 */

public class SimpleThread extends Applet implements Runnable {
	
	Thread t;
	int x, y, w, h;
	
	
	public void init() {
		setBackground(Color.gray);
		x = 20;
		y = 40;
		w = 75;
		h = 75;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		for(int i=21;i<=800;i++) {
			x = i;
			repaint();
			if(x == 800) {
				i = 21;
				y += 50;
			}
			try{
				Thread.sleep(10);
			} catch(Exception e) {}
		}
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.white);
		g.drawOval(x, y, w, h);
	}
	

}
