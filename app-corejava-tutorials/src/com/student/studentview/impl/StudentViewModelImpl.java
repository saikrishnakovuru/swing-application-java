package com.student.studentview.impl;

import java.util.Arrays;

import com.student.homepage.StudentHomePagePresenter;
import com.student.homepage.impl.Student;
import com.student.studentview.StudentViewModel;
import com.student.studentview.StudentViewUi;

public class StudentViewModelImpl implements StudentViewModel {

	private StudentViewUi view;
	private String gender;
	private Student student;

	public StudentViewModelImpl(StudentViewUi view) {
		this.view = view;
		setValuesToComboBox();
	}

	private void setValuesToComboBox() {
		String[] items = { "Electronics", "Electrical", "Computers", "Information Technology" };
//		for (String values : items) {
//			view.getComboBox().addItem(values);
//		}

		Arrays.stream(items).forEach(item -> view.getComboBox().addItem(item));
	}

	@Override
	public void printSavedDetailsOnHomePageViewTextField(StudentHomePagePresenter homePagePresenter) {

		gender = view.getFemaleRadioButton().isSelected() ? view.getFemaleRadioButton().getText()
				: view.getMaleRadioButton().getText();
		student = new Student();
		student.setName(view.getStudentNameField().getText());
		student.setGender(gender);
		student.setDepartment(view.getComboBox().getSelectedItem().toString());
		student.setDescription(view.getDescriptionArea().getText());
		homePagePresenter.setStudent(this.student);
	}

}
