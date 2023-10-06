
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Melek Homrani
 */


public class DivisionExecption {


    static int x = 20;
    static int y;

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Enter un entier: ");
            y = scanner.nextInt();
            System.out.println("result= "+x / y);
        } catch (ArithmeticException e) {
            System.out.println("Division par zero");
        }
    }


}
