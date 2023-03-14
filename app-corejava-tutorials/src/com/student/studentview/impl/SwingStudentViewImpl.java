package com.student.studentview.impl;

import java.awt.Component;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.CellConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.student.helper.AbstractSwingView;
import com.student.studentview.StudentViewUi;

public class SwingStudentViewImpl extends AbstractSwingView implements StudentViewUi {

//	protected JFrame frame;
	private JLabel studentNameLabel;
	private JTextField studentNameField;
	private JRadioButton male;
	private JRadioButton female;
	protected JButton saveAndCloseButton;
	protected JButton cancel;
	private JComboBox<String> comboBox;
	private JTextArea descriptionArea;
	private ButtonGroup buttonGroup;

	public SwingStudentViewImpl() {
		studentNameLabel = new JLabel("Please enter your name :");
		studentNameField = new JTextField();
		studentNameField.setName("studentName field");
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(female);
		buttonGroup.add(male);
		saveAndCloseButton = new JButton();
		saveAndCloseButton.setText("studentSaveAndClose");
		cancel = new JButton("cancel");
		comboBox = new JComboBox<String>();
		descriptionArea = new JTextArea();
		descriptionArea.setName("Description ");
		frame.setContentPane(buildView());
	}

	@Override
	protected JPanel buildView() {
		DefaultFormBuilder builder = new DefaultFormBuilder(
				new FormLayout("f:1:g", "p,4dlu,p,4dlu,p,4dlu,f:1:g,4dlu,p"));
		CellConstraints cc = new CellConstraints();

		builder.add(createStudentNameFiled(), cc.xy(1, 1));
		builder.add(createRadioGroupComponet(), cc.xy(1, 3));
		builder.add(createcomboBox(), cc.xy(1, 5));
		builder.add(createTextArea(), cc.xy(1, 7));

		builder.add(createSaveCloseAndCancelButtons(), cc.xy(1, 9, CellConstraints.RIGHT, CellConstraints.DEFAULT));
		builder.setBorder(new EmptyBorder(10, 10, 4, 12));
		return builder.getPanel();
	}

	private Component createTextArea() {
		DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("f:1:g", "f:1:g"));
		CellConstraints cc = new CellConstraints();

		builder.add(descriptionArea, cc.xy(1, 1));
		builder.setBorder(new EmptyBorder(4, 4, 4, 4));

		return builder.getPanel();
	}

	private Component createStudentNameFiled() {
		DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("p,2dlu,f:1:g", "p,4dlu,p"));
		CellConstraints cc = new CellConstraints();
		builder.add(studentNameLabel, cc.xy(1, 1));
		builder.add(studentNameField, cc.xy(3, 1));

		return builder.getPanel();
	}

	private Component createRadioGroupComponet() {
		DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("p,4dlu,p,p", "p"));
		CellConstraints cc = new CellConstraints();
		builder.add(new JLabel("Gender :"), cc.xy(1, 1));
		builder.add(male, cc.xy(3, 1));
		builder.add(female, cc.xy(4, 1));
		return builder.getPanel();
	}

	protected Component createSaveCloseAndCancelButtons() {
		DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("p,2dlu,p", "p"));
		CellConstraints cc = new CellConstraints();
		builder.add(saveAndCloseButton, cc.xy(1, 1));
		builder.add(cancel, cc.xy(3, 1));
		return builder.getPanel();
	}

	private Component createcomboBox() {
		DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("p", "p"));
		CellConstraints cc = new CellConstraints();
		builder.add(comboBox, cc.xy(1, 1));
		return builder.getPanel();
	}

	@Override
	public JButton getSaveAndCloseButton() {
		return saveAndCloseButton;
	}

	@Override
	public JFrame getFrame() {
		return frame;
	}

	@Override
	public JComboBox<String> getComboBox() {
		return comboBox;
	}

	@Override
	public JTextArea getDescriptionArea() {
		return descriptionArea;
	}

	@Override
	public JTextField getStudentNameField() {
		return studentNameField;
	}

	@Override
	public JButton getCancelButton() {
		return cancel;
	}

	@Override
	public JRadioButton getMaleRadioButton() {
		return male;
	}

	@Override
	public JRadioButton getFemaleRadioButton() {
		return female;
	}
}
