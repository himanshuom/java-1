import java.util.*;

class Butterfly {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Give a number:");
        int n= sc.nextInt();

        // upper part
        for(int i=1; i<=n; i++){
            //1st part *
            for(int j=1; j<=i;j++) {
                if (i==1|| j==1|| i==j ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //spaces
            int spaces= 2*(n-i);
            for (int j=1;j<=spaces ; j++){
                System.out.print(" ");
            }
            //2nd part *
            for (int j=1; j<=i;j++){
                if (i==1|| j==1|| i==j ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //lower part
        for(int i=n; i>=1; i--){
            //1st part *
            for(int j=1; j<=i;j++){
                if (i==1|| j==1|| i==j ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            //spaces
            int spaces= 2*(n-i);
            for (int j=1;j<=spaces ; j++){
                System.out.print(" ");
            }
            //2nd part *
            for (int j=1; j<=i;j++){
                if (i==1|| j==1|| i==j ) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }



    }
}