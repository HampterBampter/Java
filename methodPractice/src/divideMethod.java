import java.util.Scanner;

public class divideMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = Double.valueOf(scan.nextLine());
        System.out.println("Enter another number");
        double num2 = Double.valueOf(scan.nextLine());
        double result = divide(num, num2);
        System.out.println(num + " / " + num2 + " = " + result);
    }
    public static double divide(double n,double n2){
        double result = n / n2;
        return result;
    }
}

class methodReturnTypes{
    public static void main(String[] args) {
       String text = returnString();
       int integer = returnInt();
       boolean boo = returnBoo();
        System.out.println(text);
        System.out.println(integer);
        System.out.println(boo);
    }
    public static String returnString(){
        return "In Glam Sally's next social media post, there will be a code. Enter that code for a discount on our shops website for 20% off!";
    }
    public static int returnInt(){
        return 20;
    }
    public static boolean returnBoo(){
        return true;
    }
}

class averageMethod{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        double num = Double.valueOf(scan.nextLine());
        System.out.println("Enter another number");
        double num2 = Double.valueOf(scan.nextLine());
        System.out.println("Enter a third number");
        double num3 = Double.valueOf(scan.nextLine());

        double avg = average(num, num2, num3);
        System.out.println("The average is: " + avg);
    }
    public static double sum(double n, double n2, double n3){
        return n + n2 + n3;
    }
    public static double sum(double n, double n2, double n3, double n4){
        double num = n + n2 + n3 + n4;
        return num;
    }
    public static double average(double n, double n2, double n3){
        double sum = sum(n, n2, n3);
        double sum2 = sum / 3.0;
        return sum2
    }
}