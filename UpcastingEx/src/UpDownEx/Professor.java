package UpDownEx;

public class Professor extends Researcher {
    private String university;
    private String country;

    public String getUniversity(){
        return university;
    }
    public String getCountry(){
        return country;
    }
    public void setUniversity(String university){
        this.university=university;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public Professor(){
        university="EWHA";
        country="Korea";
    }
    public Professor(String name, String iD, String major, int career, String university, String country){
        this.university=university;
        this.country=country;
    }
}
