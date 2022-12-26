package com.student.homepage.impl;

import com.student.homepage.StudentHomePagePresenter;
import com.student.homepage.SwingStudentHomePageView;

public class StudentHomePagePresenterImpl implements StudentHomePagePresenter {

	private SwingStudentHomePageView view;
	private Student student;

	public StudentHomePagePresenterImpl(SwingStudentHomePageView view, Student student) {
		this.view = view;
//		this.student = student;
		setHomePageTitle();
	}

	private void setHomePageTitle() {
		view.getFrame().setTitle("Home Page");
		view.getStudentViewButton().setText("Student View");
		view.getAdminViewButton().setText("Admin View");
		view.getTextArea().setEditable(false);
	}

	@Override
	public void isAdminViewOpen(boolean isAdminViewOpen) {
		view.getAdminViewButton().setEnabled(isAdminViewOpen);
	}

	@Override
	public void isStudentViewOpen(boolean isStudentViewOpen) {
		view.getStudentViewButton().setEnabled(isStudentViewOpen);
	}

	@Override
	public void updateStudentDetailsOnView() {
		view.getTextArea().setText("My name is " + student.getName() + ", " + student.getGender() + ", I chose "
				+ student.getDepartment() + "  department and to describe myself  " + student.getDescription());
	}

	@Override
	public void setStudent(Student student) {
		this.student = student;
	}

}
