package com.student.homepage;

import com.student.homepage.impl.Student;

public interface StudentHomePagePresenter {

	void isAdminViewOpen(boolean isAdminViewOpen);

	void isStudentViewOpen(boolean isStudentViewOpen);

	void updateStudentDetailsOnView();

	void setStudent(Student student);
}
