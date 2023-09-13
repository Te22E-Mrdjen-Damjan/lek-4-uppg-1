import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
      int tal1=7;
      int tal2=10;



      int kvot1=tal1/tal2;
      double kvot2=(double)tal1/tal2;
    System.out.println("kvoten är"+kvot1);
    System.out.println("kvoten är"+kvot2);

    Scanner fortnite=new Scanner(System.in);
    System.out.println("Ange ett substantiv");
    String substantiv=fortnite.nextLine();
    System.out.println("Ange pluralhändelse");
    String plural=fortnite.nextLine();
    System.out.println("En " +substantiv+ " flera " +substantiv+plural);
    }
}
