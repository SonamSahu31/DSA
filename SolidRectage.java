package pattern;

public class SolidRectage {
    public static void main(String[] args){
        int n = 3; //Number of rows
        int m = 5; //Number of columns
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }

    }
    
}
