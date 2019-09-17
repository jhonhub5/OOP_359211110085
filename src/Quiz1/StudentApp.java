package Quiz1;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print(" กรุณากรอกชื่อ : ");
        String a = sc.nextLine();
        System.out.print(" กรุณารหัสนักศึกษา : ");
        String b = sc.nextLine();
        System.out.print(" กรุณาสาขา : ");
        String c = sc.nextLine();

        System.out.print(" กรุณากรอกเกรดวิชา A : ");
        String s1 = sc.nextLine();

        double g1 = 0.00;
        if (s1.equals("A")){
             g1 = 4.00; }
        else if (s1.equals("B+")){
             g1 = 3.5; }
        else if (s1.equals("B")){
             g1 = 3; }
        else if (s1.equals("C+")){
             g1 = 2.5; }
        else if (s1.equals("C")){
             g1 = 2;}
        else if (s1.equals("D+")){
             g1 = 1.5; }
        else if (s1.equals("D")){
             g1 = 1; }
        else if (s1.equals("F")){
             g1 = 0; }

        else System.out.print("0.00");



        System.out.print(" กรุณากรอกเกรดวิชา B : ");
        String s2 = sc.nextLine();
        double g2 = 0.00;
        if (s2.equals("A")){
            g2 = 4.00; }
        else if (s2.equals("B+")){
            g2 = 3.5; }
        else if (s2.equals("B")){
            g2 = 3; }
        else if (s2.equals("C+")){
            g2 = 2.5; }
        else if (s2.equals("C")){
            g2 = 2; }
        else if (s2.equals("D+")){
            g2 = 1.5; }
        else if (s2.equals("D")){
            g2 = 1; }
        else if (s2.equals("F")){
            g2 = 0; }

        else System.out.print("0.00");

        System.out.print(" กรุณากรอกเกรดวิชา C : ");
        String s3 = sc.nextLine();
        double g3 = 0.00;
        if (s3.equals("A")){
            g3 = 4.00; }
        else if (s3.equals("B+")){
            g3 = 3.5; }
        else if (s3.equals("B")){
            g3 = 3; }
        else if (s3.equals("C+")){
            g3 = 2.5; }
        else if (s3.equals("C")){
            g3 = 2; }
        else if (s3.equals("D+")){
            g3 = 1.5; }
        else if (s3.equals("D")){
            g3 = 1; }
        else if (s3.equals("F")){
            g3 = 0; }
        else System.out.print("0.00");
        double gpa = (g1+g2+g3)/3;




        Student std1 = new Student(a,b,c,gpa);
         System.out.print(std1.Show());












    }//main
}//class
