package com.student.studentview.impl;

import com.student.homepage.StudentHomePagePresenter;
import com.student.homepage.impl.Student;
import com.student.studentview.StudentViewFactory;
import com.student.studentview.StudentViewModel;
import com.student.studentview.StudentViewPresenter;
import com.student.studentview.StudentViewUi;

public class DefaultStudentViewFactoryImpl implements StudentViewFactory {

	@Override
	public void createView(StudentHomePagePresenter studenetHomePagePresenter, Student student) {
		StudentViewUi view = new SwingStudentViewImpl();
		StudentViewModel model = new StudentViewModelImpl(view);
		StudentViewPresenter presenter = new StudentViewPresenterImpl(view, studenetHomePagePresenter, model);

		new StudentViewGlue(view, presenter);

	}

}
