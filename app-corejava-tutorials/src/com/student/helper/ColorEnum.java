package com.student.helper;

public enum ColorEnum {

	INVALID, VALID;

//	public ColorEnum isInvalid() {
//		return INVALID;
//	}

//	public ColorEnum isValid() {
//		return VALID;
//	}

	public boolean isInvalid() {
		return this == ColorEnum.INVALID;
	}

	public boolean isValid() {
		return this == ColorEnum.VALID;
	}
}
