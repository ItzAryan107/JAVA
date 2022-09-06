package Pallavi;

public class Magical {

    void magical(int a){
        while (a>0) {
            int sum = 0;
            while (a > 0) {
                sum = sum + a % 10;
                a = a / 10;
            }
            if (sum == 0 || sum == 1) {
                System.out.println("Magical Number!");
                return;
            }else if (sum>1 && sum<10){
                System.out.println("Not A Magical number");
                return;
            }
            a = sum;
        }
    }

    public static void main(String[] args) {
        Magical m=new Magical();
        m.magical(121);
    }
}
