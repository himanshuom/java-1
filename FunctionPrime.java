import java.util.Scanner;

public class FunctionPrime {
    public static int checkPrime(int n){
        int count=0;
        for (int i=1; i<=n; i++){
           if (n%i==0){
               count++;
           }
       }
        if (count==2){
            System.out.println("Number is Prime");
        }
        else {
            System.out.println("Number is not prime");
        }
        return n;
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n= sc.nextInt();
        sc.close();

        checkPrime(n);
    }
}
