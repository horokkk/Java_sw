package UpDownEx;

public class Employee extends Person {

    private int salary;
    private String hiredate;

    public Employee(){
        super();  // 명시적으로 부모 클래스의 기본 생성자 호출
        this.salary = 0;
        this.hiredate = "10/21";
    }

    public Employee(int salary, String hiredate){
        super();  // 부모 클래스 기본 생성자 호출하여 name, age 초기화
        this.salary=salary;
        this.hiredate=hiredate;
    }

    public Employee(int salary){
        this();
        this.salary=salary; //추가함
    }

    public Employee(String name, int age, int salary, String hiredate){
        super(name, age);
        this.salary=salary;
        this.hiredate=hiredate;
    }

    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }

    public void setHiredate(String hiredate){
        this.hiredate=hiredate;
    }

    public String getHiredate(){
        return hiredate;
    }
}
