import java.util.Scanner;
public class powerlogn {

    public static int calPower(int x, int n){
        if (n ==0){
            return 1;
        }
        if (x == 0){
            return 0;
        }
        if (n % 2 == 0){
            return calPower( x , n/2) * calPower(x , n/2);
        } else {
            return calPower(x , n/2) * calPower(x , n/2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("value of x:");
        int x = sc.nextInt();
        System.out.print("Value of n:");
        int n = sc.nextInt();
        int output = calPower(x ,n);
        System.out.println("Power of x^n is:"+ output);
    }
}
