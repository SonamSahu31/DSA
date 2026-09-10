import java.util.Scanner;
public class CompareNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter first number:");
        num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        num2 = sc.nextInt();
        if(num1 > num2){
            System.out.println("The first nuber is greater then the second number");
        }

        else if(num1 < num2){
            System.out.println("The secone number is grater than the first number");
        }

        else{
            System.out.println("Both are equal");
        }

    }
    
}
