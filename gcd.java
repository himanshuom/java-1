import java.util.Scanner;

public class gcd {

    public static void checkGcd(int n1, int n2){
        while (n1!=n2){
            if (n1>n2){
                n1= n1-n2;
            }else {
                n2= n2-n1;
            }
        }
        System.out.print("GCD is: "+ n2);
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n1:");
        int n1 = sc.nextInt();
        System.out.print("Enter n2:");
        int n2 = sc.nextInt();
         checkGcd(n1,n2);
    }
}
