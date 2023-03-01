package com.student.studentview.impl;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComponent;
import javax.swing.text.JTextComponent;

import org.jdesktop.swingx.prompt.PromptSupport;

import com.student.homepage.StudentHomePagePresenter;
import com.student.studentview.StudentViewModel;
import com.student.studentview.StudentViewPresenter;
import com.student.studentview.StudentViewUi;

public class StudentViewPresenterImpl implements StudentViewPresenter {

	private StudentViewUi view;
	private StudentHomePagePresenter homePagePresenter;
	private StudentViewModel model;
	private List<Component> listOfMandatoryConponents;

	public StudentViewPresenterImpl(StudentViewUi view, StudentHomePagePresenter homePagePresenter,
			StudentViewModel model) {

		this.view = view;
		this.homePagePresenter = homePagePresenter;
		this.model = model;
		listOfMandatoryConponents = new ArrayList<Component>();

		setFramesTitle();
		setHintTextsToFields();
		addMandatoryFields(view.getStudentNameField(), view.getDescriptionArea());
	}

	private void setHintTextsToFields() {
		PromptSupport.setPrompt("please enter the name", view.getStudentNameField());
		PromptSupport.setPrompt("Describe yourselves here", view.getDescriptionArea());
	}

	private void updateToolTipsToSaveAndCloseButton(boolean isViewValid) {

		if (!isViewValid) {
			StringBuilder sb = new StringBuilder("<html>");
			sb.append("please fill " + "<br>");
			for (Component c : listOfMandatoryConponents) {
				if (c instanceof JTextComponent) {
					JTextComponent com = (JTextComponent) c;
					if (com.getText().isEmpty())
						sb.append(com.getName() + "<br>");
				}
			}
			view.getSaveAndCloseButton().setToolTipText(sb.toString());
		} else
			view.getSaveAndCloseButton().setToolTipText(null);

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

	private void setButtonStates(boolean isViewValid) {

		view.getSaveAndCloseButton().setEnabled(isViewValid);
		updateToolTipsToSaveAndCloseButton(isViewValid);
	}

	private void addMandatoryFields(JComponent... components) {
		for (Component com : components) {
			listOfMandatoryConponents.add(com);
			if (com instanceof JTextComponent) {
				JTextComponent c = (JTextComponent) com;
				c.setBackground(new Color(255, 255, 224));
			}
			setButtonStates(canSave());
		}

	}

}
