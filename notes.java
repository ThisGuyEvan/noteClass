import java.util.*;

public class notes{

  private String person;
  
  public notes(String person){
    this.person = person;
  }


  public String items(){
    String inventory  = "_______________\n" + person + "'s items:\n_______________\n";
    if (Main.items.size() <= 0){
      inventory = "There are currently no notes/reminders set.";
    }
    else{
      for (int i = 0; i < Main.items.size()-1; i++){
        inventory += "[" + (i+1) + "] " + Main.items.get(i) + ".\n";
      }
      inventory += "[" + Main.items.size() + "] " +Main.items.get(Main.items.size()-1) + ".\n";
    }

    return inventory;
  }

  public void add(int num){
    Scanner console = new Scanner(System.in);
    for (int i = 0; i < num; i++){
      System.out.print("Add: ");
      Main.items.add(Main.items.size(), console.next());
      System.out.println();
    }
    
  }

  public void remove(int num){
    Scanner console = new Scanner(System.in);
    int x = Main.items.size();
    for (int i = 0; i < num; i++){
      System.out.print("Remove: ");
      String hold = console.next();
      for (int j = 0; j < Main.items.size(); j++){
        if (Main.items.get(j).equalsIgnoreCase(hold)){
          Main.items.remove(j);
          break;
        }
      }
      if (Main.items.size() == x){
        System.out.println("The item that you've prompted does not exist within the inventory.\n\tRemoves left: " + (num - i+1));
        
      }
      else{
        x--;
      }
    }
  }
  


}