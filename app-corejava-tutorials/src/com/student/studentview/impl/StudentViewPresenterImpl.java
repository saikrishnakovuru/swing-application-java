package com.student.studentview.impl;

import java.awt.Color;

import javax.swing.border.LineBorder;

import org.jdesktop.swingx.prompt.PromptSupport;

import com.student.homepage.StudentHomePagePresenter;
import com.student.studentview.StudentViewModel;
import com.student.studentview.StudentViewPresenter;
import com.student.studentview.StudentViewUi;

public class StudentViewPresenterImpl implements StudentViewPresenter {

	private StudentViewUi view;
	private StudentHomePagePresenter homePagePresenter;
	private StudentViewModel model;

	public StudentViewPresenterImpl(StudentViewUi view, StudentHomePagePresenter homePagePresenter,
			StudentViewModel model) {

		this.view = view;
		this.homePagePresenter = homePagePresenter;
		this.model = model;

		setFramesTitle();
		setHintTextsToFields();
		setToolTipsToFields();
		setInvalidCOlorsToTextFieldsWichAreMandatory();
	}

	private void setHintTextsToFields() {
		PromptSupport.setPrompt("please enter the name", view.getStudentNameField());
		PromptSupport.setForeground(new Color(160, 160, 160), view.getStudentNameField());

		PromptSupport.setPrompt("Describe yourselves here", view.getDescriptionArea());
		PromptSupport.setForeground(new Color(160, 160, 160), view.getDescriptionArea());

	}

	private void setToolTipsToFields() {
		view.getStudentNameField().setToolTipText("Enter your name");

		view.getSaveAndCloseButton().setToolTipText("Save and close");

		view.getDescriptionArea().setToolTipText(null);
		view.getDescriptionArea().setBorder(new LineBorder(Color.GRAY));
	}

	private void setFramesTitle() {
		view.getFrame().setTitle("Student View");
	}

	@Override
	public void enablingStudentViewButtonInHomePageView() {
		homePagePresenter.isStudentViewOpen(!view.getFrame().isShowing());
	}

	@Override
	public void setInvalidCOlorsToTextFieldsWichAreMandatory() {
		boolean isStudentNameFieldEmpty = view.getStudentNameField().getText().isEmpty();
		boolean isStudentDecriptionFieldEmpty = view.getDescriptionArea().getText().isEmpty();

		if (isStudentNameFieldEmpty)
			view.getStudentNameField().setBackground(new Color(255, 255, 224));
		else
			view.getStudentNameField().setBackground(new Color(255, 255, 255));

		if (isStudentDecriptionFieldEmpty)
			view.getDescriptionArea().setBackground(new Color(255, 255, 224));
		else
			view.getDescriptionArea().setBackground(new Color(255, 255, 255));

		setButtonStates(canSave());
	}

	private void setButtonStates(boolean isViewValid) {
		view.getSaveAndCloseButton().setEnabled(isViewValid);
	}

	@Override
	public boolean canSave() {
		return !view.getStudentNameField().getText().isEmpty() && !view.getDescriptionArea().getText().isEmpty();
	}

	@Override
	public void printSavedDetialsOnConsole() {
		model.printSavedDetailsOnHomePageViewTextField(homePagePresenter);
	}

	@Override
	public void setStudentDetailsOnHomePageView() {
		homePagePresenter.updateStudentDetailsOnView();
	}

}
