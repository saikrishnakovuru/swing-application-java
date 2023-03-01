package com.student.helper;

import javax.swing.JComponent;
import javax.swing.JFrame;

public abstract class AbstractSwingView {
	protected JFrame frame;
	
	public AbstractSwingView() {
		frame = new JFrame();
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	protected abstract JComponent buildView();

}
