package OvverridingEx1;

public class Circle extends Shape{
    protected String name;

    public void draw(){
        name ="circle";
        super.name="shape";
        super.draw();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Shape b = new Circle();
        b.paint();
    }
}
