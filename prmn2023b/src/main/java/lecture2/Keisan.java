package lecture2;

public class Keisan {
    int sum = 0;
    int goukei(int[] num){
        for(int i = 0; i < num.length; i++){
            sum += num[i];
        }
        return sum;
    }

    String hyouka(){
        if(sum >= 100){
            return "great!!";
        } else if(sum >= 50){
            return "big";
        } else {
            return "small";
        }
    }
}
