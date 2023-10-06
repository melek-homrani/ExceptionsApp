/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * @author Melek Homrani
 */


public class AppelMethod {

    public void method1() {
        this.method2();
    }

    public void method2() {
        this.method1();
    }

    public static void main(String[] args) {

        try {
            AppelMethod a = new AppelMethod();
            a.method1();
        } catch (StackOverflowError e) {
            System.out.println("StackOverflowError");
        }
    }


}
