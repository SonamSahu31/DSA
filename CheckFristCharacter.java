package String;
import java.util.Scanner;

public class CheckFristCharacter {
    public static void main(String[] args){

        System.out.println("Enter your string:");
        Scanner sc = new Scanner(System.in);// Create a Scanner object to read input from the user
        char ch = sc.next().charAt(1); // Read the first character of the input string from the user

        if(ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' ||
              ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'
        ){
             System.out.println("The first character is vowel");
        }
        else{
            System.out.println("The first character is not vowel");
        }
    }
}