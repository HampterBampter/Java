import java.sql.SQLOutput;
import java.time.Year;
import java.util.Scanner;

public class chatBot {
    public static void main(String[] args) {
        String name = greeting();

        greeting();
        repeat(name);
        ageQuestions();
        count();
        test();
    }

    public static String greeting() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello there!\nWhat's your name?");
        String name = scan.nextLine();
        return name;
    }

    public static void repeat(String name) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I'm sorry, I didn't catch that. Can you repeat your name for me?");
        String name2 = scan.nextLine();

        if (name2.equals(name)) {
            System.out.println("Nice to meet you, " + name2 + "!");
        } else {
            System.out.println("Nice to meet you, " + name2 + ", or should I say " + name + "...");
        }
    }


    public static void ageQuestions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play a game! I'll ask you questions and then you answer yes or no. At the end, I'll guess your age!");
        System.out.println("Do you have a job?");
        String job = scan.nextLine();
        System.out.println("Are you retired?");
        String retired = scan.nextLine();
        System.out.println("Do you own a motor vehicle?");
        String vehicle = scan.nextLine();
        System.out.println("Do you own a home?");
        String home = scan.nextLine();
        System.out.println("Do you pay rent?");
        String rent = scan.nextLine();
        System.out.println("Do you have kids?");
        String kids = scan.nextLine();
        System.out.println("Is pop one of your favorite music genres?");
        String pop = scan.nextLine();
        System.out.println("Do you like Pillow Pets?");
        String pillowPets = scan.nextLine();

        if (retired.equals("yes")) {
            System.out.println("Are you 70?");
        } else if (kids.equals("yes")) {
            System.out.println("Are you 45?");
        } else if (home.equals("yes")) {
            System.out.println("are you 30?");
        } else if (rent.equals("yes")) {
            System.out.println("Are you 22?");
        } else if (job.equals("yes")) {
            System.out.println("are you 18?");
        } else if (pop.equals("yes")) {
            System.out.println("Are you 14?");
        } else if (pillowPets.equals("yes")) {
            System.out.println("Are you 10?");
        }
        System.out.println("Ok, final age related question. What year were you born?");
        int born = Integer.valueOf(scan.nextLine());
        int yearNow = Year.now().getValue();
        int age = yearNow - born;
        System.out.println("You are " + (age - 1) + "-" + age + " years old!");
    }


    public static void count() {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number and I'll count up to it from zero.");
        int count = Integer.valueOf(scan.nextLine());
        for (int i = 0; i <= count; i++) {
            if (i < count) {
                System.out.print(i + "...");
            } else {
                System.out.println(i + "!! The end!! :)");
            }
        }
    }

    public static void test() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Now I'll have you take a test. Respond with either a, b, c, or d.");
        System.out.println("What four parts make up a for loop?\n    " +
                "a. a variable, a condition, a counter variable, and its functionality\n    " +
                "b. a variable, a condition, a counter variable, and its functionality\n    " +
                "c. a variable, a condition, a counter variable, and its functionality\n    " +
                "d. a variable, a condition, a counter variable, and its functionality");

        while (true) {
            String letter = scan.nextLine();
            if (letter.equals("b")) {
                System.out.println("You are correct!");
                break;
            } else if (letter.equals("a") || letter.equals("c") || letter.equals("d")) {
                System.out.println("Sorry, that is incorrect. I'll allow you to choose another answer.");
            } else {
                System.out.println("Only enter a single letter from the question list. (a, b, c, or d)");
                continue;
            }
        }
    }
}