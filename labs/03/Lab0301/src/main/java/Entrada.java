import java.util.Scanner;

public class Entrada {
   private static Scanner input = new Scanner(System.in); 
   
   public static int readInt(String mss){
      System.out.print(mss);
      return input.nextInt();
   }
   
   public static String readText(String mss){
       System.out.print(mss);
       return input.nextLine();
   }
}
