package com.student.helper;

import java.awt.Color;

public enum ColorEnum {

	INVALID(Color.blue), VALID(new Color(255, 255, 255));

	private final Color color;

	ColorEnum(Color color) {
		this.color = color;
	}

//	public boolean isInvalid() {
//		return this == ColorEnum.INVALID;
//	}
//
//	public boolean isValid() {
//		return this == ColorEnum.VALID;
//	}

	public Color getColor() {
		return color;
	}
}
