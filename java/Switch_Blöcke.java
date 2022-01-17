import java.util.Scanner;


public class Switch_Blöcke {
    public static void main(String[] args) {
        System.out.println("Welchen Monat haben wir");
        Scanner Monat = new Scanner(System.in);

        int month = Monat.nextInt();

        switch(month){
            case 1: System.out.println("Januar"); break;
            case 2: System.out.println("Februar"); break;
            case 3: System.out.println("März"); break;
            case 4: System.out.println("April"); break;
            default: System.out.println("Anderer Monat"); break;
        }

    }
    
}
