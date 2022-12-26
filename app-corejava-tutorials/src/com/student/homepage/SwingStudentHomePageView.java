package com.student.homepage;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public interface SwingStudentHomePageView {

	JComponent buildView();

	JButton getStudentViewButton();

	JButton getAdminViewButton();

	JFrame getFrame();

	JTextArea getTextArea();
}
