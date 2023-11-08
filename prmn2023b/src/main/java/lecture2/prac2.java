package lecture2;
import java.util.Scanner;

public class prac2 {
    public static void main(String[] args) {

        int[] num = new int[5];
        int x = 0;
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.print("数字" + (i + 1) + "つ目");
            num[i] = scan.nextInt();
            System.out.println();
        }

        Keisan k = new Keisan();

        System.out.print("合計値:" + k.goukei(num));
        System.out.print("  " + k.hyouka());
    }
}
