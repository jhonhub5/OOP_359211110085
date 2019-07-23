package lab2;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("ชื่อ-นามสกุล: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("หมายเลขประจำตัวประชาชน: ");
        String number = scanner.nextLine();
        System.out.println(number);

        System.out.print("ที่อยู่: ");
        String tu = scanner.nextLine();
        System.out.println(tu);

        System.out.print("อีเมล: ");
        String mail = scanner.nextLine();
        System.out.println(mail);

        System.out.print("หมายเลขเบอโทรศัพท์: ");
        String telephonnumber = scanner.nextLine();
        System.out.println(telephonnumber);


    }//main
}//class
