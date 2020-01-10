package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {

    private String courseName;
    private double creditHours;
    private HashMap<Integer, Student> studentRoster = new HashMap<>();

    public Course (String courseName, int creditHours, HashMap<Integer, Student> studentRoster) {
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.studentRoster = studentRoster;
    }

    public String getCourseName() {return courseName;}
    public double getCreditHours() {return creditHours;}
    public HashMap<Integer, Student> getStudentRoster() {return studentRoster;}

    private void setCourseName(String aCourseName) {this.courseName = aCourseName;}
    private void setCreditHours(int someCreditHours) {this.creditHours = someCreditHours;}
    private void setStudentRoster(Integer studentId, Student someStudent) {this.studentRoster.put(studentId, someStudent);}
}
