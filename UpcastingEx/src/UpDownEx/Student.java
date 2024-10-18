package UpDownEx;

public class Student extends Person {
    private String grade;
    private String department;

    public String getGrade(){
        return grade;
    }
    public String getDepartment(){
        return department;
    }
    public void setGrade(String grade){
        this.grade=grade;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public Student(){
        grade = "A";
        department = "Computer Science";
    }
    public Student(String name, String iD, String grade, String department){
        this.grade=grade;
        this.department=department;
    }
}


