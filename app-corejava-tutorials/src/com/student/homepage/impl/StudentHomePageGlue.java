package com.student.homepage.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.student.adminview.StudentAdminViewFactory;
import com.student.homepage.StudentHomePagePresenter;
import com.student.homepage.SwingStudentHomePageView;
import com.student.studentview.StudentViewFactory;

public class StudentHomePageGlue {
	private SwingStudentHomePageView view;
	private StudentViewFactory studentViewFactory;
	private StudentAdminViewFactory adminViewFactory;
	private StudentHomePagePresenter studenetHomePagePresenter;
	private Student student;

	public StudentHomePageGlue(SwingStudentHomePageView view, StudentViewFactory studentViewFactory,
			StudentHomePagePresenter studenetHomePagePresenter, StudentAdminViewFactory adminViewFactory,
			Student student) {
		this.view = view;
		this.studentViewFactory = studentViewFactory;
		this.studenetHomePagePresenter = studenetHomePagePresenter;
		this.adminViewFactory = adminViewFactory;
		this.student = student;
		actions();
	}

	private void actions() {
		view.getAdminViewButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getAdminViewButton().setEnabled(false);
				adminViewFactory.createView(studenetHomePagePresenter);
			}
		});

		view.getAdminViewButton().addActionListener(e -> {
			view.getAdminViewButton().setEnabled(false);
			adminViewFactory.createView(studenetHomePagePresenter);
		});

		view.getStudentViewButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				view.getStudentViewButton().setEnabled(false);
				studentViewFactory.createView(studenetHomePagePresenter, student);
			}
		});
	}

}
