/*Tania Sofia Torres Romero Quiz 1*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        for (int i=1; i<=n; i++){
            if (i % 3 == 0 && i % 5 == 0){
            System.out.println("fizzbuzz");    
            }else if (i % 3 == 0){
            System.out.println("fizz"); 
            }else if (i % 5 == 0){
            System.out.println("buzz");    
            }else{
            System.out.println(i);
            }
        }
        scanner.close();
    }
}
