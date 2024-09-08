import java.util.*;

class Diamond {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();

        //upper half
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int stars= 2*i-1;
            for (int j=1; j<=stars ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //lower half
        for (int i=n; i>=1; i--){
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            int stars= 2*i-1;
            for (int j=1; j<=stars ; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
