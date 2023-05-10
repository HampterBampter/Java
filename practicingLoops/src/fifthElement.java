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

class howLarge{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter a string:");

        while(true){
            String text = scan.nextLine();
            if (text.equals("")){
                int size = list.size();
                System.out.println("The total amount of items in the list was: " + size);
                break;
            } else {
                list.add(text);
                System.out.println("Enter another string");
            }
        }
    }
}

class lastItem{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
        System.out.println("Enter a string:");

        while(true){
            String text = scan.nextLine();
            if (text.equals("")){
                int size = list.size();
                String last = list.get(size-1);
                System.out.println("The last item in the list is: " + last);
                break;
            } else {
                list.add(text);
                System.out.println("Enter another string");
            }
        }
    }
}

class indexOfInteger{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter an integer:");

        while(true){
            int num = Integer.valueOf(scan.nextLine());
            if (num == 0) {
                System.out.println("Done entering integers into the list");
                break;
            } else {
                list.add(num);
                System.out.println("Enter another integer");
            }
        }
        System.out.println("What number are you looking for in the list?");
        int search = Integer.valueOf(scan.nextLine());
        for(int i = 0; i < list.size(); i++){
            if(search == list.get(i)){
                System.out.println(search + " is at index " + i);
            }
        }
    }
}

class sumOfList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("Enter an integer:");

        while (true) {
            int num = Integer.valueOf(scan.nextLine());
            if (num == 0) {
                System.out.println("Done entering integers into the list");
                for (int i = 0; i < list.size(); i++){
                    if (i < list.size()-1){
                            System.out.print(list.get(i) + ", ");
                    } else {
                        System.out.println("and " + list.get(i) + " were the items in the list. The sum of that list is: ");
                        System.out.println(sum(list));
                    }
                }
                break;
            } else {
                list.add(num);
                System.out.println("Enter another integer");
            }
        }
    }

    public static int sum(ArrayList<Integer> list) {
        int add = 0;
        for (int i = 0; i < list.size(); i++) {
            add += list.get(i);
        } return add;
    }
}