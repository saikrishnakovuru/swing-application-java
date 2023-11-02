package com.student.helper;

import java.awt.Color;

public enum ColorEnum {

	INVALID(Color.yellow), VALID(Color.white);

	private Color color;

	ColorEnum(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}
}
