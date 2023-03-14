package com.student.homepage.impl;

import com.student.adminview.StudentAdminViewFactory;
import com.student.adminview.impl.StudentAdminViewFactoryImpl;
import com.student.homepage.StudentHomePageFactory;
import com.student.homepage.StudentHomePagePresenter;
import com.student.homepage.SwingStudentHomePageView;
import com.student.studentview.StudentViewFactory;
import com.student.studentview.impl.DefaultStudentViewFactoryImpl;

public class DefaultStudentHomePageFactoryImpl implements StudentHomePageFactory {

	@Override
	public void createView(Student student) {
		StudentViewFactory studentViewFactory = new DefaultStudentViewFactoryImpl();
		StudentAdminViewFactory adminViewFacory = new StudentAdminViewFactoryImpl();
		SwingStudentHomePageView view = new SwingStudentHomePageViewImpl();
		new StudentHomePageModelImpl();
		StudentHomePagePresenter presenter = new StudentHomePagePresenterImpl(view);
		new StudentHomePageGlue(view, studentViewFactory, presenter, adminViewFacory, student);
	}
}
