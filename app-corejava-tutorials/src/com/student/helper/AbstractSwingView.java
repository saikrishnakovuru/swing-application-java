package com.student.helper;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class AbstractSwingView {
	protected JFrame frame;

	public AbstractSwingView() {
		frame = new JFrame();
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setTitle(setFrameTitle());
//		frame.setContentPane(buildView());
	}

	protected abstract JPanel buildView();

	public String setFrameTitle() {
		return "";
	}
//		frame.setTitle(title);

//	protected JPanel buildView() {
//		return null;
//	}

}
