
import java.util.Scanner;
public class two {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int n=2;
        int [][] matrix = new int [n][n];

        System.out.println("Enter the elements of 2*2 matrix:");
        
        for(int row= 0;row<n; row++){
            for(int col=0;col<n;col++){
                matrix[row][col]=sc.nextInt();

                
  }
            
        }

        System.out.println("Matrix is:");
        for(int row= 0;row<n; row++){
            for(int col=0;col<n;col++){
                System.out.print(matrix[row][col]+" ");
        
                  }
                  System.out.println();
          }
          sc.close();
        }
    }
    
