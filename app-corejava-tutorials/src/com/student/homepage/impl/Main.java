package com.student.homepage.impl;

import com.student.homepage.StudentHomePageFactory;

public class Main {

    public static void main(String[] args) {
        StudentHomePageFactory factory = new DefaultStudentHomePageFactoryImpl();
        factory.createView(new Student());
    }
}
