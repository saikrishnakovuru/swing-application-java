package com.student.adminview.impl;

import com.student.adminview.StudentAdminViewPresenter;
import com.student.adminview.StudentAdminViewUi;
import com.student.homepage.StudentHomePagePresenter;

public class StudentAdminViewPresenterImpl implements StudentAdminViewPresenter {

	private StudentHomePagePresenter homePagePresenter;
	private StudentAdminViewUi adminView;

	public StudentAdminViewPresenterImpl(StudentHomePagePresenter homePagePresenter, StudentAdminViewUi adminViewUi) {
		this.homePagePresenter = homePagePresenter;
		this.adminView = adminViewUi;
		setNames();
	}

	private void setNames() {
//		adminView.getSaveAndCloseButton().setName("asdf");
//		adminView.getFrame().setName("adminView");
	}

	@Override
	public void enablingAdminViewButtonInHomePageView() {
		homePagePresenter.isAdminViewOpen(!adminView.getFrame().isShowing());
	}

}
