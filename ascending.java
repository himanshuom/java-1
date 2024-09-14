import java.util.Scanner;

public class ascending {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Size of numbers:");
        int size= sc.nextInt();
        int Numbers[]= new int[size];

        for (int i=0; i<size; i++){
            Numbers[i]= sc.nextInt();
        }

        boolean isAscending= true;

        for (int i=0; i<Numbers.length-1; i++){
            if (Numbers[i]>Numbers[i+1]){
                isAscending= false;
            }
        }
        if(isAscending){
            System.out.println("Array is sorted in ascending order");
        }else {
            System.out.println("Array is not sorted");
        }

    }
}
