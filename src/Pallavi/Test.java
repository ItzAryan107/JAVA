package Pallavi;

import java.util.Scanner;

class Test {
    int sum(int a,int b){
        int c = a+b;
        return c;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two integer --->");
        Test t= new Test();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int summation = t.sum(a,b);
        System.out.println("Answer ---> "+summation);
    }
}
