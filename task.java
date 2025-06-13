
import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int num = sc.nextInt();

        for(int i=1; i<=num; i++){
          System.out.println(i+(i%2==0 ? "is even":"is odd"));
        }
          
        sc.close();
        
        
    }

}
