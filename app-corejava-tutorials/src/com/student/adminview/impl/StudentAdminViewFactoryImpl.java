package com.student.adminview.impl;

import com.student.adminview.StudentAdminViewFactory;
import com.student.adminview.StudentAdminViewPresenter;
import com.student.adminview.StudentAdminViewUi;
import com.student.homepage.StudentHomePagePresenter;

public class StudentAdminViewFactoryImpl implements StudentAdminViewFactory {

    @Override
    public void createView(StudentHomePagePresenter studenetHomePagePresenter) {
        StudentAdminViewUi view = new SwingStudentAdminViewUiImpl();
//        StudentAdminViewModel model = new StudentAdminViewModelImpl();
        StudentAdminViewPresenter presenter = new StudentAdminViewPresenterImpl(studenetHomePagePresenter, view);
        new StudentAdminViewGlue(view, presenter);

    }

}
