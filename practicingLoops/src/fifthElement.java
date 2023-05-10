import java.util.Scanner;
import java.util.ArrayList;

public class fifthElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter a string:");

       while(true){
           String text = scan.nextLine();
           if (text.equals("")){
               String fifth = list.get(4);
               System.out.println("The fifth item in the list is: " + fifth);
               break;
           } else {
               list.add(text);
               System.out.println("Enter another string");
           }
       }
    }
}