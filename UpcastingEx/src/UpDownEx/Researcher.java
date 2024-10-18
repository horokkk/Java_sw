package UpDownEx;

public class Researcher extends Person {
    private String major;
    private int career;

    public String getMajor(){
        return major;
    }
    public int getCareer(){
        return career;
    }
    public void setMajor(String major){
        this.major=major;
    }
    public void setCareer(int career){
        this.career=career;
    }
    public Researcher(){
        major="Computer Science";
        career=4;
    }
    public Researcher(String name, String iD, String major, int career){
        this.major=major;
        this.career=career;
    }
}
