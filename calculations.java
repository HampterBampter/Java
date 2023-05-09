import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Integer.valueOf(scan.nextLine());
        System.out.println("Enter a second number: ");
        int num2 = Integer.valueOf(scan.nextLine());

        int add = num + num2;
        int sub = num - num2;
        int multi = num * num2;
        float divFloat = (float) num / num2;
        int remain = num % num2;

        System.out.println(num + " + " + num2 + " = " + add);
        System.out.println(num + " - " + num2 + " = " + sub);
        System.out.println(num + " * " + num2 + " = " + multi);
        System.out.println(num + " / " + num2 + " = " + divFloat);
        System.out.println(num + " % " + num2 + " = " + remain);
    }
}