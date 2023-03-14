package com.student.homepage;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JTextArea;

public interface SwingStudentHomePageView {

	JButton getStudentViewButton();

	JButton getAdminViewButton();

	JFrame getFrame();

	JTextArea getTextArea();

	JList getJlist();

}
