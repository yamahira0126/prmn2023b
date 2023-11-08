package lecture2;

public class Password {

    String pass[][] = {
            {"B2222000", "B2222100", "B2222200", "B2222300", "B2222400"},
            {"0000", "1111", "2222", "3333", "4444"}
    };

    void check(String number[]){
        for(int i = 0; i < pass[0].length; i++){
            if(pass[0][i].equals(number[0])){
                if(pass[1][i].equals(number[1])){
                    System.out.println("ログイン完了");
                    System.exit(0);
                }
                System.out.println("不正アクセス");
                System.exit(0);
            }
        }
        System.out.println("error!!");
        return;
    }
}
