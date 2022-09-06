package DSAJAVA.VIT.DSA.TheoryClasses;

import java.util.Scanner;

public class HashProblem {
    int[] array;

    public int biggestNumber(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter length of array ---> ");
        array = new int[sc.nextInt()];
        System.out.println();
        int big = 0;
        System.out.println("Enter your all Element --->");
        for (int i = 0;i< array.length;i++){
            array[i] = sc.nextInt();
            if (array[i]>big)
                big=array[i];
        }
        return big;
    }

    public void solution(){
        int big = biggestNumber();
        while (big!=0){
            for (int i = 0;i<array.length;i++){
                if (big<=array[i]){
                    if (i == array.length-1)
                        System.out.print("#");
                    else
                        System.out.print("# ");
                }else {
                    if (i == array.length-1) {
                        System.out.print(" ");
                    }
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
            big = big - 1;
        }
        for (int i = 0;i< array.length;i++){
            if (array.length-1 == i)
                System.out.print("-");
            else
                System.out.print("- ");
        }
    }

    public static void main(String[] args) {
        HashProblem hashProblem = new HashProblem();
        hashProblem.solution();
    }
}
