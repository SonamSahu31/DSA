package recursion;
import java.util.Scanner;

public class OnetoN {
    public static void printNumbers(int n){
        if(n==0){ // Base case: if n is 0, return
            return;
        }
        printNumbers(n-1);
        System.out.print(n + " "); 
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n =sc.nextInt();
        printNumbers(n);
        System.out.println();
    }
    
}
