package com.epam.mjc;

public class CouldNotFindStudentException extends IllegalArgumentException {
    private static final String MESSAGE = "Could not find student with ID ";
    public CouldNotFindStudentException(long studentID) {
        super(MESSAGE + studentID);
    }
}
