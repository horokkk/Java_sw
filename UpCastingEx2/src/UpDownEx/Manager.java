package UpDownEx;

public class Manager extends Employee{

    private int count;

    public Manager(){
        count = 0;
    }

    public Manager(int salary, int count){
        super(salary);
        this.count=count;
    }

    public void setCount(int count){
        this.count=count;
    }

    public int getCount(){
        return count;
    }

}
