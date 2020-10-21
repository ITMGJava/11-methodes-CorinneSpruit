import java.util.Scanner;

public class Methodes {
static String gebruiker;

    public static void main (String[] arg){

        helloWorld();
        groet();

        System.out.println("Wie ben jij?");

        var x  = new Scanner(System.in);
        var naam = x.nextLine();

        groet(naam);



    }

    private static void groet(String naam) {

        System.out.println("Hallo "+naam);

    }


    private static void groet() {
        System.out.println("Hallo User!");
    }

    private static void helloWorld() {
        System.out.println("Hello World!");
    }


}
