package com.student.homepage.impl;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JList;

import com.student.homepage.StudentHomePagePresenter;
import com.student.homepage.SwingStudentHomePageView;

public class StudentHomePagePresenterImpl implements StudentHomePagePresenter {

	private SwingStudentHomePageView view;
	private Student student;
	private List<Student> studentList;
	private String data;
	private JList<String> list;

	public StudentHomePagePresenterImpl(SwingStudentHomePageView view) {
		this.view = view;
		studentList = new ArrayList<Student>();
		list  = new JList<>();
		data = new String();
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
		studentList.add(student);
		view.getTextArea().setText(details());
//		view.getTextArea().setText(student.toString());

	}

	@Override
	public void setStudent(Student student) {
		this.student = student;
	}

	private String details() {

//		for (Student stu : studentList) {
//			view.getTextArea().setText("");
		return data += "My name is " + student.getName() + ", " + student.getGender() + ", I chose "
				+ student.getDepartment() + "  department and to describe myself  " + student.getDescription() + "\n";
//		}
//		return data;
	}
}
