package com.student.studentview;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public interface StudentViewUi {

	JButton getSaveAndCloseButton();

	JFrame getFrame();

	JComboBox<String> getComboBox();

	JTextArea getDescriptionArea();

	JTextField getStudentNameField();

	public JButton getCancelButton();

	JRadioButton getMaleRadioButton();

	JRadioButton getFemaleRadioButton();
	
	ButtonGroup getButtonGroup();
	
	void setButtonGroup(ButtonGroup buttonGroup);

}
