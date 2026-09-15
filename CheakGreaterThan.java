package String;
import java.util.Scanner;

public class CheakGreaterThan {
    public static void main(String[] args){
        System.out.println("Enter your string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()<=5){
            System.out.println("The string is  less than or equals to 5");
        }
        else{
            System.out.println("The string is greater than 5");
        }
    }
    
}
