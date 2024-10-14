public class Circle1{
    int radius;
    String name;

    public Circle1(){}
    
    public double getArea(){
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        Circle1 pizza;
        pizza = new Circle1();
        pizza.radius = 10;
        pizza.name = "고구마 피자";
        double area = pizza.getArea();
        System.out.println(pizza.name + "의 면적은 " + area);

        Circle1 donut = new Circle1();
        donut.radius = 2;
        donut.name = "페퍼로니 피자";
        area = donut.getArea();
        System.out.println(donut.name + "의 면적은 " + area);
    }
}
