public class program {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.color="blue";
        p1.type="ballpen";
        p1.brand="Rorito";
        System.out.println(p1.color);
        System.out.println(p1.type);
        System.out.println(p1.brand);
        p1.write();
        
    }

}
class Pen{
    String color;
    String type;
    String brand;
    public void write(){
        System.out.println("Writting something");
    }
}