public class TowerofHanoi {
    public static void towerofHanoi(int n , String src, String helper, String des){
        if(n==1){
            System.out.println("transfer disk "+ n + " from " + src + " to " + des);
            return;
        }
        towerofHanoi(n-1, src, des, helper);
        System.out.println("transfer disk "+ n + " from " + src + " to " + des);
        towerofHanoi(n-1, helper, src , des);
    }

    public static void main(String[] args) {
        int n =3;
        towerofHanoi(n , "A", "B", "C");
    }
}
