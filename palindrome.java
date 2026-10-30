package geeks;

public class palindrome {
    public static boolean isPalindrome(int n){
        int original = n;
        int reversed = 0;

        while(n>0){
            int digit = n%10;
            reversed = reversed*10 + digit;
            n/=10;
        }
        return original == reversed;
    }
     public static void main(String[] args){
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        boolean result = isPalindrome(n);
        if(result){
            System.out.println(n + " is a palindrome.");
        }
        else{
            System.out.println(n + " is not a palindrome.");
        }
     }    
    
}
