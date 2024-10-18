public class President extends Professor {
    String univ, vision;

    public President(String name){
        super(name);
    }

    public President(String name, String univ){
        this(name, univ, "착하게 살자");
    }
    
    public President(String name, String univ, String vision){
        super(name);
        this.univ=univ;
        this.vision=vision;
    }

    public void getInfo(){
        System.out.print("President : " + name);
        System.out.print(" Univesity: " + univ);
        System.out.println(" Vision : " + vision);
    }
}
