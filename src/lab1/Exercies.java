package lab1;
//Testing upload to github
        import java.util.Scanner;

public class Exercies {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("กรอกค่าฐาน: ");
        int x = scanner.nextInt();

        System.out.print("กรอกค่าความสูง: ");
        int y = scanner.nextInt();

        System.out.println("พื้นที่สามเหลี่ยมเท่ากับ"+(0.5*x*y));



    }//main
}//class
