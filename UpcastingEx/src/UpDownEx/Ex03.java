package UpDownEx;

public class Ex03 {
    public static void main(String[] args) {
        Person[][] ewha = new Person[4][1];

        ewha[0][0] = new Person("김지윤", "2176101");
        ewha[1][0] = new Student("김지윤", "2176101", "A", "computer science"); //업캐스팅1
        ewha[2][0] = new Researcher("김지윤", "2176101", "컴공", 3); //업캐스팅2
        ewha[3][0] = new Professor(); //업캐스팅3

        System.out.println("ewha[0][0] 입력값 이름, 나이 : " + ewha[0][0].getName() + " " + ewha[0][0].getID());
        System.out.println("ewha[1][0] 입력값 4개 : "+ewha[1][0].getName() + " " + ewha[1][0].getID() + " " +  ((Student) ewha[1][0]).getGrade() + " " + ((Student) ewha[1][0]).getDepartment()); //다운캐스팅1
        System.out.println("ewha[2][0] 입력값 4개 : "+ewha[2][0].getName() + " " + ewha[2][0].getID() + " " +  ((Researcher) ewha[2][0]).getMajor() + " " + ((Researcher) ewha[2][0]).getCareer()); //다운캐스팅2
        System.out.println("ewha[3][0] 입력값 2개 : "+((Professor)ewha[3][0]).getUniversity() + " " + ((Professor)ewha[3][0]).getCountry() + " " +  ((Researcher) ewha[2][0]).getMajor() + " " + ((Researcher) ewha[2][0]).getCareer());
        System.out.println(ewha[3][0].getName() + " " + ewha[3][0].getID());
    }   
}
