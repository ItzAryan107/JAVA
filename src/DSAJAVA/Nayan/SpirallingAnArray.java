package DSAJAVA.Nayan;

import java.util.Scanner;

public class SpirallingAnArray {
    int[][] array;
    int x,y,n;
    SpirallingAnArray(){
        n = input();
    }

    public void indexing(){

    }
    public int input(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter size of square matrix ---> ");
        int n = scanner.nextInt();
        array = new int[n][n];
        System.out.println();
        System.out.println("Enter all the element of array --->");
        for (int i=0;i< array.length;i++){
            for (int j=0;j<array[i].length;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        return n;
    }

    public void output(){

        int[][] arrayOutput = new int[n][n];
        for (int i=0;i< array.length;i++){
            for (int j = 0;j<array[i].length;j++){
                System.out.println(array);
            }
            System.out.println();
        }
    }

//    public void print(){
//
//        for (int[] ints : array) {
//            int j = 0;
//            for (; j < ints.length - 1; j++) {
//                System.out.print(ints[j] + " ");
//            }
//            System.out.println(ints[j]);
//        }
//    }

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        System.out.print("Enter Length of Array ---> ");
//        SpirallingAnArray spirallingAnArray = new SpirallingAnArray(sc.nextInt());
//        spirallingAnArray.input();
//        spirallingAnArray.print();
    }
}
