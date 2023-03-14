package com.student.helper;

import javax.swing.JFrame;
import javax.swing.JPanel;

public abstract class AbstractSwingView {
	protected JFrame frame = new JFrame();

	public AbstractSwingView() {
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
//		frame.setContentPane(buildView());
	}

//	protected abstract JComponent buildView();

	protected JPanel buildView() {
		return null;
	}
}
