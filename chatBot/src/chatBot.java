import java.sql.SQLOutput;
import java.time.Year;
import java.util.Scanner;

public class chatBot {
    public static void main(String[] args) {
        String name = greeting();
        repeat(name);
        ageQuestions();
        funFact();
        try{
            count();
        }catch(InterruptedException ex){
            System.out.println("Something went wrong: " + ex);
        }
        test();
        System.out.println("It was fun chatting with you " + name + ", but now I gotta go like and share all of Glam Sally's posts. Bye bye! :)");
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
        System.out.println("Let's play a game! I'll ask you questions and then you answer 'yes' or 'no'. At the end, I'll guess your age!");
        System.out.println("Do you have a job?");
        String job = scan.nextLine().toLowerCase();
        System.out.println("Are you retired?");
        String retired = scan.nextLine().toLowerCase();
        System.out.println("Do you own a motor vehicle?");
        String vehicle = scan.nextLine().toLowerCase();
        System.out.println("Do you own a home?");
        String home = scan.nextLine().toLowerCase();
        System.out.println("Do you pay rent?");
        String rent = scan.nextLine().toLowerCase();
        System.out.println("Do you have kids?");
        String kids = scan.nextLine().toLowerCase();
        System.out.println("Is pop one of your favorite music genres?");
        String pop = scan.nextLine().toLowerCase();
        System.out.println("Do you like Pillow Pets?");
        String pillowPets = scan.nextLine().toLowerCase();

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
        if(scan.nextLine().toLowerCase().equals("no")){
            System.out.println("Ok, final age related question. What year were you born?");
            int born = Integer.valueOf(scan.nextLine());
            int yearNow = Year.now().getValue();
            int age = yearNow - born;
            System.out.println("You are " + (age - 1) + "-" + age + " years old!");
        }
    }


    public static void count() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("give me a number and I'll count up to it from zero.");
        int count = Integer.valueOf(scan.nextLine());
        while(count < 1){
            System.out.println("Please give me a positive number! Try again: ");
            count = Integer.valueOf(scan.nextLine());
        }
        while(count > 100){
            System.out.println("I'm sorry, my mommy only taught me how to count up to 100, please give me another number. Try again:");
            count = Integer.valueOf(scan.nextLine());
        }
        for (int i = 0; i <= count; i++) {
            if (i < count) {
                System.out.print(i + "...");
                Thread.sleep(500);

            } else {
                System.out.println(i + "!! The end!! Thank you for waiting :)");
            }
        }
    }

    public static void test() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Now I'll have you take a test. Respond with either a, b, c, d or e.");
        System.out.println("What parts make up a for loop?\n    " +
                "a. a variable, a condition, and its functionality\n    " +
                "b. a variable, a condition, a counter variable, and its functionality\n    " +
                "c. a variable, its functionality, a return statement, and a break \n    " +
                "d. three keywords ('public', 'static' and the return type), a name, parenthesis and its functionality \n    " +
                "e. Glam Sally has been here");

        while (true) {
            String letter = scan.nextLine().toLowerCase();
            if (letter.equals("b")) {
                System.out.println("You are correct!");
                break;
            } else if (letter.equals("a") || letter.equals("c") || letter.equals("d")) {
                System.out.println("Sorry, that is incorrect. I'll allow you to choose another answer.");
            } else if (letter.equals("e")){
                System.out.println("Oh she has? I'm her #1 fan! Never mind, we're going off topic. I'll allow you to choose another answer.");
            } else {
                System.out.println("Only enter a single letter from the question list. (a, b, c, d or e)");
                continue;
            }
        }
    }

    public static void funFact(){
        Scanner scan = new Scanner(System.in);
        System.out.println("I want to know more about you. What is your favorite day of the week?");
        boolean loop = true;
        while(loop){
            String day = scan.nextLine().toLowerCase();
            switch(day){
                case "monday":
                    System.out.println("Fun fact! Glam Sally's favorite day is also Monday. She's on that grind, y'know?");
                    loop = false;
                    break;
                case "tuesday":
                    System.out.println("I love me some Taco Tuesday. Have you heard about Taco Teresa's in the Twin Cities? Yum!");
                    loop = false;
                    break;
                case "wednesday":
                    System.out.println("That's the new show on Netflix, right? Oh, you mean the day. Yeah, I like that too.");
                    loop = false;
                    break;
                case "thursday":
                    System.out.println("I don't particularly like it, but I get excited because it means the weekend is close!");
                    loop = false;
                    break;
                case "friday":
                case "saturday":
                case "sunday":
                    System.out.println("I love the weekend! I have a lot of free time to check on all of Glam Sally's social media!");
                    loop = false;
                    break;
                default:
                    System.out.println("I'm sorry, I didn't quite understand. Please try again and check for spelling! ;)");
                    break;
            }
        }
    }
}