package com.danuja.my_first_springboot;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(long id) {
        super("Meeting " + id + "does not found.");
    }
}
