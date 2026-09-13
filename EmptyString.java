package String;
import java.util.Scanner;

public class EmptyString {
    public static void main(String[] args){
        System.out.println("Enter your string:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();// Read the input string from the user

        if(str.isEmpty()){
            System.out.println("The string is empty");
        }
        else{
            System.out.println("The string is not empty");
        }
    }
    
}
