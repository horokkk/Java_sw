package UpDownEx;
public class Person {
    private String name;
    private String iD;

    public String getName(){
        return name;
    }
    public String getID(){
        return iD;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setID(String iD){
        this.iD=iD;
    }
    public Person(){
        name = "EWHA";
        iD = "2176101";
    }
    public Person(String name, String iD){
        this.name = name;
        this.iD = iD;
    }
}
