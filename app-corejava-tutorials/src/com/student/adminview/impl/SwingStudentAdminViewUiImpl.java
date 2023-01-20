package com.student.adminview.impl;

import javax.swing.JButton;
import javax.swing.JFrame;

import com.student.adminview.StudentAdminViewUi;
import com.student.studentview.impl.SwingStudentViewImpl;

public class SwingStudentAdminViewUiImpl extends SwingStudentViewImpl implements StudentAdminViewUi {

	public SwingStudentAdminViewUiImpl() {
//		frame = new JFrame();
		saveAndCloseButton.setText("AdminSaveAndClose");
		frame.setTitle("Admin view");
	}

//	protected JComponent buildView() {
//		DefaultFormBuilder builder = new DefaultFormBuilder(
//				new FormLayout("f:1:g", "p,4dlu,p,4dlu,p,4dlu,f:1:g,4dlu,p"));
//		CellConstraints cc = new CellConstraints();
//
//		builder.add(createStudentNameFiled(), cc.xy(1, 1));
//		builder.add(createRadioGroupComponet(), cc.xy(1, 3));
//		builder.add(createcomboBox(), cc.xy(1, 5));
//		builder.add(createTextArea(), cc.xy(1, 7));
//
//		builder.add(createSaveCloseAndCancelButtons(), cc.xy(1, 9, CellConstraints.RIGHT, CellConstraints.DEFAULT));
//		builder.setBorder(new EmptyBorder(10, 10, 4, 12));
//		return builder.getPanel();
//	}

//	protected Component createSaveCloseAndCancelButtons() {
//		DefaultFormBuilder builder = new DefaultFormBuilder(new FormLayout("p,2dlu,p", "p"));
//		CellConstraints cc = new CellConstraints();
//		builder.add(saveAndCloseButton, cc.xy(1, 1));
//		builder.add(cancel, cc.xy(3, 1));
//		return builder.getPanel();
//	}

}
