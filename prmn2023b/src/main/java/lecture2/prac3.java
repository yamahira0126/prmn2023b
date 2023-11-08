package lecture2;
import java.util.Scanner;

public class prac3 {
    public static void main(String[] args) {
        String[] number = new String[2];

        Scanner scan = new Scanner(System.in);

        System.out.print("学籍番号を入力して下さい:");
        number[0] = scan.next();
        System.out.print("パスワードを入力して下さい:");
        number[1] = scan.next();

        Password pass = new Password();
        pass.check(number);
    }
}
