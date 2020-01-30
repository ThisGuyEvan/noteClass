import java.util.*;

class Main {

  public static ArrayList<String> items = new ArrayList<String>();

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What's your name?");

    String name = input.next();
    notes reminder = new notes(name);


    reminder.add(3);
    System.out.println(reminder.items());
    reminder.add(2);
    System.out.println(reminder.items());
    reminder.remove(3);
    System.out.println(reminder.items());
  }


}