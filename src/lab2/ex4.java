package lab2;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        int num [][] = new int[2][3];
        input (num);
        output (num);

        average (num);


    }//main

    private static void max(int[][] num){

        int max = num [0][0];

        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++){

                if (max < num[i][j]);{
                    max = num[i][j];
                }


            }
        }
        System.out.println("Maximum: "+max);
    }


    private static void average(int[][] num) {
        int total = 0 ;
        int count = 0;

        int x = num.length * num [0].length;

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length ; j++) {

                total += num[i][j];
                count++;

            }

        }
        System.out.println("Average: "+(total/count));
        System.out.println("Average: "+(total/x));


    }

    private static void output(int[][] num) {

        System.out.println("Data in array");

        for (int i = 0; i < num.length ; i++) {
            for (int j = 0; j < num[i].length ; j++) {
                System.out.print(num[i][j]+"\t");

            }
        }

    }

    private static void input(int[][] num) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++) { //loop row
            for (int j = 0; j < num[i].length; j++) { //loop colum

                System.out.println("Enter num[" + i + "][" + j + "]: ");
                num[i][j] = sc.nextInt();


            }

        }
    }
}//class
