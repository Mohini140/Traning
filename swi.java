
import java.util.Scanner;

public class swi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a button number(1-2):");
        int button=sc.nextInt();
        switch (button){
            case 1:
                    System.out.println("Hello");
                    break;
            case 2:
                    System.out.println("Good morning");
                    break;
            default:
                    System.out.println("Invalid");                

        }

    }

}
