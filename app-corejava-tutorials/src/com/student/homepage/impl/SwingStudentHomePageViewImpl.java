package com.student.homepage.impl;

import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.student.homepage.SwingStudentHomePageView;

public class SwingStudentHomePageViewImpl implements SwingStudentHomePageView {
	private JFrame frame;
	private JButton studentView;
	private JButton adminView;
	private JLabel label;
	private JTextArea textArea;

	public SwingStudentHomePageViewImpl() {
		frame = new JFrame();
		studentView = new JButton();
		adminView = new JButton();
		textArea = new JTextArea();
		label = new JLabel("Kindly click any of the below buttons to enter into their respective modes");
		creteView();
	}

	private void creteView() {
		frame.add(buildView());
		frame.setSize(450, 150);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}

	@Override
	public JComponent buildView() {
		DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("f:1:g", "p,4dlu,f:1:g,8dlu,p"));
		CellConstraints cc = new CellConstraints();
		builder.add(label, cc.xy(1, 1));
		builder.add(textArea, cc.xy(1, 3));
		builder.add(createButtons(), cc.xy(1, 5));
		builder.setBorder(new EmptyBorder(4, 10, 4, 12));
		return builder.getPanel();
	}

	private Component createButtons() {
		DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("p,4dlu,p", "p"));
		CellConstraints cc = new CellConstraints();
		builder.add(studentView, cc.xy(1, 1));
		builder.add(adminView, cc.xy(3, 1));
		return builder.getPanel();
	}

	@Override
	public JButton getStudentViewButton() {
		return studentView;
	}

	@Override
	public JButton getAdminViewButton() {
		return adminView;
	}

	@Override
	public JFrame getFrame() {
		return frame;
	}

	@Override
	public JTextArea getTextArea() {
		return textArea;
	}
}
