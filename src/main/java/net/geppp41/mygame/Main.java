import java.util.Scanner;
import player_scripts.player;
import items.game_Items;
@SuppressWarnings("unused")
public class Main {
  public static void main(String[] args) {
    //Scanner input = new Scanner(System.in);
    //System.out.println("hello");
    //String output = input.nextLine();
    //System.err.println("you said " + output);
    
    @SuppressWarnings("resource")
    Scanner e = new Scanner(System.in);
    System.out.print("Whats your name: ");
    player player = new player(e.nextLine());//creats player
    
  }
}