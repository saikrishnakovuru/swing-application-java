package com.student.helper;

import java.awt.Color;

public enum ColorEnum {

	INVALID(Color.YELLOW), VALID(Color.WHITE);

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
