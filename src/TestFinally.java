import java.io.IOException;

public class TestFinally {

    public static void main(String[] args) {

        try {
            System.out.println("entrer votre code ");
            // traiter cette exception
            int x = System.in.read();

        } catch (IOException e) {
            System.out.println("Merci de votre visite");
        } finally {
            // afficher toujours le message "Merci de votre visite"
            System.out.println("Merci de votre visite");
        }

    }

}


