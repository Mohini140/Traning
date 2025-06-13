
import java.util.Scanner;

public class prime {
    public static int isPrime(int n) {
       int count = 0;
       for(int i = 1; i<=n ;i++)
           if(n%i==0)
           count++;
        return count;   
  }
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();
      System.out.println(isPrime(num)==2 ? "Prime": "Not prime");
  }

}
