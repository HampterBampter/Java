import java.util.Scanner;
public class boilingWater {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number greater than 212:");
        int num = Integer.valueOf(scan.nextLine());
        int boil = 212;
        if (num > boil){
            System.out.println("Water is boiling");
        } else {
            System.out.println("Please enter a whole number");
        }
    }
}

class numberComparison {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = Double.valueOf(scan.nextLine());
        System.out.println("Enter another number: ");
        double num2 = Double.valueOf(scan.nextLine());

        if (num == num2){
            System.out.println("Numbers are the same");
        } else if (num > num2){
            System.out.println("The first number was larger than the second");
        } else{
            System.out.println("The second number was larger than the first");
        }

    }
}

class testScores{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name a number between 0 and 100");
        double num = Double.valueOf(scan.nextLine());

        if (num <= 100 && num >= 90){
            System.out.println("Your grade is an A");
        } else if (num >= 80){
            System.out.println("Your grade is a B");
        }else if (num >= 70){
            System.out.println("Your grade is a C");
        }else if (num >= 60){
            System.out.println("Your grade is a D");
        }else if (num < 60 && num >= 0){
            System.out.println("Your grade is an F");
        }else {
            System.out.println("Please enter a value between 0 and 100");
        }
    }
}

class sameOrNah{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word:");
        String word = scan.nextLine();
        System.out.println("Enter another word:");
        String word2 = scan.nextLine();

        if (word.equals(word2)){
            System.out.println("The words are the same");
        }else{
            System.out.println("The words are not the same");
        }
    }
}
