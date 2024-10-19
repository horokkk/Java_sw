package UpDownEx;
public class Person {

    private String name;
    private int age;
    private String gender;

    public Person(){
        name = "김지윤";
        age = 25;
        gender = "female";
    }

    public Person(String name, int age){
        this.name=name;
        this.age=age;
        this.gender = "female";
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age=age;;
    }

    public int getAge(){
        return age;
    }

    public void setGender(String gender){
        this.gender=gender;;
    }

    public String getGender(){
        return gender;
    }

}

