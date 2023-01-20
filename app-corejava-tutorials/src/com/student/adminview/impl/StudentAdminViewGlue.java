package com.student.adminview.impl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.student.adminview.StudentAdminViewPresenter;
import com.student.adminview.StudentAdminViewUi;

public class StudentAdminViewGlue {

	private StudentAdminViewUi adminView;
	private StudentAdminViewPresenter adminPresenter;

	public StudentAdminViewGlue(StudentAdminViewUi adminview, StudentAdminViewPresenter adminPresenter) {
		this.adminView = adminview;
		this.adminPresenter = adminPresenter;
		actions();
	}

	private void actions() {
		adminView.getSaveAndCloseButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminView.getFrame().dispose();
				adminPresenter.enablingAdminViewButtonInHomePageView();

			}
		});

		adminView.getCancelButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adminView.getFrame().dispose();
			}
		});
	}
}
