package verusuche_einfacher_rechner;
import java.util.Scanner;

public class Rechner {
    public static void main(String[] args) {
        Scanner rechenform = new Scanner(System.in);
        System.out.println("Möchtest du Plus, Minus, Mal oder Geteilt rechnen?");

        String rechenart = rechenform.nextLine();
        Plus();


        
    }

    public static int Plus(int number1, int number2) {
        return number1 + number2;
    }

    public static int Minus(int number1, int number2) {
        return number1 - number2;
    }

    public static int Mal(int number1, int number2) {
        return number1 * number2;
    }

    public static int Geteilt(int number1, int number2) {
        return number1 / number2;
    }

    
}
