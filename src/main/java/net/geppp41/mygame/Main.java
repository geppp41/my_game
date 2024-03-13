import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("hello");
    String output = input.nextLine();
    System.err.println("you said " + output);
  }
}