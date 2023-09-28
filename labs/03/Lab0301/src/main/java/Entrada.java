/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tania
 */
import java.util.Scanner;

public class Entrada {
    private static Scanner input = new Scanner(System.in);

    public static int readInt(String mss) {
        System.out.print(mss);
        return input.nextInt();
    }

    public static String readText(String mss) {
        System.out.print(mss);
        input.nextLine(); // Consume la nueva línea pendiente después de leer un entero.
        return input.nextLine();
    }
}


