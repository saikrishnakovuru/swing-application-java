package com.student.studentview.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.student.studentview.StudentViewPresenter;
import com.student.studentview.StudentViewUi;

public class StudentViewGlue {

	private StudentViewUi view;
	private StudentViewPresenter presenter;

	public StudentViewGlue(StudentViewUi view, StudentViewPresenter presenter) {
		this.view = view;
		this.presenter = presenter;
		actions();
	}

	private void actions() {

		view.getSaveAndCloseButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getFrame().dispose();
				presenter.enablingStudentViewButtonInHomePageView();
				presenter.printSavedDetialsOnConsole();
				presenter.setStudentDetailsOnHomePageView();

			}
		});

		view.getCancelButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getFrame().dispose();
				presenter.enablingStudentViewButtonInHomePageView();
			}
		});

		view.getFemaleRadioButton().addActionListener(new CustomizedActionListener());
		view.getMaleRadioButton().addActionListener(new CustomizedActionListener());
		view.getStudentNameField().getDocument().addDocumentListener(new CustomizedDocumentListener());
		view.getDescriptionArea().getDocument().addDocumentListener(new CustomizedDocumentListener());

	}

	public class CustomizedDocumentListener implements DocumentListener {

		@Override
		public void changedUpdate(DocumentEvent arg0) {
			presenter.setInvalidCOlorsToTextFieldsWichAreMandatory();

		}

		@Override
		public void insertUpdate(DocumentEvent arg0) {
			presenter.setInvalidCOlorsToTextFieldsWichAreMandatory();

		}

		@Override
		public void removeUpdate(DocumentEvent arg0) {
			presenter.setInvalidCOlorsToTextFieldsWichAreMandatory();
		}

	}

	public class CustomizedActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if (view.getFemaleRadioButton().isSelected())
				System.out.println("female");
			else
				System.out.println("male");
		}

	}

}
