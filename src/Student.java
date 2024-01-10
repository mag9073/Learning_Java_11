public class Student {
    // this is part of chapter 6: classes in java
    // attribute/property; instance data type
    // non-static variable

    String firstName; // attribute variable for first name
    String lastName; // attribute variable for last name
    int expectedYearToGraduate; // attribute variable for expected year to graduate
    double studentGPA; // attribute variable for student GPA
    String declaredMajor; // attribute variable for declared major


    // constuctor; allows creation of instances
    // initializes all attributes with dynamic values
    // the values the constructor is called with will determine the values of the attributes
    public Student(String firstName, String lastName, int expectedYearToGraduate, double studentGPA, String declaredMajor) {
    this.firstName = firstName; // using inputs to assign variable to attribute first name
    this.lastName = lastName; // using inputs to assign variable to attribute last name
    this.expectedYearToGraduate = expectedYearToGraduate; // using inputs to assign variable to expected year to graduate
    this.studentGPA = studentGPA; // using inputs to assign variable to student GPA
    this.declaredMajor = declaredMajor; // using inputs to assign variable to declared major
    }

    // method/behaviour or function belonging to class
    public void incrementYearToGraduate() {
        this.expectedYearToGraduate = this.expectedYearToGraduate +1; // access expected year to graduate using the this keyword
    }

}
