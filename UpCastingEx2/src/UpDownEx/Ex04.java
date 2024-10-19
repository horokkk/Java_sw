package UpDownEx;

public class Ex04 {
    public static void main(String[] args) {
        Person p = new Employee("김지상", 24, 1, "10/24");

        p.setName("김짖챵");
        System.out.println(((Employee) p).getHiredate());

    }
}
