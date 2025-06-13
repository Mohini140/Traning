public class object1 {

    String color;
    String model;

    void setDetails(String c, String m) {
        color = c;
        model = m;
    }

    void displayDetails() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Model: " + model);
    }

    public static void main(String[] args) {
        object car1 = new object();
        car1.setDetails("Red", "Honda City");
        car1.displayDetails();

        System.out.println();

        object car2 = new object();
        car2.setDetails("Blue", "Hyundai i20");
        car2.displayDetails();
    }
}

