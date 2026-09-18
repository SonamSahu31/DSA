package pattern;

public class sonam {
    public static void main(String[] args) {
        // S pattern
        for(int i=0; i<5; i++) {
            if(i==0 || i==2 || i==4) {
                System.out.println(" * * * ");
            } else if(i==1) {
                System.out.println("*");
            } else {
                System.out.println("      *");
            }
        }
        
        // O pattern
        for(int i=0; i<5; i++) {
            if(i==0 || i==4) {
                System.out.println(" * * * ");
            } else {
                System.out.println("*     *");
            }
        }
        
        // N pattern
        for(int i=0; i<5; i++) {
            System.out.print("*");
            for(int j=0; j<5; j++) {
                if(j==4) {
                    System.out.print("*");
                } else if(j==i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // A pattern
        for(int i=0; i<5; i++) {
            for(int j=0; j<5; j++) {
                if(i==0 && j>0 && j<4) {
                    System.out.print("*");
                } else if(i==2) {
                    System.out.print("*");
                } else if(j==0 || j==4) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        
        // M pattern
        for(int i=0; i<5; i++) {
            System.out.print("*");
            for(int j=0; j<5; j++) {
                if(j==4) {
                    System.out.print("*");
                } else if(i==j && j<=2) {
                    System.out.print("*");
                } else if(i+j==4 && j>=2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
