//Demonstrate  multiple catch statements .

import java.io.*;
import java.lang.*;

class MultiCatch {
    public static void main(String[] args) {
        try {

            int a = args.length;
            System.out.println("No Of Arguments = " + a);
            int b = 42 / a;//Could generate Divide by Zero exception.

            int c[] = {1}; //array initialized with size 1
            c[42] = 99;//Generate Array Out Of Bound exception.
        } catch (RuntimeException e) {
            if(e instanceof ArithmeticException)
                System.out.println("Cannot divide by 0.");
            else if(e instanceof ArrayIndexOutOfBoundsException)
                System.out.println("Array index out-of-bounds.");
            else
                System.out.println("Unknown exception.");
        }
    }

}