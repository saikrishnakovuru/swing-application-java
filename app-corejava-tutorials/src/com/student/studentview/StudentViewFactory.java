package com.student.studentview;

import com.student.homepage.StudentHomePagePresenter;
import com.student.homepage.impl.Student;

public interface StudentViewFactory {

	public void createView(StudentHomePagePresenter studenetHomePagePresenter,Student student);
}
