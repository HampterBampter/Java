import java.util.Scanner;

public class takeABreak {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to take a break?");
         String text = "yes";

         while (true){
             String input = scan.nextLine();
             if (input.equals(text)){
                 break;
             } else{
                 System.out.println("Do you want to take a break?");
                continue;
             }
         }
    }
}

class stopAtFive{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        double num = 5;

        while (true){
            double input = Double.valueOf(scan.nextLine());
            if (input == num){
                break;
            } else{
                System.out.println("Give a number:");
                continue;
            }
        }
    }
}

class positiveNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        double num = 0;

        while (true){
            double input = Double.valueOf(scan.nextLine());
            if (input < num){
                System.out.println("Number must be a positive number");
            } else if (input > num){
                System.out.println("Number is " + input);
            } else if (input == num) {
                break;
            } else{
                System.out.println("Enter a number:");
                continue;
            }
        }
    }
}

class countToEleven{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number less than 11");
        int num = 11;
        int i = Integer.valueOf(scan.nextLine());

        while(i <= num){
            System.out.println(i);
            i++;
            if (i - 1 == num){
                break;
            }
        }
    }
}

class Multiplication{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a number: ");
        int i = 1;
        int num = Integer.valueOf(scan.nextLine());
        while (i<=10){
            System.out.println(num + " x " + i + " = " + i*num);
            i++;
        }
    }
}