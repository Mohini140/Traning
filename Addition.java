
import java.util.Scanner;

public class Addition {
    static int Addition(int a,int b){
        return a+b;
    }
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the value of a");
    int a = sc.nextInt();

    System.out.println("Enter the value of b");
    int b = sc.nextInt();

    System.out.println("Result");
    System.out.println(Addition(a,b));
}    

}
