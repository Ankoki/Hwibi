package com.ankoki.회비;

import javax.swing.*;
import java.awt.*;

public class 구이 {

	private final JFrame frame;
	private final JLabel label;
	private boolean ready;

	public 구이() {
		frame_setup : {
			this.frame = new JFrame("회비");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(350, 500);
			frame.setBackground(Color.GRAY);
			frame.setLocationRelativeTo(null);
		}
		text_setup : {
			this.label = new JLabel("회비");
			label.setFont(new Font("monospaced", Font.BOLD, 100));
			label.setVerticalAlignment(JLabel.TOP);
			label.setHorizontalAlignment(JLabel.CENTER);
		}
		adding_components : {
			this.frame.getContentPane().add(label);
		}
		ready = true;
	}

	public boolean isReady() {
		return ready;
	}

	public void reveal() {
		frame.setVisible(true);
	}

}
